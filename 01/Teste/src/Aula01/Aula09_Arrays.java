package Aula01;

public class Aula09_Arrays {
    public static void main(String[] args) {
        // Arrays fazem referencia a um objeto em memória
        int[] idades = new int[4]; // é um tipo referencia (somente tipos de referencias podem iniciar null)
        idades[0] = 3;
        idades[1] = 7;
        idades[2] = 99;

        System.out.println(idades[0]);
        for (int i = 0; i < idades.length;i++){
            System.out.println(i+" - "+ idades[i]);
        }
    }
}
