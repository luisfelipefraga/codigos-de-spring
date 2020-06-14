package fraga.luis.exemploCalculadoraGradle.model;

/**
 * @author Luís Felipe
 * @since 14/06/2020 - 17:10
 * @version 1.0
 */
public class Calculadora {
    private double numero1;
    private double numero2;

    public Calculadora() {
    }

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    /**
     *
     * @return retorna a soma do numero 1 e do numero 2
     */
    public double somar() {
        return this.numero1 + this.numero2;
    }
    /**
     *
     * @return retorna a subtração do numero 1 e do numero 2
     */
    public double subtrair() {
        return this.numero1 - this.numero2;
    }

    /**
     *
     * @return retorna a divisão do numero 1 e do numero 2
     */
    public double dividir() {
        return this.numero1 / this.numero2;
    }

    /**
     *
     * @return retorna a multiplicação do numero 1 e do numero 2
     */
    public double multiplicar() {
        return this.numero1 * this.numero2;
    }

    @Override
    public String toString() {
        return "Calculadora"
              + "\nNumero 1: " + numero1
              + "\nNumero 2: " + numero2
              + "\nSoma: " + somar()
              + "\nSubtração: " + subtrair()
              + "\nDivisão: " + dividir()
              + "\nMultiplicar: " + multiplicar();
    }
}
