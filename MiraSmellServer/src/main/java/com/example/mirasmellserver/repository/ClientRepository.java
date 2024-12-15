package com.example.mirasmellserver.repository;

import com.example.mirasmellserver.model.client.Client;
import com.example.mirasmellserver.model.shortClient.ShortClient;

import java.util.List;
import java.util.Optional;

interface ClientRepository {

        List<ShortClient> getAllShortClients();
        Optional<Client> getClientById(String uuid);
        int addClient(Client client);
      //  void deleteFormByName(String nameForm);
        boolean deleteClientById(String uuid);

}
