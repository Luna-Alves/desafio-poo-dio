import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descriçao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descriçao curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devClara = new Dev();
        devClara.setNome("Clara");
        devClara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Clara" + devClara.getConteudosInscritos());
        devClara.progredir();
        devClara.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos de Clara" + devClara.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Clara" + devClara.getConteudosConcluidos());
        System.out.println("XP" + devClara.calcularTotalXp());

        System.out.println("---------------");

        Dev devLuna = new Dev();
        devLuna.setNome("Luna");
        devLuna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Luna" + devLuna.getConteudosInscritos());
        devLuna.progredir();
        devLuna.progredir();
        devLuna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos de Luna" + devLuna.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Luna" + devLuna.getConteudosConcluidos());
        System.out.println("XP" + devLuna.calcularTotalXp());

    }
}
