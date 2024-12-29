package Aula03_Metodos.Aula05_varargs.domain;

public class Calculadora {
    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num:numeros){
            soma += num;
        }
        System.out.println("Soma dos numeros: "+soma);
    }
//    A principal diferença entre varargs e um array normal é que o varargs permite passar múltiplos argumentos
//    sem precisar criar um array explicitamente, enquanto um array normal exige que você declare e passe um array diretamente.
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num:numeros){
            soma+=num;
        }
        System.out.println(soma);
    }
}