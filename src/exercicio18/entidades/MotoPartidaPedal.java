package exercicio18.entidades;

public class MotoPartidaPedal extends Moto{
    public MotoPartidaPedal(String tiposDeAutomoveis, String marca, String modelo, String cor, int numRodas, int velMax) {
        super(tiposDeAutomoveis, marca, modelo, cor, numRodas, velMax);
    }

    @Override
    public void ligar() {
        if(isLigado() == false && getAcelerar() >= 5){
            setLigado(true);
        }else if (isLigado()== false){
            System.out.println("Puxe o acelerador para dar a partida!");
        }else {
            System.out.println("A moto está em funcionamento.");
        }
    }
}
