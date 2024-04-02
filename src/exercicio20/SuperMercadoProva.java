package exercicio20;

import exercicio20.entidade.Estoque;
import exercicio20.entidade.Pedido;

import java.util.Scanner;

public class SuperMercadoProva {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Pedido pedido = new Pedido();
        pedido.adicionarItemNaLista(estoque.encontraProduto(2),3);
        pedido.adicionarItemNaLista(estoque.encontraProduto(4),2);
        pedido.imprimirPedido();
        realizarPagamento(pedido);

    }

    public static void realizarPagamento(Pedido pedido){
        Scanner input = new Scanner(System.in);
        Double totalDaCompra = pedido.getValorTotalDoPedido();
        Double pagoPeloCliente= 0.0;
        boolean pagamentoFeito = false;
        do{
            System.out.println("O total da Compra é:       "+ totalDaCompra);
            System.out.print("digite o valor recebido do cliente: ");
            pagoPeloCliente = input.nextDouble();
            if(totalDaCompra<= pagoPeloCliente){
                pagamentoFeito= true;
            } else{
                System.out.println("\n\n*************************************");
                System.out.println("Valor insuficiente!");
                System.out.println("*************************************");
            }

        }while (pagamentoFeito == false);
        double troco = pagoPeloCliente - totalDaCompra;
        trocoParaDevolver(troco);
        input.close();
    }

    public static void trocoParaDevolver(double valorDoTroco){
        double resto = valorDoTroco;
        Double[] notas = {200.0,100.00,50.00,20.00,10.00,5.00,2.00};
        int[] cedulas = new int[notas.length];

        System.out.println("O troco a ser devolvido é de: "+valorDoTroco);
        for (int i = 0; i < notas.length; i++) {
            if(resto >= notas[i]){
                cedulas[i] = (int) (resto /notas[i]);
                resto = resto % notas[i];
                System.out.println(cedulas[i] + " cedulas de " + notas[i] + " reais.");
            }
        }
    }
}