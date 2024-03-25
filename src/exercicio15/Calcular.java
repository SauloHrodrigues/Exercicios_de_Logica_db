package exercicio15;


import exercicio15.entidade.Calculadora;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Calcular {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean fazerOutroCalculo = true;
        Double[] numero = new Double[2];


        do {
            Double resposta = 0.0;
            Integer operador = menu(input);
            switch (operador) {
                case 1:
                   numero = lerNumero(2,input);
                    resposta = Calculadora.soma(numero[1], numero[1]);
                    break;
                case 2:
                    numero = lerNumero(2, input);
                    resposta = Calculadora.subitrair(numero[0], numero[1]);
                    break;
                case 3:
                    numero = lerNumero(2, input);
                    resposta = Calculadora.multiplicar(numero[0], numero[1]);
                    break;
                case 4:
                    numero = lerNumero(2, input);
                    resposta = Calculadora.multiplicar(numero[0], numero[1]);
                    break;
                case 5:
                    numero = lerNumero(1, input);
                    System.out.print("Digite o expoente: ");
                    resposta = Calculadora.exponenciacao(numero[0],input.nextInt());
                    break;
                default:
                    System.out.println("****************************************");
                    System.out.println("*Opção invalida!                       *");
                    System.out.println("****************************************");

                    break;
            }
            System.out.println("O resultado foi: "+ resposta);
            System.out.print("Deseja fazer outro calculo? (s/n) ");
            String resp =  String.valueOf((input.next().charAt(0)));
            if(resp.equalsIgnoreCase("s")){
                fazerOutroCalculo = true;
            }else {
                fazerOutroCalculo= false;
            }
        }while (fazerOutroCalculo);
        input.close();
    }

    public static Integer menu(Scanner input) {
        System.out.println("********************* CALCULADORA ***********************\n");
        System.out.println("1 - Soma           ");
        System.out.println("2 - Subtração      ");
        System.out.println("3 - Multiplicação  ");
        System.out.println("4 - Divisão        ");
        System.out.println("5 - Exponenciação  ");
        System.out.print("Digite a opção: ");
        return input.nextInt();
    }

    public static Double[] lerNumero(Integer op, Scanner input){
        Double[] aux = new Double[op];
        for (int i = 0; i < op; i++) {
            System.out.print("Digite "+(i+1)+"º número: ");
            aux[i]= input.nextDouble();
        }
        return aux;
    }

}
