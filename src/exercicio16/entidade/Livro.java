package exercicio16.entidade;

public class Livro {
    private Integer id;
    private String nome;
    private Integer qtdePaginas;

    public Livro() {
    }

    public Livro(Integer id, String nome, Integer qtdePaginas) {
        this.id = id;
        this.nome = nome;
        this.qtdePaginas = qtdePaginas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdePaginas() {
        return qtdePaginas;
    }

    public void setQtdePaginas(Integer qtdePaginas) {
        this.qtdePaginas = qtdePaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", qtdePaginas=" + qtdePaginas +
                '}';
    }
}
