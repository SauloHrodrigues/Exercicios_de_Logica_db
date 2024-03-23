package exercicio07.entidade;

import exercicio07.entidade.entidade.SequenciadorFibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CalcularFibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SequenciadorFibonacci calculoFibonacci = new SequenciadorFibonacci();
        List<Integer> listaFibonacci = new ArrayList<>();
        String numeroDigitadoUsuario;
        Boolean refazer;
        Integer dadoValidado;
        System.out.println("************ CALCULO DA SEQUENCIA FIBONACCI **************\n\n");

        do{
            refazer= false;
            System.out.print("Digite um número inteiro positivo: ");
            numeroDigitadoUsuario = input.next();
            dadoValidado = validaDado(numeroDigitadoUsuario);

            if (dadoValidado == -1){
                System.out.println("********************************");
                System.out.println("* Dado invalido!               *");
                System.out.println("********************************");
                refazer = true;
            }

        }while (refazer);
        listaFibonacci = calculoFibonacci.retornaSequenciaFibonacci(dadoValidado);

        for(Integer li:listaFibonacci){
            System.out.print(li+", ");
        }

        input.close();
    }

    public static Integer validaDado(String dado){
        if (dado.contains(".") || dado.contains(",")){
            return -1;
        }else {
            return Integer.parseInt(dado);
        }
    }
}
