package Exercicio02.Produtos.test;

import Exercicio02.Produtos.domain.Produtos;

public class Produtos_test {
    public static void main(String[] args) {
        Produtos produto1 = new Produtos("Queijo do reino","338922MX",15.60);
        Produtos produto2 = new Produtos("Batata","3382My",6.99);
        Produtos produto3 = new Produtos("Picanha 1kg","229938",101);
        produto1.info();
        produto2.info();
        produto3.info();
        produto3.desconto();
    }
}
