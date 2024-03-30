package testes;

import main.java.entidades.Professor;
import main.java.servicos.impl.ProfessorServico;
import org.junit.Assert;
import org.junit.Test;
import testes.mocks.ProfessorMock;

import java.util.Arrays;
import java.util.List;

public class ProfessorTestes {

    private final ProfessorServico professorServico;

    public ProfessorTestes() {
        this.professorServico = new ProfessorServico();
    }

    @Test
    public void consultaProfessor() {
        List<String> materiasEsperadas = Arrays.asList("POO", "POO2");
        Professor professor = professorServico.buscar(ProfessorMock.getProfessor());
        Assert.assertEquals("João", professor.getNome());
        Assert.assertEquals("012.121.012-21", professor.getCpf());
        Assert.assertEquals(materiasEsperadas, professor.getMateriaLecionada());
    }

}
