package Exercicios;

public class Exercicio06 {
    public static void main(String[] args) {
        // Imprimir todos os numero pares de 1 a 1000000
        for (int i = 0;i <= 1000000; i++){
            if (i % 2 == 0){
                System.out.println("O numero "+i+" é par");
            }
        }
    }
}
