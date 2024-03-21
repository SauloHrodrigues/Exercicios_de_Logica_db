package exercicio02.entidades;

import java.util.List;

public class Item {
    private Long id;
    private Integer quantidade;
    private Produto produto ;

    private Double valorUnitario;
    private Double valorTotalItem ;

    public Item( Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = produto.getPreço();
        valorTotalItem = produto.getPreço() * quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }


    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getValorTotalItem() {
        return valorTotalItem;
    }

    public void setValorTotalItem(Double valorTotalItem) {
        this.valorTotalItem = valorTotalItem;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }
}