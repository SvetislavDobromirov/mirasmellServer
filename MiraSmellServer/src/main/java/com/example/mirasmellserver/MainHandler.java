package com.example.mirasmellserver;


import com.example.mirasmellserver.model.client.Client;
import com.example.mirasmellserver.model.shortClient.ShortClient;
import com.example.mirasmellserver.repository.ClientRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainHandler {

    @Autowired
    private ClientRepositoryImpl clientRepository;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @PostMapping(value = "/put_client",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        System.out.println("PUT___PUT");
       // System.out.println(client.getFemaleInfo().toString());
        clientRepository.addClient(client);
        return ResponseEntity.ok(client);
    }

    @GetMapping(value = "/get_client/{uuid}",  produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Client> getClientById(@PathVariable String uuid) {
        var res = clientRepository.getClientById(uuid);

        if (res.isPresent()) {
            return ResponseEntity.ok(res.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


    @GetMapping(value = "/get_all",  produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getAll() {
        try {
            clientRepository.showAll();
        } catch (Exception e) {
            System.out.println(e.getMessage() +  e.getStackTrace());
        }

        return  ResponseEntity.ok().body("ok");
    }

    @GetMapping(value = "/delete_client/{uuid}",  produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteClientById(@PathVariable String uuid) {

        System.out.println("Delete: "  + uuid);
        var res = clientRepository.deleteClientById(uuid);// .getClientById(uuid);

        if (res) {
            System.out.println("Delete:  OK");
            return ResponseEntity.ok().body("ok");
        } else {
            System.out.println("Delete:  Error");
            return ResponseEntity.ok().body("error");
        }
    }

    @GetMapping(value = "/cleanAll")
    public void cleanAllClients() {
        clientRepository.clearAllCollections();
    }

    @GetMapping(value = "/get_all_short_clients",  produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<List<ShortClient>> getAllShortClients() {
        List<ShortClient> shortClients = clientRepository.getAllShortClients();
        return ResponseEntity.ok(shortClients);
    }
}