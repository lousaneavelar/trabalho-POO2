package main.resources.banco;

import main.java.entidades.*;
import testes.mocks.ProfessorMock;

import java.util.ArrayList;
import java.util.List;

public class ProfessorDB {
    List<Professor> professores;

    public ProfessorDB() {
        this.professores = ProfessorMock.getProfessores();
    }

    public void inserirProfessor(String nome, String cpf, Endereco endereco, char sexo, String areaEnsino, List<String> materiaLecionada){
        Professor u = new Professor(countId(), nome, cpf, endereco, sexo, areaEnsino, materiaLecionada);
        professores.add(u);
    }

    private int countId() {
        return this.professores.size() + 1;
    }

    public List<Professor> listarProfessor(){
        return professores;
    }

    public Professor buscarProfessor(String cpf) {
        for (Professor p : professores) {
            if (p.getCpf().equals(cpf)) {
                return p;
            }
        }
        return null;
    }

    public void excluirProfessor(Integer identificador) {
        Professor professorAux = null;
        for (Professor p : professores) {
            if (p.getId() == identificador) {
                professorAux = p;
            }
        }
        professores.remove(professorAux);
    }

}
