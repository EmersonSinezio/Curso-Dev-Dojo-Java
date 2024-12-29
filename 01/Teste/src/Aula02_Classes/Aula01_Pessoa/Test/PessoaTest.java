package Aula02_Classes.Aula01_Pessoa.Test;

import Aula02_Classes.Aula01_Pessoa.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa estudante1 = new Pessoa(); //Variavel de referencia "Estudante"
        estudante1.nome = "Emerson";
        estudante1.idade= 21;
        estudante1.sexo = 'M';

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);
        System.out.println("------------------");

        Pessoa estudante2 = new Pessoa();
        estudante2.nome = "Kiara";
        estudante2.idade= 18;
        estudante2.sexo = 'F';

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
