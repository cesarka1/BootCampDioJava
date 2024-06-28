package main.java.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int numero) {
        agendaContatoMap.put(nome, numero);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.containsKey(nome)) {
            System.out.println("Contato não encontrado.");
        } else {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisaPorNome(String Nome) {
        Integer numeroPorNome = null;

        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(Nome);
        }
        return numeroPorNome; 
    }


    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("João", 123456);
        agenda.adicionarContato("Maria", 987654);
        agenda.adicionarContato("Pedro", 456789);
        agenda.adicionarContato("João", 456789);
        agenda.exibirContatos();
        agenda.removerContato("João");
        agenda.exibirContatos();
        System.out.println(agenda.pesquisaPorNome("Maria"));

    }
}
