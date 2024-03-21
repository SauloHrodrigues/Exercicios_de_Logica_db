package exercicio02;

import exercicio02.entidades.Compra;
import exercicio02.entidades.Produto;

public class GestaoVenda {
    /*
            Para cada produto informado (nome, preço e quantidade), escreva o
        nome do produto comprado e o valor total a ser pago, considerando
        que são oferecidos descontos pelo número de unidades compradas,
        segundo a tabela abaixo:
                a. Até 10 unidades: valor total
                b. De 11 a 20 unidades: 10% de desconto
                c. De 21 a 50 unidades: 20% de desconto
                d. Acima de 50 unidades: 25% de desconto
    */
    public static void main(String[] args) {
        Produto televisao = new Produto("Televisor",10.00,500);
        Produto gamer = new Produto("gemer",5.00,500);
        Produto bicicleta = new Produto("bicicleta",1120.00,500);
        Produto celular = new Produto("celular",2000.00,500);

        Compra compra = new Compra();
        compra.addNovoItem(televisao,51);
        compra.addNovoItem(gamer,51);

        compra.resumoCompra();

    }
}
