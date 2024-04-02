package exercicio20.entidade;

import java.util.ArrayList;
import java.util.List;

public class CarregaDadosEmEstoque {

    public List<Produto> carregaEstoqueInicial(){
        List<Produto> produtos = new ArrayList<>();
        Produto tv29 = new Produto(1,"TV29",1000.00,20);
        Produto bicicleta = new Produto(2,"Bicicleta",800.00,20);
        Produto lavadora = new Produto(3,"Lavadora 15k ",2500.00,20);
        Produto mouse = new Produto(4,"mouse logitech",150.00,20);
        Produto teclado = new Produto(5,"teclado logitech",200.00,20);
        Produto notebook = new Produto(6,"celerom 3000",3500.00,20);
        Produto ventilado = new Produto(7,"ventrilador 5v",350.00,20);

        produtos.add(tv29);
        produtos.add(bicicleta);
        produtos.add(lavadora);
        produtos.add(mouse);
        produtos.add(teclado);
        produtos.add(notebook);
        produtos.add(ventilado);

        return produtos;
    }


}
