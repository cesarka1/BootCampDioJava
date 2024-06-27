package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
   private List<Pessoa> pessoaList;

   public OrdenacaoPessoa() {
    pessoaList = new ArrayList<>();
   }

   public void adicionarPessoa(String nome, int idade, double altura) {
    pessoaList.add(new Pessoa(nome, idade, altura));
   }


   public List<Pessoa> ordernarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
   }

   public List<Pessoa> ordernarPorAltura(){
       List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
       Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
       return pessoaPorAltura;
   }


   public static void main(String[] args) {
    OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
    ordenacaoPessoa.adicionarPessoa("Cesar", 29, 1.75);
    ordenacaoPessoa.adicionarPessoa("João", 25, 1.80);
    ordenacaoPessoa.adicionarPessoa("Maria", 30, 1.60);
    ordenacaoPessoa.adicionarPessoa("Pedro", 28, 1.70);
    ordenacaoPessoa.adicionarPessoa("Ana", 31, 1.65);

    System.out.println(ordenacaoPessoa.pessoaList);

    System.out.println("Ordernar por idade:");
    System.out.println(ordenacaoPessoa.ordernarPorIdade());

    System.out.println("Ordernar por Altura:");
    System.out.println(ordenacaoPessoa.ordernarPorAltura());
   }

}



