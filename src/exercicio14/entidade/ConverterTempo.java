package exercicio14.entidade;

import java.util.Timer;

public class ConverterTempo {
    private Integer horas;
    private Integer minutos;
    private Integer segundo;

    public ConverterTempo() {
    }

    public void converteSegundosEmHoras(Integer segundos){
        this.horas = segundos / 3600;
        this.minutos = (segundos % 3600)/60;
        this.segundo = (segundos % 3600)%60;
    }

    public Integer getHoras() {
        return horas;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public Integer getSegundo() {
        return segundo;
    }
}
