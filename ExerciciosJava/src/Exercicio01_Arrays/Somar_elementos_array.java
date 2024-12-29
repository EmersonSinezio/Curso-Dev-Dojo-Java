package Exercicio01_Arrays;

/*
 1. Crie um programa que leia 10 números inteiros, armazene-os em um array e, depois, calcule e mostre a soma de todos os elementos do array.
    2. Após calcular a soma, calcule a média dos valores no array e mostre o resultado.
*/

public class Somar_elementos_array {
    public static void main(String[] args) {
        int numeroTotal = 0;
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        for (int num: numeros ){
            numeroTotal = numeroTotal+ num;
        }
        double media = (double)numeroTotal / numeros.length;
        System.out.println("Numeros somados: " + numeroTotal);
        System.out.println("A média dos numeros é: " + media);
    }
}
