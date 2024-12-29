package Exercicio02.Produtos.domain;

public class Produtos {
    public String nome;
    public String codigo;
    public double preco;

    public Produtos(String nome, String codigo,double preco){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }
    public void info(){
        System.out.println("------------------------------------------------");
        System.out.println("Nome do produto: "+this.nome);
        System.out.println("Código do produto : "+this.codigo);
        System.out.println(String.format("Preço do produto: R$ %.2f",this.preco));
    }
    public void desconto(){
        if (this.preco > 100){
            this.preco = this.preco - (this.preco * 0.1);
            System.out.println(String.format("Preço com desconto (10%%): R$ %.2f", this.preco));
        }
    }
}
