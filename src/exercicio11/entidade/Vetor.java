package exercicio11.entidade;

import java.util.Random;

public class Vetor {
    private  Integer[] vet;

    public Vetor() {
       gerarVetor(100);
    }

    public void gerarVetor(Integer qtdePosicoes){
        vet = new Integer[qtdePosicoes];
        Integer numGerado;
        Random aleatorio = new Random();

        for (int i=0; i < vet.length; i++){
            numGerado = (aleatorio.nextInt(10*qtdePosicoes));
            vet[i]= numGerado;
        }
    }
    public void ordenarVetorBubbleSort(){

        for (int i =0; i< vet.length;i++){
            for(int j = 0;j < vet.length -i -1;j++){
                if(vet[j]> vet[j+1]){
                    int aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j +1]= aux;
                }
            }
        }
    }

    public void imprimirVetor(){
        for (int i : vet){
            System.out.print(i+", ");
        }
    }

}
