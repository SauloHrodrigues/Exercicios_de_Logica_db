package exercicio16.entidade;

import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
    private Integer id;
    private String dataSaida;
    private String dataDevolucao;
    private Pessoa pessoa;
    private List<Livro> livroList = new ArrayList<>();

    public Emprestimo() {
    }

    public Emprestimo(Integer id, String dataSaida, String dataDevolucao) {
        this.id = id;
        this.dataSaida = dataSaida;
        this.dataDevolucao = dataDevolucao;
    }

    public Emprestimo(Integer id, String dataSaida, String dataDevolucao, Pessoa pessoa) {
        this.id = id;
        this.dataSaida = dataSaida;
        this.dataDevolucao = dataDevolucao;
        this.pessoa = pessoa;
    }

    public void addLivroEmprestimo(Livro livro){
        livroList.add(livro);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "id=" + id +
                ", dataSaida='" + dataSaida + '\'' +
                ", dataDevolucao='" + dataDevolucao + '\'' +
                ", pessoa=" + pessoa +
                ", livroList=" + livroList +
                '}';
    }
}
