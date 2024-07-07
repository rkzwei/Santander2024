import br.com.desafio.Bootcamp;
import br.com.desafio.Curso;
import br.com.desafio.Dev;
import br.com.desafio.Mentoria;
import br.com.desafio.Utility;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setTempoCurso(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso node");
        curso2.setDescricao("descrição curso node");
        curso2.setTempoCurso(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.setTipoDeAssinatura("Global");

        Dev devNeves = new Dev();
        devNeves.setNome("Neves");
        devNeves.setAssinatura(3);
        devNeves.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Neves:" + devNeves.getConteudosInscritos());
        if (Utility.checkCursos(devNeves, bootcamp)) {
            devNeves.progredir();
            devNeves.progredir();
            devNeves.progredir();
        }
        System.out.println("-");
        Utility.printDevInfo(devNeves);

        System.out.println("-------");

        Dev devPablo = new Dev();
        devPablo.setNome("Pablo");
        devPablo.setAssinatura(2);
        devPablo.inscreverBootcamp(bootcamp);
        if (Utility.checkCursos(devPablo, bootcamp)) {
            System.out.println("Conteúdos Inscritos Pablo:" + devPablo.getConteudosInscritos());
            devPablo.progredir();
            devPablo.progredir();
            devPablo.progredir();
        }
        System.out.println("-");
        Utility.printDevInfo(devPablo);


    }

}