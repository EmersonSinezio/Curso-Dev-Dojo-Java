package Aula03_Metodos.Aula04.Test;

import Aula03_Metodos.Aula04.domain.Estudante;
import Aula03_Metodos.Aula04.domain.ImprimirEstudante;

public class Estudante_test01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Emerson";
        estudante1.idade = 21;
        estudante1.sexo = 'M';

        estudante2.nome = "Marcia";
        estudante2.idade = 22;
        estudante2.sexo = 'F';

        estudante1.imprime();
        System.out.println("--------------------");
        estudante2.imprime();
    }
}
