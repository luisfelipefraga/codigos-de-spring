package fraga.luis.injecaoDeDependencia;

import fraga.luis.injecaoDeDependencia.interfaces.AnimalInterface;
import fraga.luis.injecaoDeDependencia.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Luís Felipe
 */
@Component
public class Pet {
    @Autowired
    private AnimalInterface animalInterface;

    public void execute() {
        animalInterface.comunicar();
    }
}
