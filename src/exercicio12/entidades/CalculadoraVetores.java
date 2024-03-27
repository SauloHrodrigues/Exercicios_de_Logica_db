package exercicio12.entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CalculadoraVetores {

//    private  Integer[] vet;

    public CalculadoraVetores() {
    }

    public Integer[] popularVetor(Integer[] vet){
        Integer numGerado;
        Random aleatorio = new Random();
        int qtdePosicoes = vet.length;

        for (int i= 0; i < vet.length; i++){
            numGerado = (aleatorio.nextInt(10*qtdePosicoes));
            vet[i] = numGerado;
        }
        return vet;
    }

    public Integer[] combinarVetores(Integer[] vet1, Integer[] vet2) {
        List<Integer> listaCombinada = new ArrayList<>();

        for (int j = 0; j < vet2.length; j++) {
            listaCombinada.add(vet1[j]);
            for (int i = 0; i < listaCombinada.size(); i++) {
                if (!listaCombinada.contains(vet2[j])){
                    listaCombinada.add(vet2[j]);
                }
            }
        }

        Integer[] vetorCombinado= new Integer[listaCombinada.size()];

        for (int i = 0; i < vetorCombinado.length; i++) {
            vetorCombinado[i] = listaCombinada.get(i);
        }

        return ordenarVetorBubbleSort(vetorCombinado);
    }

    public Integer[] ordenarVetorBubbleSort(Integer[] vetor){

        for (int i =0; i< vetor.length;i++){
            for(int j = 0;j < vetor.length -i -1;j++){
                if(vetor[j]> vetor[j+1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j +1]= aux;
                }
            }
        }
        return vetor;
    }

    public void imprimirVetor(Integer[] vet){
        for (int i=0; i < vet.length; i++){
            System.out.print(vet[i]+", ");
        }
        System.out.println();
    }
}
