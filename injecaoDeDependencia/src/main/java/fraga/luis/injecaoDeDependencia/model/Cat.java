package fraga.luis.injecaoDeDependencia.model;

import fraga.luis.injecaoDeDependencia.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Luís Felipe
 */
@Component
@Qualifier("cat")
public class Cat implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("Maiu MIAAU");
    }
}
