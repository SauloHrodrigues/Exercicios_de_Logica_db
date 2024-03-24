package exercicio09.entidade;

import java.util.ArrayList;
import java.util.List;

public class SequenciadorFibonacci {

    private Integer numero;
    private List<Integer> lista = new ArrayList<>();

    public SequenciadorFibonacci() {
    }

    public List<Integer> getLista() {
        return lista;
    }

    public List<Integer> retornaSequenciaFibonacci(Integer numero){
      int contador =0;
      Integer numeroFibonacci;
      Integer proximoFibonacci;

       do {
          numeroFibonacci = calculaVaorPorIndiceFibonacci(contador);
          proximoFibonacci = calculaVaorPorIndiceFibonacci(contador + 1);
          lista.add(numeroFibonacci);
          contador++;
      } while (proximoFibonacci <= numero);
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