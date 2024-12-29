package Aula01;

public class Aula03_Casting {
    public static void main(String[] args) {
        //O que está acontecenedo aqui é que a idade tem um tamanho e o número é maior então ele corta o valor para caber
        int idade = (int)10000000000L;
        long numero_grande = (long)155.25;
        System.out.println(idade);

        // Aqui estou convertendo o long (numeros grandes) ou seja ele está ignorando o que está depois de . para caber dentro da variável
        System.out.println(numero_grande);

        // Strings
        String nome = "Texto a ser colocado não tem uma quantidade para isso";
        System.out.println(nome);
    }
}
