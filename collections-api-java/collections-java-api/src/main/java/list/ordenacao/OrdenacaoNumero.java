package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {

    private List<Integer> numeroList;

    public OrdenacaoNumero() {
        numeroList = new ArrayList<>();
    }

    public void adicionarNumero(Integer numero) {
        numeroList.add(numero);
    }

    public List<Integer> ordernarAscendente() {
        List<Integer> numeroListAsc = new ArrayList<>(numeroList);
        Collections.sort(numeroListAsc);
        return numeroListAsc;
    }

    public List<Integer> ordernarDescendente() {
        List<Integer> numeroListDesc = new ArrayList<>(numeroList);
        numeroListDesc.sort(Collections.reverseOrder());
        return numeroListDesc;  
    }

    public void exibirNumeros() {
        if (!numeroList.isEmpty()) {
          System.out.println(this.numeroList);
        } else {
          System.out.println("A lista está vazia!");
        }
      }

 
    public static void main(String[] args) {
        OrdenacaoNumero on = new OrdenacaoNumero();

        on.adicionarNumero(20);
        on.adicionarNumero(10);
        on.adicionarNumero(5);
        on.adicionarNumero(15);
        on.adicionarNumero(30);

        System.out.println(on.numeroList);
        
        System.out.println(on.ordernarAscendente());

        System.out.println(on.ordernarDescendente());
        
    }


    @Override  
    public String toString() {
        return "OrdenacaoNumero{" +
                "numeroList=" + numeroList +
                '}';
    }
}
