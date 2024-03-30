package main.java.servicos;

import main.java.entidades.Materia;
import main.java.entidades.Nota;

import java.util.List;

public interface INotasServico {

    Nota buscarNotaPorAlunoEMateria(String cpf, String nomeMateria);
    public void cadastarNota(Nota nota);
    List<Nota> listarNota();
    public void excluirNota(Nota nota);


}
