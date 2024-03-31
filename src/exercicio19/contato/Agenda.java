package exercicio19.contato;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Contato> contatos = new ArrayList<>();

    public Agenda() {
    }

    public void adicionarContato(String nome, String telefone){
        contatos.add(new Contato(nome, telefone));
    }

    public void deletarContato(String nome){
        for(int i =0; i < contatos.size(); i++){
            if (contatos.get(i).getNome().equalsIgnoreCase(nome)){
                contatos.remove(contatos.get(i));
            }
        }
    }

    public void mostraAgenda (){
        for (Contato contato:contatos){
            System.out.println("nome: "+contato.getNome()+ " - telefone: "+ contato.getTelefone());
//            System.out.println();
        }
    }
}
