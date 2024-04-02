package exercicio20.entidade;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private int id = 1;
    private List<Produto> listProduto = new ArrayList<>();

    public Estoque() {
        CarregaDadosEmEstoque carregaDadosEmEstoque = new CarregaDadosEmEstoque();
        this.listProduto = carregaDadosEmEstoque.carregaEstoqueInicial();
    }



    public Produto encontraProduto(String nome){
        Produto produto = null;
            for (int i = 0; i < listProduto.size(); i++) {
            if (listProduto.get(i).getNome().equalsIgnoreCase(nome)){
                produto = listProduto.get(i);
            }
        }
        return produto;
    }

    public Produto encontraProduto(int id){
        Produto produto = null;
            for (int i = 0; i < listProduto.size(); i++) {
            if (listProduto.get(i).getId()==id){
                produto = listProduto.get(i);
            }
        }
        return produto;
    }

    public boolean cadastrarProduto(Produto produto){
        listProduto.add(produto);
        return true;
    }

    public void imprimirCatalogoDoEstoque(){
        System.out.println("******* CATALOGO DO ESTOQUE **********\n");
        for(Produto produto: listProduto){
            System.out.println("--------------------------------------------");
            System.out.println("id          "+produto.getId());
            System.out.println("Nome:       "+produto.getNome());
            System.out.println("Preço:      "+produto.getPreco());
            System.out.println("Quantidade: "+produto.getQuantidadeEmEstoque());
            System.out.println("--------------------------------------------");
        }
    }

    public boolean darBaixaEmEstoque(String nome, int quantidadeParaDarBaixa){

        boolean deuBaixa = false;
        for (int i = 0; i < listProduto.size(); i++) {

            if(listProduto.get(i).getNome().equalsIgnoreCase(nome)){
                listProduto.get(i).setQuantidadeEmEstoque(listProduto.get(i).getQuantidadeEmEstoque()
                        - quantidadeParaDarBaixa);
                deuBaixa = true;
                break;
            }
        }
        return deuBaixa;
    }
    public boolean darBaixaEmEstoque(int id, int quantidadeParaDarBaixa){
        boolean deuBaixa = false;
        for (int i = 0; i < listProduto.size(); i++) {
            if(listProduto.get(i).getId() == id){
                listProduto.get(i).setQuantidadeEmEstoque(listProduto.get(i).getQuantidadeEmEstoque()
                        - quantidadeParaDarBaixa);
                deuBaixa = true;
                break;
            }
        }
        return deuBaixa;
    }

    public int getQuantidadeAtualEmEstoque(Produto produto){
        int quantidadeAtualEmEstoque = 0;
        for (int i = 0; i < listProduto.size() ; i++) {
            if(listProduto.get(i) == produto){
                quantidadeAtualEmEstoque =listProduto.get(i).getQuantidadeEmEstoque();
            }
        }
        return quantidadeAtualEmEstoque;
    }

    public int getPosicaoDoProdutoNaLista(Produto produto){
        int posicaoDoProdutoNaLista = -1;
        for (int i = 0; i < listProduto.size() ; i++) {
            if(listProduto.get(i) == produto){
                posicaoDoProdutoNaLista =i;
            }
        }
        return posicaoDoProdutoNaLista;
    }

    public boolean temEmEstoqueOuNao(Produto produto, int quantidadeParaDarBaixa){
        boolean temOuNao = false;
        for (int i = 0; i < listProduto.size(); i++) {
            if (listProduto.get(i) == produto){
                if (listProduto.get(i).getQuantidadeEmEstoque() >= quantidadeParaDarBaixa){
                    temOuNao = true;
                    break;
                }else{
                    temOuNao = false;
                    break;
                }
            }
        }

        return temOuNao;
    }



    public void testeImpressao(Produto produto){

        System.out.println("--------------------------------------------");
        System.out.println("id          "+produto.getId());
        System.out.println("Nome:       "+produto.getNome());
        System.out.println("Preço:      "+produto.getPreco());
        System.out.println("Quantidade: "+produto.getQuantidadeEmEstoque());
        System.out.println("--------------------------------------------");
    }


}