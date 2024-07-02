package main.java.map.Pesquisa;


import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private static Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos(Map<Long, Produto> estoqueProdutosMap) {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }
    public static void main(String[] args){
        EstoqueProdutos estoque = new EstoqueProdutos(estoqueProdutosMap);
        estoque.exibirProdutos();

        estoque.adicionarProduto(1, "Coca Cola", 3.5, 10);
        estoque.adicionarProduto(2, "Fanta", 5.4, 10);
        estoque.adicionarProduto(3, "Guarana", 1.5, 10);
        estoque.exibirProdutos();
        System.out.println(estoque.calcularValorTotalEstoque());
        System.out.println(estoque.obterProdutoMaisCaro());
    }
}
