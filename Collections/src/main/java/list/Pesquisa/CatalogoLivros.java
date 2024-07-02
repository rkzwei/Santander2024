package main.java.list.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() { this.livroList = new ArrayList<>();}

    public void adicionarlivro(String titulo, String autor, int ano){
        livroList.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAno() >= anoInicial && l.getAno() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;

    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args){
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarlivro("Java", "Oracle", 2021);
        catalogo.adicionarlivro("Java2", "Oracle2", 2022);
        catalogo.adicionarlivro("Java3", "Oracle3", 2023);

        System.out.println(catalogo.pesquisarPorAutor("Oracle"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2021, 2022));
        System.out.println(catalogo.pesquisarPorTitulo("Java2"));
    }
}

