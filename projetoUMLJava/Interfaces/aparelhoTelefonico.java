package Interfaces;

public interface aparelhoTelefonico {

    default void ligar(String numero){
        System.out.println("Ligando para "+numero);
    }
    default void atender(){
        System.out.println("Atendendo");
    }
    default void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }
}
