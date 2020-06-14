package fraga.luis.injecaoDeDependencia.model;

import fraga.luis.injecaoDeDependencia.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Luís Felipe
 */
@Component
@Primary
@Qualifier("dog")
public class Dog implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("AU au AU");
    }
}
