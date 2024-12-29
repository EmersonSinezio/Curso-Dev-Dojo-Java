package Exercicios.Ex_calculadora.test;
import Exercicios.Ex_calculadora.domain.Calculadora;

import java.util.Scanner;

public class Correcao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        int option = 0;

        while (option != 5) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Soma ");
            System.out.println("2. Subtração");
            System.out.println("3. Divisão");
            System.out.println("4. Multiplicação");
            System.out.println("5. Sair");

            // Lê a opção do usuário
            option = lerOpcao(sc);

            switch (option) {
                case 1:
                    realizarOperacao(sc, calc, "soma");
                    break;
                case 2:
                    realizarOperacao(sc, calc, "subtração");
                    break;
                case 3:
                    realizarOperacao(sc, calc, "divisão");
                    break;
                case 4:
                    realizarOperacao(sc, calc, "multiplicação");
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

    // Função para ler a opção e tratar exceções
    private static int lerOpcao(Scanner sc) {
        int option = 0;
        while (true) {
            try {
                String op = sc.nextLine();
                option = Integer.parseInt(op);
                if (option >= 1 && option <= 5) {
                    break;
                } else {
                    System.out.println("Opção inválida. Digite um número entre 1 e 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número entre 1 e 5.");
            }
        }
        return option;
    }

    // Função para realizar as operações e exibir resultados
    private static void realizarOperacao(Scanner sc, Calculadora calc, String operacao) {
        int n1 = lerNumero(sc, "Digite um número");
        int n2 = lerNumero(sc, "Digite outro número");
        System.out.println("-----------------");

        switch (operacao) {
            case "soma":
                System.out.println("Resultado da soma: " + calc.soma(n1, n2));
                break;
            case "subtração":
                System.out.println("Resultado da subtração: " + calc.sub(n1, n2));
                break;
            case "divisão":
                if (n2 != 0) {
                    System.out.println("Resultado da divisão: " + calc.div(n1, n2));
                } else {
                    System.out.println("Erro: Divisão por zero não permitida.");
                }
                break;
            case "multiplicação":
                System.out.println("Resultado da multiplicação: " + calc.mult(n1, n2));
                break;
        }

        System.out.println("-----------------");
    }

    // Função para ler um número e tratar exceções
    private static int lerNumero(Scanner sc, String mensagem) {
        int numero = 0;
        while (true) {
            System.out.println(mensagem);
            try {
                String input = sc.nextLine();
                numero = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        }
        return numero;
    }
}
