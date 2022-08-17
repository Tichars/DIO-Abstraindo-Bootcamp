import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Do zero ao avançado");
        curso1.getCargaHoraria(45);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Developer");
        curso2.setDescricao("Java avancado");
        curso2.setCargaHoraria(72);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em Java");
        mentoria.setDescricao("Criando primeiro projeto");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp SpringBoot");
        bootcamp.setDescricao("Desenvolva rápido com SpringBoot");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTicha = new Dev();
        devTicha.setNome("Ticha");
        devTicha.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Jean:" + devTicha.getConteudoInscrito());
        devTicha.progredir();
        devTicha.progredir();
        devTicha.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Ticha" + devTicha.getConteudoInscrito());
        System.out.println("Conteudos Concluidos Ticha" + devTicha.getConteudoConcluido());
        System.out.println("XP:" + devTicha.calcularTotalXp());

        System.out.println("------------------------------");

        Dev devJean = new Dev();
        devJean.setNome("Jean");
        devJean.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Jean:" + devJean.getConteudoInscrito());
        devJean.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Jean" + devJean.getConteudoInscrito());
        System.out.println("Conteudos Concluidos Jean" + devJean.getConteudoConcluido());
        System.out.println("XP:" + devJean.calcularTotalXp());
    }
}
