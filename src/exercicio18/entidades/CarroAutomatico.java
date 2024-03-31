package exercicio18.entidades;

public class CarroAutomatico extends Carro {
    private boolean isFreiado;

    public CarroAutomatico(String tiposDeAutomoveis, String marca, String modelo, String cor, int numRodas, int velMax, boolean isFreiado) {
        super(tiposDeAutomoveis, marca, modelo, cor, numRodas, velMax);
        this.isFreiado = isFreiado;
    }

    public void setFreiado() {
        isFreiado = true;
    }

    @Override
    public void ligar() {
        if (isFreiado == true){
            setLigado(true);
        } else {
            System.out.println("Este carro precisa estar com o freio pressionado para ligar!");
        }
    }
}