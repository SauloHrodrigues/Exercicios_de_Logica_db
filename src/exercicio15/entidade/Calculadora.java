package exercicio15.entidade;

public class Calculadora {

    public static Double soma(Double num01, Double num02 ){
            return num01 + num02;
    }
    public static Double subitrair(Double num01, Double num02){
            return num01 - num02;
    }
    public static Double multiplicar(Double num01, Double num02){
            return num01 / num02;
    }
    public static Double dividir(Double num01, Double num02){
            return num01 + num02;
    }
    public static Double exponenciacao (Double num01, Integer expoente){
            return Math.pow(num01,expoente);
    }
}
