package testes.mocks;

import main.java.entidades.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorMock {

    public static Professor getProfessor() {
        List<String> materiasLecionadas = new ArrayList<>();
        materiasLecionadas.add("POO");
        materiasLecionadas.add("POO2");
        return new Professor(1, "João", "012.121.012-21", EnderecoMock.getEnderecoProfessor(), 'M', "Programação", materiasLecionadas);
    }

    public static List<Professor> getProfessores(){
        List<Professor> professores = new ArrayList<>();
        professores.add(getProfessor());
        return professores;
    }

}
