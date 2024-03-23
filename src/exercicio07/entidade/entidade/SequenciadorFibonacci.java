package exercicio07.entidade.entidade;

import java.util.ArrayList;
import java.util.List;

public class SequenciadorFibonacci {

    private Integer numero;
    private List<Integer> lista = new ArrayList<>();

    public SequenciadorFibonacci() {
    }

    public List<Integer> retornaSequenciaFibonacci(Integer numero){
        for (int i = 0; i<= numero; i++){
            lista.add(calculaVaorPorIndiceFibonacci(i));
        }
        return lista;
    }

    private Integer calculaVaorPorIndiceFibonacci(Integer indice){
        double fibonacci;
        Double termo01 = 1/Math.sqrt(5);
        Double termo02 = (1+Math.sqrt(5))/2;
        Double termo03  = (1-Math.sqrt(5))/2;;
        fibonacci = termo01 * ( (Math.pow(termo02,indice)) - (Math.pow(termo03,indice)));
        int aux = (int) fibonacci;
        return aux;
    }
}