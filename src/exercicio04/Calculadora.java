package exercicio04;

import exercicio04.entidade.Numero;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Numero numero = new Numero();
        String numeroString = "";
        String operador = "";
//        char operador;
        Double resultado = 0.0;

        System.out.println("********************* CALCULADORA ***********************\n");

        System.out.print("Digite um número: ");
        numero.setNumero(input.next());

        do {
            System.out.print("digite a operação (+,-,*,/,=) ");
            operador = String.valueOf((input.next().charAt(0)));

            if (operador.equals("=")) {
                break;
            }else {
                System.out.print("Digite um número: ");
                numeroString = input.next();
            }

            switch (operador) {
                case "+":
                    numero.adcionar(numeroString);
                    break;
                case "-":
                    numero.subtrair(numeroString);
                    break;
                case "*":
                    numero.multiplicar(numeroString);
                    break;
                case "x":
                    numero.multiplicar(numeroString);
                    break;
                case "/":
                    numero.dividir(numeroString);
                    break;
                case "=":
                    break;
                default:
                    System.out.println("****************************************");
                    System.out.println("*Opção invalida!                       *");
                    System.out.println("****************************************");
                    break;
            }
        }
        while (!operador.equals("="));
        System.out.println("O resultado é = " + numero.getAcumulado());
        input.close();
    }
}