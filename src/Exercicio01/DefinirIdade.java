package Exercicio01;

import java.util.Scanner;

public class DefinirIdade {
    /*  Definir a idade de uma pessoa e verificar se ela é maior de idade ou não.*/
    public static void main(String[] args) {
        Integer idade;
        Scanner input = new Scanner(System.in);
        System.out.println("Exercício maior ou menor ");
        System.out.println();
        System.out.print("Digite sua idade: ");
        idade= input.nextInt();

        if (idade<18){
            System.out.println("Você é menor!");
        }else{
            System.out.println("você é maior!");
        }
        input.close();
    }
}