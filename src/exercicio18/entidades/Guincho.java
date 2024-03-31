package exercicio18.entidades;

public class Guincho extends Automovel{



    public boolean validaCarga(String tipo){
        if (tipo.equalsIgnoreCase("carro") || tipo.equalsIgnoreCase("MOTO")){
           return true;
        } else {
            return false;
        }
    }


    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desLigar() {
        setLigado(false);
    }
}
