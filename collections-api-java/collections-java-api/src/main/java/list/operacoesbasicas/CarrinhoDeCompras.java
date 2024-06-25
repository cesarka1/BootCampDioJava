package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompras;
    
    public CarrinhoDeCompras() {
        carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        carrinhoDeCompras.removeIf(item -> item.getNome().equalsIgnoreCase(nome));
    }

    public void calcularValorTotal()
    {
        double total = 0;
        for (Item item : carrinhoDeCompras) {
          total += item.getPreco() * item.getQuantidade(); 
        }
        System.out.println(total);
    }


    public void exibirItens(){
        System.out.println(carrinhoDeCompras);
    }


    public static void main(String[] args) {
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Produto A", 10, 2);
        carrinho.adicionarItem("Produto B", 20, 1);
        carrinho.adicionarItem("Produto C", 30, 3);

        carrinho.exibirItens();

        carrinho.removerItem("Produto B");

        carrinho.exibirItens();

        carrinho.calcularValorTotal();
    }
}
