package Teste.src.Exercicios.Exercicios_Classes.Ex04.test;

import Teste.src.Exercicios.Exercicios_Classes.Ex04.domain.Analisador;

public class Analisartest {
    public static void main(String[] args) {
        Analisador analisador = new Analisador();
        analisador.value1 = 2;
        analisador.value2 = 7;
        analisador.value3 = 10;
        analisador.verificar();
    }
}
