package main.java.map.OperacoesBasicas;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(Map<String, Integer> agendaContatoMap) {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public  void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarContato(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome=agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        Map<String, Integer> agendaContatoMap = new HashMap<>();
        AgendaContatos agendaContatos = new AgendaContatos(agendaContatoMap);
        agendaContatos.adicionarContato("João", 123456);
        agendaContatos.adicionarContato("Maria", 987654);
        agendaContatos.adicionarContato("Pedro", 456789);
        agendaContatos.exibirContatos();
        agendaContatos.removerContato("João");
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarContato("Maria"));
        System.out.println(agendaContatos.pesquisarContato("João"));
    }

}
