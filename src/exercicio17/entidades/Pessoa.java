package exercicio17.entidades;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pessoa {
//    private Long id;
    private String nome;
    private String idade;
    private String nomePai;
    private String nomeMae;
    private Map<String,String> agrregado =new HashMap<>();

    public Pessoa() {
    }

    public Pessoa(String nome, String idade, String nomePai, String nomeMae) {
        this.nome = nome;
        this.idade = idade;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
    }

    public void adicionarAgregado(String parente, String pessoa){
        agrregado.put(parente,pessoa);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", agrregado=" + agrregado +
                '}';
    }
}
