package exercicio02.entidades;

public class Produto {

    private Long id;
    private String nome;
    private Double preço;
    private Integer quantidadeEstoque;

    public Produto() {
    }

    public Produto(String nome, Double preço, Integer quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidadeEstoque = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
