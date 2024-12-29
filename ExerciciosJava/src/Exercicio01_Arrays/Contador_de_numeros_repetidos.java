package Exercicio01_Arrays;
import java.util.Scanner;
import java.util.ArrayList;

/*
    1 - Peça para o usuário inserir uma lista de 10 números inteiros e, em seguida, leia um número e informe quantas vezes ele aparece no array.
        2 - Caso o número não apareça, mostre uma mensagem dizendo que ele não foi encontrado.

 */
public class Contador_de_numeros_repetidos {
    public static void main(String[] args) {
        int numerosRepetidos = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(5);
        lista.add(5);
        lista.add(5);
        lista.add(10);
        lista.add(10);
        lista.add(7);
        System.out.print("Digite o numero para verificação: ");
        int numeroVerificar = sc.nextInt();
        for (int i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i) ==  numeroVerificar) {  // Compara o índice atual com o próximo
                numerosRepetidos++;  // Incrementa a contagem se os valores forem iguais
            }
            else{
                System.out.println("O numero "+numeroVerificar+" não está na lista");
                break;
            }
        }
        System.out.println("O numero "+numeroVerificar+" Aparece "+numerosRepetidos+ " vezes");
        sc.close();
        System.out.println("Elementos da lista: " + lista);
    }
}
