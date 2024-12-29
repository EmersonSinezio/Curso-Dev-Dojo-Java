package Aula03_Metodos.Aula01.test;

import Aula03_Metodos.Aula01.domain.Calculadora;

public class Aula01_test {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.soma(10,20);
        calculadora.sub(20,10);
        calculadora.mult(5,5);
        calculadora.div(10,2);
    }
}
