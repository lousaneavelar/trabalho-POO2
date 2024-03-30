package testes;


import main.java.entidades.Materia;
import main.java.servicos.impl.MateriaServico;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.JUnit4;
import testes.mocks.MateriaMock;
import testes.mocks.NotaMock;

import java.util.Arrays;
import java.util.List;

public class MateriaTestes {

    private final MateriaServico materiaServico;

    public MateriaTestes() {
        this.materiaServico = new MateriaServico();
    }

    @Test
    public void consultaMateria() {
        Materia materia = materiaServico.buscar(MateriaMock.getMateria());
        Assert.assertEquals("POO2", materia.getNomeMateria());
    }

}
