package Teste.src.Exercicios.Exercicios_Classes.Ex03.domain;

public class Verificador {
    public int value;
    public void imprimirValor(){
        if (value >= 10 && value <= 50){
            System.out.println("O valor está entre 10 e 50");
        }else {
            System.out.println("Os valores estão fora dos requisitos");
        }
    }
}
