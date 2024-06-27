package main.java.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoDeConvite(int codigoConvite) { 
        Convidado convidadoParaRemover = null;

        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        
        if(convidadoParaRemover != null)
            convidadoSet.remove(convidadoParaRemover);
        else
        System.out.println("Não existe um convidado com esse código!");    
    }


    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        ConjuntoConvidados cc = new ConjuntoConvidados();
        System.out.println("Existem " + cc.contarConvidados() + " convidado(s) dentro do set de Convidados!");
        
        cc.adicionarConvidado("Cesar", 1);
        cc.adicionarConvidado("João", 2);
        cc.adicionarConvidado("Maria", 3);
        cc.adicionarConvidado("Ana", 4);
        cc.adicionarConvidado("José", 5);
        
        System.out.println("Existem " + cc.contarConvidados() + " convidado(s) dentro do set de Convidados!");
        cc.exibirConvidados();
        cc.removerConvidadoPorCodigoDeConvite(4);
        
        
        System.out.println("Existem " + cc.contarConvidados() + " convidado(s) dentro do set de Convidados!");
    }
}