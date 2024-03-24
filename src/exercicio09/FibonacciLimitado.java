package exercicio09;

import exercicio09.entidade.SequenciadorFibonacci;

import java.util.Scanner;

public class FibonacciLimitado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SequenciadorFibonacci fibonacci =new SequenciadorFibonacci();
        Integer limiteFibonacciUsuario;

        System.out.println("*********** CONTAR FIBONACCI ATÉ O NÚMERO INFORMADO! ***********");

        System.out.print("Digite um número inteiro positivo: ");
        limiteFibonacciUsuario = input.nextInt();
        fibonacci.retornaSequenciaFibonacci(limiteFibonacciUsuario);

        for (int numero : fibonacci.getLista()){
            System.out.print(numero + ", ");
        }
        input.close();
    }
}