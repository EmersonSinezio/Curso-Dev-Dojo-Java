package Exercicios.Ex_calculadora.test;
import Exercicios.Ex_calculadora.domain.Calculadora;

import java.util.Scanner;

public class Calc_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        int option = 0;

        while (option != 5) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Opção 1 | Soma ");
            System.out.println("2. Opção 2 | Subtração");
            System.out.println("3. Opção 3 | Divisão");
            System.out.println("4. Opção 4 | Multiplicação");
            System.out.println("5. Sair");

            String op = sc.nextLine();

            // Tentando converter a opção para inteiro, tratando exceções
            try {
                option = Integer.parseInt(op);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número entre 1 e 5.");
                continue;
            }

            switch (option) {
                case 1:
                    System.out.println("Digite um número");
                    String n1 = sc.nextLine();
                    System.out.println("Digite outro número");
                    String n2 = sc.nextLine();
                    System.out.println("-----------------");
                    calc.soma(Integer.parseInt(n1),Integer.parseInt(n2));
                    System.out.println("-----------------");
                    break;
                case 2:
                    System.out.println("Digite um número");
                    n1 = sc.nextLine();
                    System.out.println("Digite outro número");
                    n2 = sc.nextLine();
                    System.out.println("-----------------");
                    calc.sub(Integer.parseInt(n1),Integer.parseInt(n2));
                    System.out.println("-----------------");
                    break;
                case 3:
                    System.out.println("Digite um número");
                    n1 = sc.nextLine();
                    System.out.println("Digite outro número");
                    n2 = sc.nextLine();
                    System.out.println("-----------------");
                    calc.div(Integer.parseInt(n1),Integer.parseInt(n2));
                    System.out.println("-----------------");
                    break;
                case 4:
                    System.out.println("Digite um número");
                    n1 = sc.nextLine();
                    System.out.println("Digite outro número");
                    n2 = sc.nextLine();
                    System.out.println("-----------------");
                    calc.mult(Integer.parseInt(n1),Integer.parseInt(n2));
                    System.out.println("-----------------");
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        sc.close();
    }
}
