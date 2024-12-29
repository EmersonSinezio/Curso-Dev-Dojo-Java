package Exercicio02.Alunos.test;

import Exercicio02.Alunos.domain.Aluno;

public class Aluno_test {
    public static void main(String[] args) {
        //Aluno 1
        Aluno aluno1 = new Aluno("Emerson",21,7,5,8);
        aluno1.infos();
        aluno1.media();
        Aluno aluno2 = new Aluno("Anabelle",24,2,6,6);
        aluno2.infos();
        aluno2.media();
        Aluno aluno3 = new Aluno("RodrigoGoes",38,9,3,7);
        aluno3.infos();
        aluno3.media();
    }
}
