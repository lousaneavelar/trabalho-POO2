package testes;

import main.java.entidades.Estudante;
import main.java.servicos.impl.EstudanteServico;
import org.junit.Assert;
import org.junit.Test;
import testes.mocks.EstudanteMock;

public class EstudanteTestes {

    private final EstudanteServico estudanteServico;

    public EstudanteTestes() {
        this.estudanteServico = new EstudanteServico();
    }

    @Test
    public void consultaEstudante() {
        Estudante estudante1 = estudanteServico.buscar(EstudanteMock.getEstudante01());
        Assert.assertEquals("Harry Potter", estudante1.getNome());
        Assert.assertEquals("011.111.010-11", estudante1.getCpf());
        Assert.assertEquals("Rua 03", estudante1.getEndereco().getRua());
        Assert.assertEquals("0001", estudante1.getMatricula());

        Estudante estudante2 = estudanteServico.buscar(EstudanteMock.getEstudante02());
        Assert.assertEquals("Hermione Granger", estudante2.getNome());
        Assert.assertEquals("013.122.012-11", estudante2.getCpf());
        Assert.assertEquals("Rua 04", estudante2.getEndereco().getRua());
        Assert.assertEquals("0002", estudante2.getMatricula());
    }


}
