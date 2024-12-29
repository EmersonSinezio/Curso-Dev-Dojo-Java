package Aula01;

public class Aula08_Repeticoes {
    public static void main(String[] args) {
        // while do while e for
        byte count = 1;
        while (count <= 10){
            System.out.println("Contando: " + count + " Vezes");
            count++;
        }
        do{
            System.out.println("Executa pelo menos 1 vez");
        }while (count < 0);

        for(int i = 0; i <10; i++){
            System.out.println("Contando.. "+i+ " Vezes");
        }

        double valorTotal = 30000 ;
        for(int parcela = (int) valorTotal;parcela >=1; parcela--){
            double valorParcela = valorTotal / parcela;
            if(valorParcela<1000){
                continue;
            }
            System.out.println("Parcela: "+parcela+ " R$ " + valorParcela);
        }
}}
