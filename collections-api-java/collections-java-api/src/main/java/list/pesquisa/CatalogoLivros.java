package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livros> livrosList;

    public CatalogoLivros() {
        livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livros(titulo, autor, anoPublicacao));
    }

    public List<Livros> pesquisaPorAutor(String autor){
        List<Livros> livrosFiltrados = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livros livros : livrosList){
                if(livros.getAutor().equalsIgnoreCase(autor)){
                    livrosFiltrados.add(livros);
                }
            }
            
        }
        return livrosFiltrados;
    }  



    public  List<Livros> pequisaPorIntevalosAnos(int anoInicial, int anoFinal){
        List<Livros> livrosFiltrados = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livros livros : livrosList){
                if(livros.getAnoPublicacao() >= anoInicial && livros.getAnoPublicacao() <= anoFinal){
                    livrosFiltrados.add(livros);
                }
            }

        }
        return livrosFiltrados;
    }


    public Livros pesquisaPorTitulo(String titulo){
        Livros livroPortitulo = null;
        for(Livros livros : livrosList){
            if(livros.getTitulo().equalsIgnoreCase(titulo)){
                livroPortitulo = livros;
                break;
            }
        }
        return livroPortitulo;
    }


}
