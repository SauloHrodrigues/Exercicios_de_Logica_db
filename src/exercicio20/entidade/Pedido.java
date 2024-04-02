package exercicio20.entidade;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Item> listaDeItens = new ArrayList<>();
    private  double valorTotalDoPedido =0;

    public void calcularValorTotal(){
        for (int i = 0; i < listaDeItens.size(); i++) {
            valorTotalDoPedido += listaDeItens.get(i).getValorDoItem();
        }
    }

    public boolean adicionarItemNaLista(Produto produto, int quantidade){
        Item item = new Item(produto, quantidade);
        listaDeItens.add(item);
        System.out.println("Item adicionado na lista");
        return true;
    }

    public void imprimirPedido(){
        System.out.println("********** PEDIDO **************");
        for (int i =0 ; i < listaDeItens.size();i++){
            System.out.println("Item "+(i+1));
            System.out.println("Produto:         "+listaDeItens.get(i).getProduto().getNome());
            System.out.println("Quantidade:      "+listaDeItens.get(i).getQuantidade());
            System.out.println("Preço unitário : "+listaDeItens.get(i).getProduto().getPreco());
            System.out.println("Valor total     : "+listaDeItens.get(i).getValorDoItem());
            System.out.println("----------------------------------------------");
        }
        calcularValorTotal();
        System.out.println("Valor total do pedido: "+valorTotalDoPedido);
    }
    public void imprimirValorTotal(){
        System.out.println("O valor do pedido é: "+valorTotalDoPedido);
    }

    public void adicionarItem(Item item){
        listaDeItens.add(item);

    }

    public void receberNomeDoTeclado(){
//        qual informação deve ser lida nesse metodo?
//        TODO
    }

    public void receberQuantidadeDoTeclado(){
        // TODO
    }

    public void limparCarrino(){
        listaDeItens.clear();
    }

    public double getValorTotalDoPedido() {
        return valorTotalDoPedido;
    }

    public void setValorTotalDoPedido(double valorTotalDoPedido) {
        this.valorTotalDoPedido = valorTotalDoPedido;
    }
}