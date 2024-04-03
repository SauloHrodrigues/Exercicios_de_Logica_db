package exercicio17.entidades;

import exercicio17.entidades.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ArvoreGenealogica {

    private List<Pessoa> familia = new ArrayList<>();

    public ArvoreGenealogica(List<Pessoa> familia) {
        this.familia = familia;
    }

    public void mostrarArvoreDe(String pessoa) {
        for (int i = 0; i < familia.size(); i++) {
            if (familia.get(i).getNome().equalsIgnoreCase(pessoa)) {
                System.out.println(familia.get(i));
                gerarAgregados(familia.get(i));
                familia.get(i).mostrarAgregados();
            }
        }
    }

    private void gerarAgregados(Pessoa pessoa) {
        for (int i = 0; i < familia.size(); i++) {
            Pessoa pessoaNaLista = familia.get(i);
//        imaos
            if ((pessoaNaLista.getPai() == pessoa.getPai() || pessoaNaLista.getMae() == pessoa.getMae())
                    && pessoaNaLista != pessoa) {
                Pessoa irmao = familia.get(i);
                pessoa.adicionarAgregado("irmaos", irmao);

            }
//            avos
            if (pessoa == pessoaNaLista) {
                pessoa.adicionarAgregado("Avo Materna", familia.get(i).getMae().getMae());
                pessoa.adicionarAgregado("Avo Materna", familia.get(i).getMae().getPai());
                pessoa.adicionarAgregado("Avo Paterno", familia.get(i).getPai().getMae());
                pessoa.adicionarAgregado("Avo Paterno", familia.get(i).getPai().getPai());
            }
//        tios pai irmão da pessoa
            if (pessoaNaLista.getPai() == pessoa.getPai().getPai() && pessoaNaLista != pessoa.getPai()){
                System.out.println("Tio = "+pessoaNaLista.getNome());
            }


//        sobrinhos

        }
    }

    @Override
    public String toString() {
        return "ArvoreGenealogica{" +
                "familia=" + familia +
                '}';
    }
}
