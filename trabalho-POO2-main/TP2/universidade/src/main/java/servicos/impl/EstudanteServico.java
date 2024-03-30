package main.java.servicos.impl;

import main.resources.banco.EstudanteDB;
import main.java.entidades.Estudante;
import main.java.servicos.IEstudante;

import java.util.List;

public class EstudanteServico implements IEstudante {

    private final EstudanteDB estudanteDB;

    public EstudanteServico() {
        this.estudanteDB = new EstudanteDB();
    }

    @Override
    public void cadastar(Estudante estudante) {
        estudanteDB.inserirEstudante(estudante.getNome(), estudante.getCpf(), estudante.getEndereco(),
                estudante.getSexo(), estudante.getMatricula(), estudante.getPeriodo());
    }

    @Override
    public List<Estudante> listar() {
        return estudanteDB.listarEstudante();
    }

    @Override
    public void excluir(Estudante estudante) {

        estudanteDB.excluirEstudante(estudante.getId());
    }

    @Override
    public Estudante buscar(Estudante estudante) {

        return estudanteDB.buscarEstudante(estudante.getId());
    }
}
