package testes.mocks;

import main.java.entidades.Estudante;

import java.util.ArrayList;
import java.util.List;

public class EstudanteMock {

    public static Estudante getEstudante01() {
        return new Estudante(1,
                "Harry Potter",
                "011.111.010-11",
                EnderecoMock.getEnderecoEstudante01(),
                'M',
                "0001",
                "1");
    }

    public static Estudante getEstudante02() {
        return new Estudante(2,
                "Hermione Granger",
                "013.122.012-11",
                EnderecoMock.getEnderecoEstudante02(),
                'F',
                "0002",
                "1");
    }

    public static List<Estudante> getEstudantes() {
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(getEstudante01());
        estudantes.add(getEstudante02());
        return estudantes;
    }

}
