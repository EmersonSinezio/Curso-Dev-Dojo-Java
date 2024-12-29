package Aula01;
import java.util.Random;
public class Aula11_ArraysMultiDimensionais {
    public static void main(String[] args) {
        int [][] dias = new int[3][3];
        dias[0][0] = 2;
        System.out.println(dias[0][0]);

        Random random = new Random();

        // Preenchendo o array com números aleatórios
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                // Se for a posição [0][0], já atribui o valor 2
                if (i == 0 && j == 0) {
                    dias[i][j] = 2;
                } else {
                    // Caso contrário, preenche com números aleatórios entre 1 e 100
                    dias[i][j] = random.nextInt(100) + 1; // Gera valores de 1 a 100
                }
            }
        }
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.print(dias[i][j] + " ");
            }
            System.out.println();
        }
        // Foreach com arrays multidimensionais
        for (int [] arr: dias){
            for (int num: arr){
                System.out.println(num);
            }
        }
    }
}
