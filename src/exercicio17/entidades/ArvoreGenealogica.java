package exercicio17.entidades;

import exercicio17.entidades.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ArvoreGenealogica {


    //   private Long id;
    private List<Pessoa> familia = new ArrayList<>();

    public ArvoreGenealogica() {
    }

    public void adicionarPessoa(Pessoa pessoa) {
        familia.add(pessoa);
    }



    public void gerarArvoreGenealogica(Pessoa pessoa){
        for(int i=0; i< familia.size();i++){
//            add irmao
            if (familia.get(i).getNomePai().equalsIgnoreCase(pessoa.getNomePai())){
               pessoa.adicionarAgregado("irmao",familia.get(i).getNome());
                System.out.println("Entrou if !!!! "+ familia.get(i).getNome());

            }

        }// fim for
    }


    @Override
    public String toString() {
        return "ArvoreGenealogica{" +
                "familia=\n" + familia +
                '}' + "\n";
    }
}
