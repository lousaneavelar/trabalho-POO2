package testes.mocks;

import main.java.entidades.Universidade;

public class UniversidadeMock {

    public static Universidade getUniversidade() {
        return new Universidade(1, "UFU", EnderecoMock.getEnderecoUniversidade());
    }

}
