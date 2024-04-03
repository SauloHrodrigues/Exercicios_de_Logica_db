package exercicio17.entidades.massa_de_dados;

import exercicio17.entidades.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class GeraFamilia {

    private List<Pessoa> familia = new ArrayList<>();
    public GeraFamilia() {
        Pessoa juca = new Pessoa("Juca","104");
        Pessoa cida = new Pessoa("cida","103");
        Pessoa jose = new Pessoa("jose","106");
        Pessoa benedita = new Pessoa("benedita","106");
        Pessoa vita = new Pessoa("Vita","82",jose,benedita);
        Pessoa euripe = new Pessoa("Euripe","77",jose,benedita);
        Pessoa carlos = new Pessoa("Carlos Alberto","80",juca,cida);
        Pessoa maria = new Pessoa("Maria conceicao","84",jose,benedita);
        Pessoa saulo = new Pessoa("Saulo","45",carlos,maria);
        Pessoa suze = new Pessoa("Suze","51",carlos,maria);
        Pessoa fernando = new Pessoa("Carlos Fernando","55",carlos,maria);
        Pessoa wasghton = new Pessoa("wasghton","59",carlos,maria);
        Pessoa lourdes = new Pessoa("Lourdes","79",juca,cida);
        Pessoa ede = new Pessoa("Edson","77",juca,cida);

        familia.add(juca);
        familia.add(cida);
        familia.add(jose);
        familia.add(benedita);
        familia.add(vita);
        familia.add(euripe);
        familia.add(carlos);
        familia.add(maria);
        familia.add(saulo);
        familia.add(suze);
        familia.add(fernando);
        familia.add(wasghton);
        familia.add(ede);
        familia.add(lourdes);
    }

    public List<Pessoa> getFamilia() {
        return familia;
    }
}
