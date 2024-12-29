package Aula01;

public class Aula10_Foreach {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};

/*        for(int i = 0; i<numeros.length; i++){
            System.out.println(numeros[i]);
       }
*/
        // Funciona da mesma forma porem nao consegue pegar o index (é um foreach)
        for (int num : numeros){
            System.out.println(num);
        }
    }
}
