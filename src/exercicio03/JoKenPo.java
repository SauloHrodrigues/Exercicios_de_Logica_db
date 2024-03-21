package exercicio03;

import java.util.Random;
import java.util.Scanner;

public class JoKenPo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final Integer PEDRA = 1;
        final Integer PPAPEL = 2;
        final Integer TESOURA = 3;
        Integer contador = 0;
        String mensagem = "Digite sua opção: ";
        Integer op;
        System.out.println("******************** JOGO JO-KEN-PO ******************");
        menuInicial("Digite sua opção: ");

        do {
            op = input.nextInt();
            switch (op) {
                case 1:
                    validaNumero(op);
                    break;
                case 2:
                    validaNumero(op);
                    break;
                case 3:
                    validaNumero(op);
                    break;
                default:
                    if (op < 1 || op > 3) {
                        System.out.println();
                        System.out.println("***************************************************");
                        System.out.println("* Opçao invalida!                                 *");
                        System.out.println("***************************************************");
                        System.out.println();
                        menuInicial("Digite novamente: ");
                        if (contador != 3) {
                            contador++;
                        }
                    }
            }

            if(contador>=3) {
                System.out.println("***************************************************");
                System.out.println("TENTE NOVAMENTE MAIS TARDE1!");
                break;
            }

        } while (op < 1 || op > 3);
        input.close();
    }

    public static void menuInicial(String msg) {
        System.out.println();
        System.out.println("Escolha um dos numeros abaixo:");
        System.out.println("1 - PEDRA :");
        System.out.println("2 - PAPEL :");
        System.out.println("3 - TESOURA :");
        System.out.print(msg);

    }

    public static Integer numAleatorio(){
        Integer numGerado;
        Random aleatorio = new Random();
        do{
            numGerado = (aleatorio.nextInt(4));
        }while (numGerado <1 || numGerado >3);

        return numGerado;
    }

    public static void validaNumero(Integer op){
        Integer numGerado = numAleatorio();
        if (op == numGerado){
            System.out.println("PARABÉNS! você acertou o número. ( " + numGerado + " )");
        } else{
            System.out.println("PENA! o número gerado foi ( "+ numGerado + " ). Boa sorte na próxima!");
        }
    }
}
