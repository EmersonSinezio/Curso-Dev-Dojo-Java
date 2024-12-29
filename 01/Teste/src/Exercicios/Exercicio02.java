package Exercicios;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Verificar maioridade
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade ");
        int idade = scanner.nextInt();
        scanner.close();
        if (idade >= 18){
            System.out.println("Olá "+nome+" Você tem "+idade+" liberado a consumir bebida alcolica");
        }
        else {
            System.out.println("Olá "+nome+" Você tem "+idade+" e não pode consumir bebida alcolica");
        }
    }
}
