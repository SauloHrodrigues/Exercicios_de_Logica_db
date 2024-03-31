package exercicio18.entidades;

public class Carro extends Automovel {

    public Carro(String tiposDeAutomoveis, String marca, String modelo, String cor, int numRodas, int velMax) {
        super(tiposDeAutomoveis, marca, modelo, cor, numRodas, velMax);
    }

    @Override
    public  void ligar() {
        setLigado(true);
    }

    @Override
    public void desLigar() {
        setLigado(false);
    }

    @Override
    public String toString() {
        return "Carro: " + getModelo() +
                "\nMarca: "+ getMarca()+
                "\nCor: " + getCor() +
                "\nVelocidade máxima: "+ getVelMax() +
                "\nQuantidade de rodas: "+getNumRodas() +
                "\nLigado: "+ isLigado() ;
    }
}
