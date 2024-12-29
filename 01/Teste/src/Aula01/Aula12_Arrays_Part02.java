package Aula01;

public class Aula12_Arrays_Part02 {
    public static void main(String[] args) {
        int[][] arrayM = {{1,2,3},{1,2},{1,2,3,4,5,6}};

        for (int i = 0; i < arrayM.length; i++) {
            for (int j = 0; j < arrayM[i].length; j++) {
                System.out.print(arrayM[i][j] + " ");
            }
            System.out.println();
        }

    }
}
