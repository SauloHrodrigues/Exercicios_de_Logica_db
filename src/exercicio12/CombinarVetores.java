package exercicio12;

import exercicio12.entidades.CalculadoraVetores;

public class CombinarVetores {
    public static void main(String[] args) {

        System.out.println("********* Combinar vetores ***********");
        CalculadoraVetores calculadoraVetores = new CalculadoraVetores();
        Integer[] vetor01 = new Integer[10];
        Integer[] vetor02 = new Integer[10];

        calculadoraVetores.popularVetor(vetor01);
        System.out.print("Vetor 01 populado aleatoriamente = " );
        calculadoraVetores.imprimirVetor(vetor01);
        System.out.println();

        calculadoraVetores.popularVetor(vetor02);
        System.out.print("Vetor 02 populado aleatoriamente = " );
        calculadoraVetores.imprimirVetor(vetor02);
        System.out.println();

        calculadoraVetores.ordenarVetorBubbleSort(vetor01);
        System.out.print("Vetor 01 ordenado = " );
        calculadoraVetores.imprimirVetor(vetor01);
        System.out.println();

        calculadoraVetores.ordenarVetorBubbleSort(vetor02);
        System.out.print("Vetor 02 ordenado = " );
        calculadoraVetores.imprimirVetor(vetor02);
        System.out.println();

        Integer[] vetoresCombinados = calculadoraVetores.combinarVetores(vetor01,vetor02);
        System.out.println("Vetores 01 e 02 combinados. ");
        calculadoraVetores.imprimirVetor(vetoresCombinados);
    }
}