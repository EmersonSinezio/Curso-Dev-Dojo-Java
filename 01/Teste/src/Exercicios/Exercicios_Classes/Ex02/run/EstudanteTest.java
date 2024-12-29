package Exercicios.Exercicios_Classes.Ex02.run;

import Exercicios.Exercicios_Classes.Ex02.domain.Estudante;
import java.util.Scanner;
public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Scanner scanner = new Scanner(System.in);

        //Nome
        System.out.print("Digite seu nome Completo: ");
        String nome = scanner.nextLine();
        estudante.nomeCompleto = nome;
        //Data de nascimento
        System.out.print("Digite a data de nascimento: ");
        String data = scanner.nextLine();
        estudante.dataNascimento = data;
        //Endereco
        System.out.print("Digite seu endereco: ");
        String endereco = scanner.nextLine();
        estudante.endereco = endereco;
        //Telefone
        System.out.print("Digite seu telefone: ");
        String Telefone = scanner.nextLine();
        estudante.telefone = Integer.parseInt(Telefone);

        System.out.println(estudante.nomeCompleto);
        System.out.println(estudante.dataNascimento);
        System.out.println(estudante.endereco);
        System.out.println(estudante.telefone);
        scanner.close();
    }
}
