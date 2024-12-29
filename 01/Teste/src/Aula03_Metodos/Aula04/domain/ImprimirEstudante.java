package Aula03_Metodos.Aula04.domain;

public class ImprimirEstudante {
    public void imprimir(Estudante estudante){
        System.out.println("---------------");
        System.out.println("O estudante: "+estudante.nome);
        System.out.println("Possui: "+estudante.idade+" Anos");
        System.out.println("E é do sexo: "+estudante.sexo);
    }
}
