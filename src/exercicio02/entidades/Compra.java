package exercicio02.entidades;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private Long id;
    private List<Item> items = new ArrayList<>();
    private Double valorTotalCompra =0.0;

    public Compra() {
    }

    public Compra(Produto produto,Integer quantidade) {
        Item item = new Item(produto, quantidade);
        items.add(item);
    }

    public void addNovoItem(Produto produto,Integer quantidade){
        Item item = new Item(produto, quantidade);
        items.add(item);
    }

    private void finalizarCompra(){
        for (Item i: items) {
            if(i.getQuantidade()<=10){
                valorTotalCompra += i.getValorUnitario()*i.getQuantidade();
            } else if(i.getQuantidade()<=20){
                valorTotalCompra += (i.getValorUnitario()*i.getQuantidade())*0.9;
            } else if(i.getQuantidade()<=50){
                valorTotalCompra += (i.getValorUnitario()*i.getQuantidade())*0.8;
            }else {
                valorTotalCompra += (i.getValorUnitario()*i.getQuantidade())*0.75;
            }
        }
    }

    public void resumoCompra(){
        int cont = 1;
        Double subTotal =0.0;

        for(Item i:items){
            System.out.println(cont +" | "+"Produto: "+i.getProduto().getNome()+" | "+"Preço da unidade: "+
            i.getValorUnitario()+" | "+"Quantidade: "+i.getQuantidade()+" | "+"Total a pagar: "+i.getValorTotalItem());
            System.out.println("-----------------------------------------------------------------");
            subTotal += i.getValorTotalItem();
        }
        finalizarCompra();
        System.out.println();
        System.out.println("Sub-total: " + subTotal);
        System.out.println("Total com Desconto: "+valorTotalCompra);


    }

}