package main.java.servicos.impl;

import main.resources.banco.MateriaDB;
import main.java.entidades.*;
import main.java.servicos.IMateria;

import java.util.List;

public class MateriaServico implements IMateria {


    private final MateriaDB materiaDB;

    public MateriaServico() {
        this.materiaDB = new MateriaDB();
    }

    @Override
    public void cadastar(Materia materia) {
        materiaDB.inserirMateria(materia.getAreaEnsino(), materia.getNomeMateria(), materia.getUniversidade(), materia.getProfessor(), materia.getAluno(), materia.getNotaAluno());

    }

    @Override
    public List<Materia> listar() {
        return materiaDB.listarMateria();
    }

    @Override
    public void excluir(Materia materia) {
        materiaDB.excluirMateria(materia.getId());
    }

    @Override
    public Materia buscar(Materia materia) {
        return materiaDB.buscarMateria(materia.getId());
    }
}
