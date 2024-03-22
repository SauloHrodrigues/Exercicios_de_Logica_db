package exercicio04.entidade;

public class Numero {
   private Double acumulado;

    public Numero() {
    }

    public void setNumero(String numero) {
        this.acumulado = validaNumero(numero);
    }

    public void adcionar(String numero){
        acumulado = acumulado + validaNumero(numero);
    }
    public void subtrair(String numero){
        acumulado = acumulado - validaNumero(numero);
    }
    public void multiplicar(String numero){
        acumulado = acumulado * validaNumero(numero);
    }
    public void dividir(String numero){
        acumulado = acumulado / (validaNumero(numero));
    }

    public Double getAcumulado() {
        return acumulado;
    }

    private Double validaNumero(String numero){
        String  aux = numero.trim();
        Double numeroValidado;
        if (aux.contains(".")){
            numeroValidado = Double.valueOf(aux);
        }else {
            aux = aux +".0";
            numeroValidado = Double.valueOf(aux);
        }
        return numeroValidado;
    }
}
