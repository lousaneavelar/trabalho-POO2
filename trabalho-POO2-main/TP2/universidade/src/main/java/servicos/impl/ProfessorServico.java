package main.java.servicos.impl;

import main.resources.banco.ProfessorDB;
import main.java.entidades.Professor;
import main.java.servicos.IProfessor;

import java.util.List;

public class ProfessorServico implements IProfessor {

    private final ProfessorDB professorDB;

    public ProfessorServico() {
        this.professorDB = new ProfessorDB();
    }

    @Override
    public void cadastar(Professor professor) {
        professorDB.inserirProfessor(professor.getNome(), professor.getCpf(), professor.getEndereco(), professor.getSexo(), professor.getAreaEnsino(),
                professor.getMateriaLecionada());
    }

    @Override
    public List<Professor> listar() {
        return professorDB.listarProfessor();
    }

    @Override
    public void excluir(Professor professor) {
        professorDB.excluirProfessor(professor.getId());
    }

    @Override
    public Professor buscar(Professor professor) {
        return professorDB.buscarProfessor(professor.getCpf());
    }
}
