package exercicio16;

import exercicio16.entidade.Emprestimo;
import exercicio16.entidade.Livro;
import exercicio16.entidade.Pessoa;

public class RealizarEmprestimo {
    public static void main(String[] args) {
        Pessoa saulo = new Pessoa(1,"saulo Henrique","222.222.222-60");
        Emprestimo emprestimo01 = new Emprestimo(1,"02/02/2024","10/02/2024",saulo);
        emprestimo01.addLivroEmprestimo(new Livro(1,"Direito Constucional",1200));
        emprestimo01.addLivroEmprestimo(new Livro(1,"SQL",700));
        emprestimo01.addLivroEmprestimo(new Livro(1,"Java para Leigos",200));
        emprestimo01.addLivroEmprestimo(new Livro(1,"Excell",150));

        System.out.println(emprestimo01);
    }
}
