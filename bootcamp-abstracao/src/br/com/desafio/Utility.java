package br.com.desafio;

public class Utility {
    public static void printDevInfo(Dev dev) {
        System.out.println("Conteúdos Inscritos " + dev.getNome() + ": " + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + dev.getNome() + ": " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());
    }
    public static void verificarAssinatura(Dev dev, Bootcamp bootcamp) {
        if (!Bootcamp.checkAssinatura(dev, bootcamp)) {
            System.out.println("Assinatura inválida para o " + bootcamp.getNome());
            System.out.println("Assinatura atual: " + dev.getAssinatura());
            System.out.println("Assinatura necessária: " + bootcamp.getTipoDeAssinatura());
        } else {
            System.out.println("Assinatura válida");
        }
    }
    public static boolean checkCursos(Dev dev, Bootcamp bootcamp) {
        if (dev.getConteudosInscritos().size() >= bootcamp.getConteudos().size()) {
            return true;
        } else {
            System.err.println("Você não está matriculado em todos os conteúdos");
            return false;
        }
    }
}
