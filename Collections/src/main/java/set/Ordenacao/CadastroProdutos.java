package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributo
    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProtudo(String nome, double preco, int quantidade, long cod){
        produtoSet.add(new Produto(nome, preco, quantidade, cod));
    }

    public Set<Produto> exibirProdutosPorNome(){

        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;

    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main (String[] args) {

        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.adicionarProtudo("Coca-cola", 2.50, 10, 1);
        cadastro.adicionarProtudo("Fanta", 2.50, 10, 2);
        cadastro.adicionarProtudo("Pepsi", 2.50, 10, 3);
        cadastro.adicionarProtudo("Guarana", 2.50, 10, 4);
        cadastro.adicionarProtudo("Coca-cola", 2.50, 10, 5);
        System.out.println(cadastro.produtoSet + "\n\n");
//        System.out.println("test");
        System.out.println(cadastro.exibirProdutosPorNome());
        System.out.println(cadastro.exibirProdutosPorPreco());

    }

}
