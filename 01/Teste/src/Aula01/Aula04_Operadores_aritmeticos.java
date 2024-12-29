package Aula01;

public class Aula04_Operadores_aritmeticos {
    public static void main(String[] args) {
        // Tipos aritmeticos
        int numero1 = 10;
        int numero2 = 20;

        //Soma
        System.out.println(numero1+numero2);
        //Subtracao
        System.out.println(numero1-numero2);
        //multiplicacao
        System.out.println(numero1*numero2);
        //divisao
        double resultado = numero1 /(double) numero2;
        System.out.println(resultado);
        // Resto da divisão (%)
        System.out.println(numero1 % numero2);
        // Menor que e maior que (menor ou igual. maior ou igual) < > <= >=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);
        // É igual ==   é diferente !=

        // && and -> quando 1 das condições está errada retorna falso
        // || Or -> quando 1 das condições é atendida ele retorna True
        // ! Not

        // Imagine que em algum pais se tenha uma regra que esta dentro da lei quem é maior que 30 e quem tem o salário maior que 4612 Euros por mes
        // E tambem quem está dentro da lei menor que 30 anos é quem possui salario maior que 3381
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQue30 = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQue30 = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMaiorQue30);
        System.out.println(isDentroDaLeiMenorQue30);


        /*
            1. = (igual)
            2. += (pega o número e adiciona por cima)
            3. -= (pega o proprio numero e tira)
            4. /= (pega o proprio numero e divide)
            5. *=
            6. %=
        */
        int numeroBase = 1000;
        System.out.println(numeroBase += 100); // O que ele faz aqui é -> numeroBase = numerobase + 100 (resultado 1100)

        // Incrementador ++ ou decrementador --
        int numero = 0;
        numero++;
        System.out.println(numero);
    }
}
