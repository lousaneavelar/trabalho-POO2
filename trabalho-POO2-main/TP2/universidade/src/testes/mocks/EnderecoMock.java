package testes.mocks;

import main.java.entidades.Endereco;
import main.java.entidades.Universidade;

public class EnderecoMock {

    public static Endereco getEnderecoUniversidade() {
        return new Endereco("Rua 01", 1, "Bairro 01", "01001-001", "Sem complemento");
    }

    public static Endereco getEnderecoProfessor() {
        return new Endereco("Rua 02", 2, "Bairro 02", "02002-002", "Bloco 1, Apt 10");
    }

    public static Endereco getEnderecoEstudante01() {
        return new Endereco("Rua 03", 3, "Bairro 03", "03003-003", "Bloco 12, Apt 09");
    }

    public static Endereco getEnderecoEstudante02() {
        return new Endereco("Rua 04", 4, "Bairro 03", "04004-004", "Bloco 11, Apt 02");
    }

}
