package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        Produto produto = new Produto(codigo, nome, preco, quantidade);
        produtoSet.add(produto);
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosOrdenados = new TreeSet<>(produtoSet);
        return produtosOrdenados;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtosOrdenados = new TreeSet<>(new ComparatorPreco());
        produtosOrdenados.addAll(produtoSet);
        return produtosOrdenados;
    }



    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();

        // Adicionar produtos
        cadastro.adicionarProduto(1, "Produto B", 10.0, 5);
        cadastro.adicionarProduto(2, "Produto A", 15.0, 3);
        cadastro.adicionarProduto(3, "Produto C", 8.0, 10);
        cadastro.adicionarProduto(3, "Produto D", 8.0, 10);
        
        System.out.println(cadastro.produtoSet);
        
        System.out.println(); 
        
        // Exibir produtos por nome
        System.out.println("Produtos ordenados por nome:");
        System.out.println(cadastro.exibirProdutosPorNome());
        
        System.out.println(); 
        
        // Exibir produtos por nome
        System.out.println("Produtos ordenados por preço:");
        System.out.println(cadastro.exibirProdutoPorPreco());

    }
}
