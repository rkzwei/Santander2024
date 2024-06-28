package Interfaces;

public interface reprodutorMusical {
    default void tocar(){
        System.out.println("Tocando musica");
    }
    default void pausar(){
        System.out.println("Pausando musica");
    }
    default void selecionarMusica(String musica){
        System.out.println("Selecionando "+musica);
    }

}
