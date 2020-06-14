package fraga.luis.exemploCalculadoraGradle;

import fraga.luis.exemploCalculadoraGradle.model.Calculadora;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemploCalculadoraGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploCalculadoraGradleApplication.class, args);

		Calculadora calculadora = new Calculadora();
		calculadora.setNumero1(2);
		calculadora.setNumero2(2);
		System.out.println(calculadora);

		Calculadora calculadora1 = new Calculadora(4,4);
		System.out.println(calculadora1);

		System.out.println(new Calculadora(6,6));
	}

}
