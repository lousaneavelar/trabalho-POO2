package testes.mocks;

import main.java.entidades.Estudante;
import main.java.entidades.Materia;
import main.java.entidades.Nota;

import java.util.ArrayList;
import java.util.List;

public class MateriaMock {

    public static Materia getMateria() {
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(EstudanteMock.getEstudante01());
        estudantes.add(EstudanteMock.getEstudante02());

        List<Nota> notas = new ArrayList<>();
        notas.add(NotaMock.getNotaEstudante01());
        notas.add(NotaMock.getNotaEstudante02());

        return new Materia(1,
                "Programação",
                "POO2",
                UniversidadeMock.getUniversidade(),
                ProfessorMock.getProfessor(),
                estudantes,
                notas);
    }

    public static List<Materia> getMaterias() {
        List<Materia> materias = new ArrayList<>();
        materias.add(getMateria());
        return materias;
    }

}
