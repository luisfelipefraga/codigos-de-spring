package fraga.luis.exemploLombok.model;

import lombok.*;

/**
 * @author Luís Felipe
 * @version 1.0
 */
@ToString
@NoArgsConstructor @AllArgsConstructor
public class Client {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String lastname;

    @Getter @Setter
    private int age;

    /**
     *
     * @return retorna a idade em meses
     */
    public int calculateAgeInMonths() {
        return this.age * 12;
    }
}
