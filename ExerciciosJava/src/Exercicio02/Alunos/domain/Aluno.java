package Exercicio02.Alunos.domain;

public class Aluno {
    public double[] notas;
    public String nome;
    public int idade;

    public Aluno(String nome, int idade,double n1,double n2, double n3){
        this.nome = nome;
        this.idade = idade;
        this.notas = new double[]{n1,n2,n3};
    }
    public void infos(){
        System.out.println("--------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for (double nota:notas){
            System.out.println("Nota - "+nota);
        }
    }
    public void media(){
        int soma = 0;
        for(double nota:notas){
            soma+=(int)nota;
        }
        System.out.println("A média foi: "+soma / 3);
    }
}
