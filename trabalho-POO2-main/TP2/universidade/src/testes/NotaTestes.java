package testes;

import main.java.entidades.Nota;
import main.java.servicos.impl.NotaServicos;
import org.junit.Assert;
import org.junit.Test;
import testes.mocks.EstudanteMock;
import testes.mocks.MateriaMock;

public class NotaTestes {

    private final NotaServicos notaServicos;

    public NotaTestes() {
        this.notaServicos = new NotaServicos();
    }

    @Test
    public void NotaTestes() {
        Nota nota1 = notaServicos.
                buscarNotaPorAlunoEMateria(EstudanteMock.getEstudante01().getCpf(),
                        MateriaMock.getMateria().getNomeMateria());
        Assert.assertEquals(String.valueOf(5.5), nota1.getValor().toString());
        Assert.assertEquals("011.111.010-11", nota1.getCpfEstudante());
        Assert.assertEquals("POO2", nota1.getNomeMateria());
        Nota nota2 = notaServicos.
                buscarNotaPorAlunoEMateria(EstudanteMock.getEstudante02().getCpf(),
                        MateriaMock.getMateria().getNomeMateria());
        Assert.assertEquals(String.valueOf(7.5), nota2.getValor().toString());
        Assert.assertEquals("013.122.012-11", nota2.getCpfEstudante());
        Assert.assertEquals("POO2", nota1.getNomeMateria());
    }

}
