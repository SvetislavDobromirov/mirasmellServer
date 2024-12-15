package com.example.mirasmellserver.repository;


import com.example.mirasmellserver.model.client.Client;
import com.example.mirasmellserver.model.shortClient.ShortClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;



@Repository
public class ClientRepositoryImpl implements ClientRepository {
    private String nameCollection = "clients";
    private MongoClient mongoClient;
    private MongoDatabase database;

    private ObjectMapper objectMapperJJJ;



    public ClientRepositoryImpl
            (MongoClient mongoClient) {
        this.mongoClient = mongoClient;
        this.database = this.mongoClient
                .getDatabase("db_clients");
    }




    @Override
    public List<ShortClient> getAllShortClients() {
        System.out.println("Get Short Client");
        var collectionList = database.listCollectionNames();
        List<String> uuidList = new ArrayList<>();
        collectionList.forEach(uuid -> uuidList.add(uuid));

        ObjectMapper objectMapper = new ObjectMapper();
        List<ShortClient> shortClientList = new ArrayList<>(List.of());
        System.out.println("Short Client LIST");
        for (var uuid : uuidList) {
            MongoCollection<Document> collection = database.getCollection(uuid);

            List<Document> documents = collection.find().into(new ArrayList<>());
      //  System.out.println("Количество документов: " + documents.size()); // Вывод количества документов

            if (documents.isEmpty()) {
           //     System.out.println("Коллекция " + uuid + " пуста.");
                continue;
            }

            List<ShortClient> currentClients = documents.stream()
                    .map(doc -> {
                        try {
                            String json = doc.toJson();
                            // Преобразуем JSON строку в объект ShortClient
                            ShortClient shortClient = objectMapper
                                    .readValue(json, Client.class).mapToShortClient();
                            //     ShortClient shortClient = client.mapToShortClient()
                            return shortClient;
                        } catch (Exception e) {
                            e.printStackTrace();  // Печать ошибки для диагностики
                            throw new RuntimeException("Ошибка преобразования документа", e);
                        }
                    }).toList();

            shortClientList.addAll(currentClients);

        }

        System.out.println("Полученные клиенты из коллекции " + shortClientList);
        return shortClientList;

    }

    @Override
    public boolean deleteClientById(String uuid) {
        MongoCollection<Document> collection = database.getCollection(nameCollection);

        // Создаем фильтр для поиска документа по UUID
        Document filter = new Document("uuid", uuid);

        // Пытаемся удалить документ
        DeleteResult result = collection.deleteOne(filter);

        // Если количество удаленных документов больше 0, значит, удаление прошло успешно
        if (result.getDeletedCount() > 0) {
            System.out.println("Клиент с UUID: " + uuid + " успешно удален.");
            return true;
        } else {
            System.out.println("Клиент с UUID: " + uuid + " не найден.");
            return false;
        }
    }


    @Override
    public Optional<Client> getClientById(String uuid) {
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("Get Clieтt");

        MongoCollection<Document> collection = database.getCollection(nameCollection);

        // Используем фильтр для поиска конкретного документа по UUID
        Document document = collection.find(
                Filters.and(
                        Filters.eq("_id", uuid)
                )
        ).first();

        if (document != null) {
            System.out.println(document.toJson());
            try {
                String json = document.toJson();
                // Преобразуем JSON строку в объект Client
                Client client = objectMapper.readValue(json, Client.class);
                System.out.println(client);
                return Optional.of(client); // Возвращаем найденный Client
            } catch (Exception e) {
                e.printStackTrace();  // Печать ошибки для диагностики
                throw new RuntimeException("Ошибка преобразования документа", e);
            }
        } else {
            System.out.println("Документ не найден для UUID: " + uuid);
            return Optional.empty(); // Возвращаем Optional.empty() если документ не найден
        }
    }
    @Override
    public int addClient(Client client) {
        System.out.println("Add Cliemt");
        try {
            var collection = database.getCollection(nameCollection);

            var objectMapper = new ObjectMapper();
            System.out.println(client.getUuid());
            Map<String, Object> map = objectMapper.convertValue(client, Map.class);

            Document newDocument = new Document(map);
            newDocument.put("_id",client.getUuid() );
            System.out.println(newDocument.toJson());
          //  new ObjectId();
            // Фильтр для поиска документа с uuid
            Document filter = new Document("_id", client.getUuid());
            long updatedCount = collection
                    .updateOne(filter, new Document("$set", newDocument)).getModifiedCount();

            if (updatedCount == 0) {
                collection.insertOne(newDocument);
                System.out.println("Document inserted.");
                return 0;
            } else {
                System.out.println("Document updated.");
                return  1;
            }
        } catch (Exception ex) {
            return -1;
        }

    }



    public void showAll() {

        try {
            var collection = database.getCollection(nameCollection);

         //   System.out.println("All documents names" + collection.find() );
            var col =  collection.find();
            for(var doc: col) {
                System.out.println(doc.toJson());
            }

        } catch (Exception ex) {
            System.out.println(ex.getStackTrace() + ex.getMessage());
        }

    }



    public void clearAllCollections() {
        var collectionList = database.listCollectionNames();
        collectionList.forEach(uuid -> {
            MongoCollection<Document> collection = database.getCollection(uuid);
            collection.deleteMany(new Document());
            System.out.println("Collection " + uuid + " cleared.");
        });
    }
}
