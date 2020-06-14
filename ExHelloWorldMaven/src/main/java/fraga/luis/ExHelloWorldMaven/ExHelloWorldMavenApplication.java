package fraga.luis.ExHelloWorldMaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExHelloWorldMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExHelloWorldMavenApplication.class, args);
		System.out.println("Hellow world com maven primeiro teste");
	}

}
