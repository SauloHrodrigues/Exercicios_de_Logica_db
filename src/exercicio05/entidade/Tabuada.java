package exercicio05.entidade;

public class Tabuada {
    private Integer tabuada;
    private Integer quantidadePosicoes = 100;
    private String orientacao = "h";
    private Integer rangeInicial =0;

    public Tabuada() {
    }

    public Integer getTabuada() {
        return tabuada;
    }

    public void setTabuada(Integer tabuada) {
        this.tabuada = tabuada;
    }

    public Integer getQuantidadePosicoes() {
        return quantidadePosicoes;
    }

    public void setQuantidadePosicoes(Integer quantidadePosicoes) {
        this.quantidadePosicoes = quantidadePosicoes;
    }

    public String getOrientacao() {
        return orientacao;
    }

    public void setOrientacao(String orientacao) {
        this.orientacao = orientacao;
    }

    public void imprimirTabuada(){
        for (int i = rangeInicial;i <= quantidadePosicoes; i++){
            if(orientacao.equalsIgnoreCase("h")){
                System.out.print(tabuada  + " X "+ i +" = "+ (i * tabuada) +", " );
            }

            if (orientacao.equalsIgnoreCase("v")){
                System.out.println(i + " X "+ tabuada +" = "+ i * tabuada);
            }
        }
    }

}