package Aula03_Metodos.Aula03.domain;

import java.util.ArrayList;

public class Aluno {
    public String nome;
    public byte idade;
    public char sexo;

    // Método não estático para armazenar e exibir alunos
    public void armazenarAluno() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Sexo: " + sexo);
    }
}
