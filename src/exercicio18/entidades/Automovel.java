package exercicio18.entidades;

import java.security.PrivateKey;

public abstract class Automovel {
    private String tiposDeAutomoveis;
    private String marca;
    private String modelo;
    private String cor;
    private int numRodas;
    private int velMax;
    private boolean ligado;

    public Automovel() {
    }

    public Automovel(String tiposDeAutomoveis, String marca, String modelo, String cor, int numRodas, int velMax) {
        this.tiposDeAutomoveis = tiposDeAutomoveis;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.numRodas = numRodas;
        this.velMax = velMax;
    }

    public String getTiposDeAutomoveis() {
        return tiposDeAutomoveis;
    }

    public void setTiposDeAutomoveis(String tiposDeAutomoveis) {
        this.tiposDeAutomoveis = tiposDeAutomoveis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumRodas() {
        return numRodas;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public abstract void ligar();
    public  abstract void desLigar();
}
