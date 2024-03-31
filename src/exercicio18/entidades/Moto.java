package exercicio18.entidades;

public class Moto extends Automovel{
    private Integer acelerar =0;
    private Integer freiar = 0;
    private Integer engatar=0;

    public Moto(String tiposDeAutomoveis, String marca, String modelo, String cor, int numRodas, int velMax) {
        super(tiposDeAutomoveis, marca, modelo, cor, numRodas, velMax);
    }

    public Integer getAcelerar() {
        return acelerar;
    }

    public Integer getFreiar() {
        return freiar;
    }


    public Integer getEngatar() {
        return engatar;
    }

    public void setEngatar(Integer engatar) {
        this.engatar = engatar;
    }

    public void freiar(){
        if(freiar == 10){
            System.out.println("Moto parada!");
        } else {
            this.freiar += 2;
        }
    }

    public void soutarFreio(){
        this.freiar= 0;
    }

    public void acelerar(){
        if(acelerar == 20){
            System.out.println("Aceleração máxima!");
        } else {
            this.acelerar += 2;
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

    @Override
    public String toString() {
        return "Moto: " + getModelo() +
                "\nMarca: " + getMarca() +
                "\nVelocidade máxima: "+ getVelMax()+
                "\nLigada: " + isLigado();
    }
}
