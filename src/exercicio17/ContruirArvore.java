package exercicio17;

import exercicio17.entidades.ArvoreGenealogica;
import exercicio17.entidades.Pessoa;
import exercicio17.entidades.massa_de_dados.GeraFamilia;

public class ContruirArvore {
    public static void main(String[] args) {
        GeraFamilia familia = new GeraFamilia();
        ArvoreGenealogica arvoreGenealogica = new ArvoreGenealogica(familia.getFamilia());

//        arvoreGenealogica.mostrarArvoreDe("Carlos Alberto");
        arvoreGenealogica.mostrarArvoreDe("Saulo");

    }
}
