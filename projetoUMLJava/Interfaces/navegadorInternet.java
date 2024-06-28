package Interfaces;

public interface navegadorInternet {
    default void exibirPagina(String url){
        System.out.println("Exibindo "+url);
    }

    default void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }

    default void atualizarPagina(){
        System.out.println("Atualizando pagina");
    }
}
