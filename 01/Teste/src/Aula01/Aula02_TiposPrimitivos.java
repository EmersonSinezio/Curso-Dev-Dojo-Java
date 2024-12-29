package Aula01;

public class Aula02_TiposPrimitivos {
    public static void main(String[] args){
        /*
            Temos 8 tipos primitivos
            1. Int
            2. Double
            3. Float
            4. Char
            5. Byte
            6. Short
            7. Long
            8. Boolean
        */
        int age = 21;
        long numeroGrande = 100000000;
        double podemosUsarDuasVezes = 2000;
        //Tem que colocar o f no final para indicar numero flutuante
        float numerosFlutuantes = 2_500F;
        // Só funciona caso esteja em aspas simples
        char apenasUmCaractere = '\u0041';
        byte numerosPequenos = 8;
        short numerosMaioresQueByte = 100;
        boolean booleanPadrao = true;

        System.out.println("Hello world");
        System.out.println(age);
        System.out.println("Numero grandes long " + numeroGrande);
        System.out.println("Exemplo de double " + podemosUsarDuasVezes);
        System.out.println(numerosFlutuantes);
        System.out.println(apenasUmCaractere);
        System.out.println(numerosPequenos);
        System.out.println(numerosMaioresQueByte);
        System.out.println(booleanPadrao);
    }
}
