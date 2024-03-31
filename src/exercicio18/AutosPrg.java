package exercicio18;

import exercicio18.entidades.*;

import java.sql.SQLOutput;

public class AutosPrg {
    public static void main(String[] args) {
       Moto m1 = new Moto("MOTO","Honda","CG-150","vermelha",2,200);
       Carro carro = new Carro("CARRO","honda","Civic","prata",4,300 );
       Guincho guincho = new Guincho();
        System.out.println(m1);
        System.out.println();
        System.out.println(carro);

        System.out.println("Pode guinchar "+m1.getTiposDeAutomoveis()+" = "+guincho.validaCarga(m1.getTiposDeAutomoveis()));
        System.out.println("Pode guinchar "+carro.getTiposDeAutomoveis()+" = "+guincho.validaCarga(carro.getTiposDeAutomoveis()));


    }
}
