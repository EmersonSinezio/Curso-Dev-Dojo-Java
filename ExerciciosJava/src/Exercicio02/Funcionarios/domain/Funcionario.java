package Exercicio02.Funcionarios.domain;
/* Criar uma classe Funcionario com os seguintes atributos
Nome, idade, salário (tres salarios devem ser armazenados)
 Criar dois métodos
 1. Para imprimir as informações
 2. Para tirar a média dos salários e imprimir o resultado
*/
public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios; // Usando um array para armazenar três salários

    // Construtor para inicializar os salários
    public Funcionario(String nome, int idade, double salario1, double salario2, double salario3) {
        this.nome = nome;
        this.idade = idade;
        this.salarios = new double[]{salario1, salario2, salario3}; // Armazenando os 3 salários
    }
    public void infos() {
        System.out.println("---------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salários: ");
        for (double salario : salarios) {
            System.out.println("R$ " + salario);
        }
    }
    public void mediaSalarial() {
        double soma = 0;
        for (double salario : salarios) {
            soma += salario;
        }
        double media = soma / salarios.length;
        System.out.println("A média salarial é: R$ " + media);
    }
}
