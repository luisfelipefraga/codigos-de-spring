package fraga.luis.exemploLombok.controllers;

import fraga.luis.exemploLombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldLombokControler {

    @GetMapping("/")
    public String index() {
        return "Hello funcionou!";
    }

}
