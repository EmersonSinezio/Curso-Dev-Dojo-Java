package Aula01;

public class Aula06_Operadores_ternarios {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagem_doar = "Eu tenho muito dinheiro";
        String mensagem_nao_doar = "Eu não tenho condicoes talvez mais pra frente";
        // operador ternario
        String resultado = salario > 5000 ? mensagem_doar : mensagem_nao_doar;

        System.out.println(resultado);
    }
}
