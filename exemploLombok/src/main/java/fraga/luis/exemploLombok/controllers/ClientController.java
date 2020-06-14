package fraga.luis.exemploLombok.controllers;

import fraga.luis.exemploLombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ClientController {

    @GetMapping("/client")
    public Client getClient() {
        Client client = new Client();
        client.setName("Luis");
        client.setLastname("Fraga");
        client.setAge(19);


        return client;
    }

    @GetMapping("/clients")
    public ArrayList<Client> getClients() {

        ArrayList<Client> clients = new ArrayList<>();

        Client client = new Client();
        client.setName("Luis");
        client.setLastname("Fraga");
        client.setAge(19);

        Client client1 = new Client();
        client.setName("Joca");
        client.setLastname("Silva");
        client.setAge(20);

        clients.add(client);
        clients.add(client1);

        return clients;
    }
}
