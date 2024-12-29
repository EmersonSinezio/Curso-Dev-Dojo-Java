package Aula03_Metodos.Aula05_varargs.test;

import Aula03_Metodos.Aula05_varargs.domain.Calculadora;

public class Calculadora_test {
    public static void main(String... args) {
        System.out.println("Hello world");
        Calculadora calc = new Calculadora();

        int[] numeros = {1,2,3,4,5};

        calc.somaArray(numeros);

        calc.somaVarArgs(1,2,3,4,5,6,7,8);
    }
}
