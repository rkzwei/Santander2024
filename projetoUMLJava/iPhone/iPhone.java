package iPhone;

import Interfaces.aparelhoTelefonico;
import Interfaces.navegadorInternet;
import Interfaces.reprodutorMusical;

public class iPhone implements aparelhoTelefonico, reprodutorMusical, navegadorInternet {

    public static void main(String[] args) {
        iPhone i = new iPhone();
        i.ligar("1165454356");
        i.atender();
        i.iniciarCorreioVoz();
        i.tocar();
        i.pausar();
        i.selecionarMusica("With Arms Wide Open - Creed");
        i.exibirPagina("www.google.com.br");
        i.adicionarNovaAba();
        i.atualizarPagina();
    }
}
