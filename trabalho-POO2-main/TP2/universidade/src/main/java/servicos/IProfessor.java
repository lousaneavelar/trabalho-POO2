package main.java.servicos;

import main.java.entidades.Professor;

import java.util.List;

public interface IProfessor {

    public void cadastar(Professor professor);
    List<Professor> listar();
    public void excluir(Professor professor);
    public Professor buscar(Professor professor);
}
