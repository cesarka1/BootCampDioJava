package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefasList;

    
    public ListaTarefa() {
       this.tarefasList = new ArrayList<>();     
    }

    public void adicionarTarefa(String descricao){
        tarefasList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        tarefasList.removeIf(t -> t.getDescricao().equalsIgnoreCase(descricao));    
    }

    public int obterNumeroTotalTarefas(){
        return tarefasList.size();
    }   

    public void obterDescricoesTarefas(){
        System.out.println(tarefasList);
    }

    public static void main(String[] args) {
      ListaTarefa listaTarefa = new ListaTarefa();
      
      System.out.println("On número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());
      
      listaTarefa.adicionarTarefa("Kauan");
      
      System.out.println("On número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());
      
      listaTarefa.adicionarTarefa("Kauan");
      listaTarefa.adicionarTarefa("Cesar");
      
      System.out.println("On número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());
      
      listaTarefa.removerTarefa("Kauan");
      
      System.out.println("On número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());


      listaTarefa.obterDescricoesTarefas();
    }

}
