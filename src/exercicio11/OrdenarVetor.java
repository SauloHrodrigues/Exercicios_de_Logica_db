package exercicio11;

import exercicio11.entidade.Vetor;

import java.util.Scanner;

public class OrdenarVetor {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Vetor vet = new Vetor();
        Integer numeroPosicoes;
        System.out.println("************* ORDENADO VETORES **********************\n");
        System.out.println("Digite o númer de posições para o vetor");
        numeroPosicoes = input.nextInt();
        vet.gerarVetor(numeroPosicoes);
        System.out.println("Vetor Gerado: ");
        vet.imprimirVetor();
        vet.ordenarVetorBubbleSort();
        System.out.println();
        System.out.println("\nVetor Ordenado: ");
        vet.imprimirVetor();

        input.close();
    }
}
