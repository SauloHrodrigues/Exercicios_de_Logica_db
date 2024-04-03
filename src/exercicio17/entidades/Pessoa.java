package exercicio17.entidades;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
//    private Long id;
    private String nome;
    private String idade;
    private Pessoa pai;
    private Pessoa mae;

    private List<Agregado> agregados = new ArrayList<>();

    public Pessoa(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
        this.pai = null;
        this.mae = null;
    }

    public Pessoa(String nome, String idade, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
        adicionarAgregado("filho",pai);
        adicionarAgregado("filho",mae);

    }

    public void adicionarAgregado(String parentesco, Pessoa pessoa){
        if (pessoa != null){
            agregados.add(new Agregado(parentesco, pessoa));
        }

    }

    public void mostrarAgregados(){
        for (int i = 0; i < agregados.size(); i++) {
            if (agregados.get(i).getParentesco() != "filho"){
                System.out.println(agregados.get(i).getParentesco()+" "+
                        agregados.get(i).getPessoa().getNome());
            }
        }
    }

    public boolean testarParente(Pessoa pessoa, String parente){
        boolean parenteTestado = false;
        for (int i =0 ; i< agregados.size();i++){
          if (agregados.get(i).getPessoa() == pessoa && agregados.get(i).getParentesco().equalsIgnoreCase(parente) ){
              parenteTestado = true;
          }
        }
        return parenteTestado;
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

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    @Override
    public String toString() {
        return
                "Nome: " + nome +
                "\nIdade: " + idade +
                "\nPai: " + pai.getNome() +
                "\nMae: " + mae.getNome()
                ;
    }
}
