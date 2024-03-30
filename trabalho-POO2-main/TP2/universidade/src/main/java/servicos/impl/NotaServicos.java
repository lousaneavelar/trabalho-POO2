package main.java.servicos.impl;

import main.resources.banco.NotaDB;
import main.java.entidades.Nota;
import main.java.servicos.INotasServico;

import java.util.List;

public class NotaServicos implements INotasServico {

    private final NotaDB notaDB;

    public NotaServicos() {
        this.notaDB = new NotaDB();
    }

    @Override
    public Nota buscarNotaPorAlunoEMateria(String cpf, String nomeMateria) {
        return notaDB.buscarNotaPorAlunoEMateria(cpf, nomeMateria);
    }

    @Override
    public void cadastarNota(Nota nota) {
        notaDB.inserirNota(nota.getValor(), nota.getDescricao(), nota.getCpfEstudante(), nota.getNomeMateria());
    }

    @Override
    public List<Nota> listarNota() {
        return notaDB.listarNota();
    }

    @Override
    public void excluirNota(Nota nota) {
        notaDB.excluirNota(nota.getId());
    }



}
