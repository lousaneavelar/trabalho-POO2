package main.java.servicos;

import main.java.entidades.Materia;

import java.util.List;

public interface IMateria {

    public void cadastar(Materia materia);
    List<Materia> listar();
    public void excluir(Materia materia);
    public Materia buscar(Materia materia);
}
