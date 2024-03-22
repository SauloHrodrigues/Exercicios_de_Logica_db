package exercicio05;

import exercicio05.entidade.Tabuada;

import java.util.Scanner;

public class ProgramaTabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tabuada tabuada = new Tabuada();
        System.out.println("************** PROGRAMA DE TABUADA ******************");
        System.out.print("Digite o número da tabuada: ");
        tabuada.setTabuada(input.nextInt());
        System.out.print("Digite quantas posições deseja: ");
        tabuada.setQuantidadePosicoes(input.nextInt());
        System.out.print("Digite a orientação que deseja: Horizonta / Vertical ");
        String aux = String.valueOf(input.next().charAt(0));
        tabuada.setOrientacao(aux);
        tabuada.setOrientacao("v");
        tabuada.imprimirTabuada();
        input.close();
    }
}