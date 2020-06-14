package fraga.luis.postconstructpredestroy.model;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author Luís Felipe
 * @version 1.0
 */

@ToString
@Getter @Setter
@AllArgsConstructor

@Component
public class Client {

    private String name;
    private String lastName;

    public Client() {
        System.out.println("Classe cliente!");
    }
}
