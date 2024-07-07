package br.com.desafio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private String tipoDeAssinatura;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new HashSet<>();

    public String getNome() {
        return nome;
    }
    public static boolean checkAssinatura(Dev dev, Bootcamp bootcamp) {
        String devAssinatura = dev.getAssinatura();
        String bootcampAssinatura = bootcamp.getTipoDeAssinatura();

        if (!devAssinatura.equals(bootcampAssinatura)){
            return bootcampAssinatura.equals("Free") || (devAssinatura.equals("Global"));
        }
        return true;
    }
    public String getTipoDeAssinatura() {
        return tipoDeAssinatura;
    }

    public void setTipoDeAssinatura(String tipoDeAssinatura) {
        if (tipoDeAssinatura.equalsIgnoreCase("Premium") || tipoDeAssinatura.equalsIgnoreCase("Global")) {
            this.tipoDeAssinatura = tipoDeAssinatura;
        } else {
            this.tipoDeAssinatura = "Free";
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataInicial() {
        return dataInicial;
    }
    public LocalDate getDataFinal() {
        return dataFinal;
    }
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(getNome(), bootcamp.getNome()) && Objects.equals(getDescricao(), bootcamp.getDescricao()) && Objects.equals(getDataInicial(), bootcamp.getDataInicial()) && Objects.equals(getDataFinal(), bootcamp.getDataFinal()) && Objects.equals(getDevsInscritos(), bootcamp.getDevsInscritos()) && Objects.equals(getConteudos(), bootcamp.getConteudos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getDataInicial(), getDataFinal(), getDevsInscritos(), getConteudos());
    }
}
