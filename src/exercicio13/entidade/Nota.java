package exercicio13.entidade;


import java.util.ArrayList;
import java.util.List;

public class Nota {

    private Double media;
    private Integer qtdeNotas;
    private String situacaoAluno;
    private List<Double> listaNotas = new ArrayList<>();
    public Nota() {
        CalcularMedia();
    }

    private void CalcularMedia(){
        Double somaNotas=0.0;
        for(Double nota:listaNotas){
            somaNotas += nota;
        }
        qtdeNotas = listaNotas.size();
        this.media = somaNotas / listaNotas.size();
    }

    public String getSituacaoAluno() {
        if(media>6){
            this.situacaoAluno = "Aprovado";
        } else if (media <=6 && media >=4) {
            this.situacaoAluno = "Verificação Suplementar";
        } else {
            this.situacaoAluno = "Reprovado";
        }

        return situacaoAluno;
    }

    public Double getMedia() {
        CalcularMedia();
        return media;
    }

    public void setNota(Double nota) {
        this.listaNotas.add(nota);
    }
}
