package Exercicios;
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Calculadora de 2 numeros
        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int n2 = scanner.nextInt();
        scanner.close();

        int soma = n1+n2;
        int sub = n1-n2;
        int mult = n1*n2;
        int div = n1/n2;
        System.out.println("----------------------------");
        System.out.println(n1+ " + " +n2 + " = " + soma);
        System.out.println(n1+ " - " +n2 + " = " + sub);
        System.out.println(n1+ " * " +n2 + " = " + mult);
        System.out.println(n1+ " / " +n2 + " = " + div);
    }
}
