package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private static List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public static void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new Pessoa.ComparatorPorAltura());
        return pessoasPorAltura;

    }
    public static void main(String[] args) {

        OrdenacaoPessoa OrdenacaoPessoa = new OrdenacaoPessoa();

        OrdenacaoPessoa.adicionarPessoa("João", 25, 1.75);
        OrdenacaoPessoa.adicionarPessoa("Maria", 53, 1.35);
        OrdenacaoPessoa.adicionarPessoa("Pedro", 15, 1.95);

        System.out.println(OrdenacaoPessoa.ordenarPorIdade());
        System.out.println(OrdenacaoPessoa.ordenarPorAltura());
    }
}
