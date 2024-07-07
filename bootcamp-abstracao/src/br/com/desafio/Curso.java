package br.com.desafio;

public class Curso extends Conteudo{

    private int tempoCurso;

    @Override
    public double calcularXp() {
        return XP_PADRAO * tempoCurso;
    }

    public Curso() {
    }


    public int getTempoCurso() {
        return tempoCurso;
    }

    public void setTempoCurso(int tempoCurso) {
        this.tempoCurso = tempoCurso;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", tempoCurso=" + tempoCurso +
                '}';
    }
}