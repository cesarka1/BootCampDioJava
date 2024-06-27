package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;
public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        contatoSet = new HashSet<>();
    }
    
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }


    public void exibirContatos() {
        System.out.println(contatoSet);
    }


    public Set<Contato> pesquisPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().equals(nome)) {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizaNumeroContato (String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if(c.getNome().equals(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado =  c;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Cesar", 123456);
        agenda.adicionarContato("Cesar", 111111);
        agenda.adicionarContato("Cesar Kauan", 111111);
        agenda.adicionarContato("Joao", 654321);
        agenda.adicionarContato("Maria", 987654);
        agenda.exibirContatos();

        System.out.println("Contatos com nome Cesar: " + agenda.pesquisPorNome("Cesar"));
        System.out.println("Contato atualizado: " + agenda.atualizaNumeroContato("Joao", 555555));
    }
    
}
