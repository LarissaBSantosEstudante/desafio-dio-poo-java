import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main() {
        Curso curso1 = new Curso("Sintaxe Básica com Java", "descrição >> Java + QA", 6d);
        Curso curso2 = new Curso("Programação Orientada a Objetos", "descrição >> Java + QA", 9d);

        Mentoria mentoria1 = new Mentoria("Apresentação do curso", "Primeira mentoria do curso de Java + QA", LocalDate.of(2025, 10, 13));
        Mentoria mentoria2 = new Mentoria("Testes Automatizados com Java e IA", "Última mentoria do curso de Java + QA", LocalDate.of(2025, 11, 5));

        /*
            System.out.println(curso1);
            System.out.println(curso2);
            System.out.println(mentoria1);
            System.out.println(mentoria2);
         */

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java + QA", "", LocalDate.of(2025, 12, 1));
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);
        //System.out.println(bootcamp.getConteudos());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}
