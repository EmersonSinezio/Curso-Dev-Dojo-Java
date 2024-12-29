package Aula03_Metodos.Aula02;

public class Aula02_parametros {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Calc calc = new Calc();
        calc.Soma(1,2);
        calc.Sub(2,5);
        double div = calc.Div(7,2);
        System.out.println(div);
    }
}
