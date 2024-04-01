package exercicio20.entidade;

public class Menu {

    public Menu() {
        carregaEstoqueInicial();
    }

    public void controlaMenu(){

    }

    public void mostraEstoque(){

    }

    public void swtchCase(){

    }

    private void carregaEstoqueInicial(){
        Produto tv29 = new Produto(1,"TV29",1000.00,20);
        Produto bicicleta = new Produto(2,"Bicicleta",800.00,20);
        Produto lavadora = new Produto(3,"Lavadora 15k ",2500.00,20);
        Produto mouse = new Produto(4,"mouse logitech",150.00,20);
        Produto teclado = new Produto(5,"teclado logitech",200.00,20);
        Produto notebook = new Produto(6,"celerom 3000",3500.00,20);
        Produto ventilado = new Produto(7,"ventrilador 5v",350.00,20);

        Estoque estoque = new Estoque();
        estoque.cadastrarProduto(tv29);
        estoque.cadastrarProduto(bicicleta);
        estoque.cadastrarProduto(lavadora);
        estoque.cadastrarProduto(mouse);
        estoque.cadastrarProduto(teclado);
        estoque.cadastrarProduto(notebook);
        estoque.cadastrarProduto(ventilado);
    }
}
