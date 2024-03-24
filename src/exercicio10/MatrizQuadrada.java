package exercicio10;

import exercicio10.entidade.Matriz;

import java.util.Scanner;

public class MatrizQuadrada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matriz matriz = new Matriz();
        Integer qteLinhaColunasUsuario;
        System.out.println("********** CONSTROÇÃO DE MATRIZ QUADRADA ************\n");
        System.out.print("Digite o número de linhas e colunas da matriz quadrada: ");
        qteLinhaColunasUsuario = input.nextInt();
        matriz.gerarMatrizQuadrada(qteLinhaColunasUsuario);
        matriz.imprimirMatriz();
        System.out.println("Total diagonal esquerda- direita = "+matriz.getSomaDiagonal());
        input.close();
    }
}