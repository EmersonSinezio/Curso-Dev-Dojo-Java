package Aula03_Metodos.Aula06_Private_Get_set.domain;

public class Pessoa {
    private String nome;
    private int idade;

    public void info(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
