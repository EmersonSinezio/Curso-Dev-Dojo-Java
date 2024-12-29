package Aula03_Metodos.Aula03.test;

import Aula03_Metodos.Aula03.domain.Aluno;
import java.util.ArrayList;

public class Aluno_test {
    public static void main(String[] args) {
        // Criando um ArrayList para armazenar os alunos
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        // Criando o primeiro aluno
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Emerson";
        aluno1.idade = 20;
        aluno1.sexo = 'M';

        // Criando o segundo aluno
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Maria";
        aluno2.idade = 27;
        aluno2.sexo = 'F';

        // Adicionando alunos ao ArrayList
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);

        // Exibindo os alunos armazenados
        for (Aluno aluno : listaAlunos) {
            aluno.armazenarAluno();  // Chama o método não estático para cada aluno
        }
    }
}
