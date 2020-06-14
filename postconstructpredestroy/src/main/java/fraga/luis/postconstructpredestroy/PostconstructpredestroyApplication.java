package fraga.luis.postconstructpredestroy;

import fraga.luis.postconstructpredestroy.dao.ClientDAO;
import fraga.luis.postconstructpredestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PostconstructpredestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(PostconstructpredestroyApplication.class, args);


		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);
		clientDAO.setClient(new Client("Luis","Fraga"));

		System.out.println("ClienteDAO: " + clientDAO);
		System.out.println("Client:" + clientDAO.getClient().toString());

	}

}
