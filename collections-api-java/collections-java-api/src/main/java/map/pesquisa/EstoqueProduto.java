package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProduto() {
        estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, Double preco, int quantidade) {
        estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto() {
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto produto : estoqueProdutoMap.values()) {
                valorTotal += produto.getPreco() * produto.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
      Produto produtoMaisCaro = null;
      double precoMaisCaro = Double.MIN_VALUE;
      for(Produto produto : estoqueProdutoMap.values()){
          if(produto.getPreco() > precoMaisCaro){
              precoMaisCaro = produto.getPreco();
              produtoMaisCaro = produto;
          }
      }
      return produtoMaisCaro;
    }


    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();
        estoqueProduto.exibirProduto();

        estoqueProduto.adicionarProduto(1, "Arroz", 5.0, 10);
        estoqueProduto.adicionarProduto(2, "Feijão", 2.0, 20);
        estoqueProduto.adicionarProduto(3, "Macarrão", 3.0, 30);
        estoqueProduto.adicionarProduto(4, "Açucar", 1.0, 40);
        estoqueProduto.exibirProduto();

        double valorTotalEstoque = estoqueProduto.calcularValorTotalEstoque();
        System.out.println("Valor total do estoque: " + valorTotalEstoque);

        Produto produtoMaisCaro = estoqueProduto.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);
    }
    
}
