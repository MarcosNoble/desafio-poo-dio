import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");;
        mentoria.setDescricao("descrição de mentoria em Jaba");
        mentoria.setData(LocalDate.now());
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp teste java");
        bootcamp.setDescricao("descrição descritiva");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTeste1 = new Dev();
        devTeste1.setNome("senhor1");
        devTeste1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Sr1" + devTeste1.getConteudosInscritos());
        devTeste1.progredir();
        System.out.println("progressão");
        System.out.println("Conteudos concluidos Sr1" + devTeste1.getConteudosConcluidos());
        System.out.println("XP Sr1: " + devTeste1.calcularTotalXp());

        System.out.println("____________");

        Dev devTeste2 = new Dev();
        devTeste2.setNome("senhor2");
        devTeste2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Sr2" + devTeste2.getConteudosInscritos());
        devTeste2.progredir();
        System.out.println("progressão");
        devTeste2.progredir();
        System.out.println("progressão");

        System.out.println("Conteudos concluidos Sr2" + devTeste2.getConteudosConcluidos());
        System.out.println("XP Sr2: " + devTeste2.calcularTotalXp());
        System.out.println("____________");
        System.out.println("Após progressão podemos ver a diferença");
        System.out.println("Conteudos inscritos Sr2" + devTeste2.getConteudosInscritos());



        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
    }
}
