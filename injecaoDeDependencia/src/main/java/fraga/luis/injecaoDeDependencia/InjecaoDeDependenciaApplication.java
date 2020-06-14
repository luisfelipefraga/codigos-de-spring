package fraga.luis.injecaoDeDependencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Luís Felipe
 */
@SpringBootApplication
public class InjecaoDeDependenciaApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(InjecaoDeDependenciaApplication.class, args);

		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();


	}

}
