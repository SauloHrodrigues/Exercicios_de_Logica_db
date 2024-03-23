package exercicio06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Numero {
    private Random aleatorio = new Random();
    private Integer range = 100;
    private Integer menorNumero = range;
    private Integer maiorNumero = 0;

    List<Integer> lista = new ArrayList<>();
    public Numero() {
    }

    public Integer getMenorNumero() {
        return menorNumero;
    }

    public Integer getMaiorNumero() {
        return maiorNumero;
    }

    public List<Integer> gerarNumerosAleatorio(){
         Integer numGerado = (aleatorio.nextInt(range));

         for(int i =0;i <=range; i++){ //resolver
             lista.add((aleatorio.nextInt(range)));
             if(lista.get(i)< menorNumero){
                 menorNumero = lista.get(i);
             }
             if (lista.get(i)> maiorNumero){
                 maiorNumero = lista.get(i);
             }
         }
        return lista;
    }
}