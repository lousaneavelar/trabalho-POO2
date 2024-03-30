package main.java.servicos;

import main.java.entidades.Estudante;

import java.util.List;

public interface IEstudante {
     public void cadastar(Estudante estudante);
     List<Estudante> listar();
     public void excluir(Estudante estudante);
     public Estudante buscar(Estudante estudante);

}
