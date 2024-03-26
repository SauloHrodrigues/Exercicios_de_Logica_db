package exercicio17;

import exercicio17.entidades.ArvoreGenealogica;
import exercicio17.entidades.Pessoa;

public class ContruirArvore {
    public static void main(String[] args) {
        Pessoa saulo = new Pessoa("Saulo","45","Carlos Alberto","Maria conceicao");
        Pessoa suze = new Pessoa("Suze","51","Carlos Alberto","Maria conceicao");
        Pessoa fernando = new Pessoa("Carlos Fernando","55","Carlos Alberto","Maria conceicao");
        Pessoa wasghton = new Pessoa("wasghton","59","Carlos Alberto","Maria conceicao");
        Pessoa carlos = new Pessoa("Carlos Alberto","80","Juca","Cida");
        Pessoa maria = new Pessoa("Maria conceicao","84","Jose","Benedita");
        Pessoa vita = new Pessoa("Vita","82","Jose","Benedita");
        Pessoa euripe = new Pessoa("Euripe","77","Jose","Benedita");
        Pessoa lourdes = new Pessoa("Lourdes","79","Juca","Cida");
        Pessoa ede = new Pessoa("Edson","77","Juca","Cida");
        Pessoa juca = new Pessoa("Juca","100","Andreia","Mario");
        Pessoa cida = new Pessoa("Cida","99","Joaquina","Jõao");
        Pessoa jose = new Pessoa("Jose","105","Portugues","Portuguesa");
        Pessoa benedita = new Pessoa("Benedita","104","Alemao","Alemoa");

        ArvoreGenealogica genealogica = new ArvoreGenealogica();
        genealogica.adicionarPessoa(saulo);
        genealogica.adicionarPessoa(suze);
        genealogica.adicionarPessoa(fernando);
        genealogica.adicionarPessoa(wasghton);
        genealogica.adicionarPessoa(carlos);
        genealogica.adicionarPessoa(maria);
        genealogica.adicionarPessoa(vita);
        genealogica.adicionarPessoa(euripe);
        genealogica.adicionarPessoa(lourdes);
        genealogica.adicionarPessoa(ede);
        genealogica.adicionarPessoa(juca);
        genealogica.adicionarPessoa(cida);
        genealogica.adicionarPessoa(jose);
        genealogica.adicionarPessoa(benedita);

        genealogica.gerarArvoreGenealogica(saulo);
        System.out.println("Arvore Saulo = "+ genealogica);
//        genealogica.

    }
}
