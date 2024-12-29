package Aula03_Metodos.Aula04.domain;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println("nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("sexo: " + this.sexo);
    }

}
