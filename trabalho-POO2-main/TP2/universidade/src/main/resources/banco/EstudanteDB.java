package main.resources.banco;

import main.java.entidades.*;
import testes.mocks.EstudanteMock;

import java.util.ArrayList;
import java.util.List;

public class EstudanteDB {
    List<Estudante> estudantes;

    public EstudanteDB() {
        this.estudantes = EstudanteMock.getEstudantes();
    }

    public void inserirEstudante(String nome, String cpf, Endereco endereco, char sexo, String matricula, String periodo ){
        Estudante e = new Estudante(countId(), nome,  cpf, endereco, sexo, matricula, periodo);
        estudantes.add(e);
    }

    private int countId() {
        return this.estudantes.size() + 1;
    }

    public List<Estudante> listarEstudante(){
        return estudantes;
    }

    public Estudante buscarEstudante(Integer identificador) {
        for (Estudante c : estudantes) {
            if (c.getId().equals(identificador)) {
                return c;
            }
        }
        return null;
    }

    public void excluirEstudante(Integer identificador) {
        Estudante estudanteAux = null;
        for (Estudante c : estudantes) {
            if (c.getId().equals(identificador)) {
                estudanteAux = c;
            }
        }
        estudantes.remove(estudanteAux);
    }

}
