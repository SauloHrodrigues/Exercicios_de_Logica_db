package exercicio06;

import java.util.List;

public class NumeroAleatorioPrg {
    public static void main(String[] args) {
        Numero numero = new Numero();
       List<Integer> li = numero.gerarNumerosAleatorio();

        for (int i = 0; i < li.size() ; i++) {
            System.out.print( li.get(i) +" - ");
        }
        System.out.println();
        System.out.println("Maior número = "+ numero.getMaiorNumero());
        System.out.println("Menor número = "+ numero.getMenorNumero());
    }
}