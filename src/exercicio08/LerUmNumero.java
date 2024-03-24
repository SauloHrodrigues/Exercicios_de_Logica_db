package exercicio08;

import exercicio08.entidade.Numero;

import java.util.Scanner;

public class LerUmNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dadoDigitadoUsuario;
        Numero numero = new Numero();
        System.out.println("************** VALIDA NÚMERO *******************\n  ");
        do {
            System.out.print("Digite um número: ");
            dadoDigitadoUsuario= input.next();
            numero.setNumero(dadoDigitadoUsuario);
        }while (numero.getNumero() != 10);
        System.out.println("Parabéns, você digitou 10!");

        input.close();
    }
}