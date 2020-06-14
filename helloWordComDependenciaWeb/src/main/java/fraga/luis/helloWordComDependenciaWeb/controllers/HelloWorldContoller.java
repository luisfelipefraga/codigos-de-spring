package fraga.luis.helloWordComDependenciaWeb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Luís Felipe
 * @version 1.0
 *
 */
@RestController
public class HelloWorldContoller {

    @GetMapping("/")
    public String index() {
        return "Hello World Teste repository";
    }
}
