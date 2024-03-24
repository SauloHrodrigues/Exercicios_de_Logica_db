package exercicio10.entidade;

public class Matriz {

    private Integer[][] matrixInteira;
    private String[][] matrixString;
    private Integer linhas;
    private Integer colunas;

    public Matriz() {
    }

    public void gerarMatrizQuadrada(Integer numero) {
        this.linhas = numero;
        this.colunas = numero;
        gerarMatriz();
    }

    private void gerarMatriz() {
        matrixString = new String[linhas][colunas];
        matrixInteira = new Integer[linhas][colunas];
        Integer conteudo = 0;
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                matrixString[l][c] = l + "." + c;
                matrixInteira[l][c] = conteudo;
                conteudo++;
            }
        }
    }

    public String[][] getMatrixString() {
        return matrixString;
    }

    public Integer[][] getMatrixInteira() {
        return matrixInteira;
    }

    public Integer getSomaDiagonal() {
        Integer soma = 0;

        for (int col = 0; col < colunas; col++) {
            soma += matrixInteira[col][col];
        }
        return soma;
    }

    public void imprimirMatriz() {

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                int tamanho = matrixInteira[l][c].toString().length();
                String espaco = " ";
                if (tamanho == 1) {
                    System.out.print(espaco + espaco + espaco + matrixInteira[l][c] + espaco );
                }
                if (tamanho == 2) {
                    System.out.print(espaco + espaco + matrixInteira[l][c] + espaco );
                }
                if (tamanho == 3) {
                    System.out.print(espaco +  matrixInteira[l][c] + espaco );
                }
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}