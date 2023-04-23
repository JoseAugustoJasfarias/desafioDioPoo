import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();

        curso1.setTitulo("Curso JavaScript");
        curso1.setDescricao("Descrição curso JavaScript");
        curso1.setCargaHoraria(10);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Curso JavaScript");
        mentoria.setDescricao("Descrição curso JavaScript");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);



    }
}