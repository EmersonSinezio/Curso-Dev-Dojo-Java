package Exercicios;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exercicio04 {
    public static void main(String[] args) {
        // Obter a data atual
        LocalDate dataAtual = LocalDate.now();

        // Obter o dia da semana
        String diaDaSemana = dataAtual.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());

        // Imprimir o dia da semana
        System.out.println("Hoje é: " + diaDaSemana);

        if ((diaDaSemana == "domingo") && (diaDaSemana == "sabado")){
            System.out.println("Estamos no final de semana! bom descanso");
        }else {
            System.out.println("É um dia comercial! bom trabalho!");
        }

        // Obter a hora atual
        LocalTime horaAtual = LocalTime.now();

        // Definir o formato desejado (hora:minuto:segundo)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Imprimir a hora formatada
        String horaFormatada = horaAtual.format(formatter);
        // Extrair a hora, minuto e segundo como inteiros
        String[] partes = horaFormatada.split(":"); // Dividir em partes (hora, minuto, segundo)

        int hora = Integer.parseInt(partes[0]); // Converter a hora

        if(hora > 6 && hora < 12){
            System.out.println("Bom dia! a hora atual é: "+horaFormatada);
        } else if (hora > 12 && hora < 18) {
            System.out.println("Boa tarde! a hora atual é: "+horaFormatada);
        }else {
            System.out.println("Boa noite! a hora atual é: "+horaFormatada);
        }
    }
}

