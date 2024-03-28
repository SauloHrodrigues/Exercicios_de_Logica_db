package exercicio14;

import exercicio14.entidade.ConverterTempo;

import java.util.Objects;
import java.util.Scanner;

public class LeituraTempo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ConverterTempo converterTempo = new ConverterTempo();
        escrever("************ CONVEERSOR DE TEMPO **********************\n");
        escrever("Entre com os segundo à serem convertidos: ");
        Integer tempoInformado = input.nextInt();
        converterTempo.converteSegundosEmHoras(tempoInformado);
        escrever("Os minutos ");
        escrever(""+tempoInformado+"");
        escrever(" resultaram em: ");
        System.out.println(converterTempo.getHoras()+"h"+ converterTempo.getMinutos()+"min"+ converterTempo.getSegundo()+"seg");
        input.close();
    }

    public static void escrever(String texto) {
        System.out.print(texto);
    }
}
