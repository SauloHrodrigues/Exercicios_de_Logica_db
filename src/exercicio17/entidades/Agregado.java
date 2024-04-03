package exercicio17.entidades;

import java.util.HashMap;
import java.util.Map;

public class Agregado {

    private String parentesco;
    private Pessoa pessoa;

    public Agregado(String parentesco, Pessoa pessoa) {
        this.parentesco = parentesco;
        this.pessoa = pessoa;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Agregados: \n" +
                parentesco + " - "+
                pessoa.getNome();
    }
}
