package exercicio08.entidade;

public class Numero {
    private Integer numero;

    public Numero() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if(numero.contains(".")){
            String[] auxiliar = numero.split(".");
            this.numero = Integer.parseInt(auxiliar[0]);
        }else{
            this.numero = Integer.parseInt(numero);
        }
    }
}