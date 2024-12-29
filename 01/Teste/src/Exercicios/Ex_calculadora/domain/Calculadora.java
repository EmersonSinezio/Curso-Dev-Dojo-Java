package Exercicios.Ex_calculadora.domain;

public class Calculadora {

    // Método soma agora retorna um int
    public int soma(int n1, int n2) {
        return n1 + n2;
    }

    // Método sub agora retorna um int
    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    // Método div agora retorna um double
    public double div(int n1, int n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return (double) n1 / n2;
    }

    // Método mult agora retorna um int
    public int mult(int n1, int n2) {
        return n1 * n2;
    }
}
