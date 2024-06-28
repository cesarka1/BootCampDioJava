package main.java.map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Eventos> eventosMap;

    public AgendaEventos() {
        eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Eventos(nome, atracao));
    }


    public void exibirAgenda(){
        Map<LocalDate, Eventos> eventoTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventoTreeMap);
    }
    
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Eventos> eventoTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Eventos> entry : eventoTreeMap.entrySet()){
           if(entry.getKey().isAfter(dataAtual) || entry.getKey().isEqual(dataAtual)){

            System.out.println("O proximo evento " + entry.getValue() + " acontecera na data " +entry.getKey());
            break;
           }
        }
        
    }

    public static void main(String[] args) {
      AgendaEventos agendaEventos = new AgendaEventos();  
      agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 15), "Festa", "Casa");
      agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 10), "Casamento", "Restaurante");
      agendaEventos.adicionarEvento(LocalDate.of(2023, 7, 20), "Formatura", "Museu");
      agendaEventos.exibirAgenda();

      agendaEventos.obterProximoEvento();
    }



}
