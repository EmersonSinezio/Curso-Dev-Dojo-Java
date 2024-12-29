package Exercicio02.Funcionarios.test;

import Exercicio02.Funcionarios.domain.Funcionario;

public class Funcionario_Test {
    public static void main(String[] args) {
        // Criando funcionários e passando os salários no construtor
        Funcionario funcionario1 = new Funcionario("Emerson", 21, 2000, 2200, 2100);
        Funcionario funcionario2 = new Funcionario("Isadora", 27, 3500, 3600, 3400);
        Funcionario funcionario3 = new Funcionario("Emanuel", 19, 1500, 1600, 1550);

        // Imprimindo informações e médias dos funcionários
        funcionario1.infos();
        funcionario1.mediaSalarial();

        funcionario2.infos();
        funcionario2.mediaSalarial();

        funcionario3.infos();
        funcionario3.mediaSalarial();
    }
}
