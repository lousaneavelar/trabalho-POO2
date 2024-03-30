package main.java.entidades;

import java.util.List;

public class Professor extends Pessoa{

    private int id;
    private String areaEnsino;
    private List<String> materiaLecionada;

    public Professor(int id, String nome, String cpf, Endereco endereco, char sexo, String areaEnsino, List<String> materiaLecionada) {
        super(nome, cpf, endereco, sexo);
        this.id = id;
        this.areaEnsino = areaEnsino;
        this.materiaLecionada = materiaLecionada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getMateriaLecionada() {
        return materiaLecionada;
    }

    public void setMateriaLecionada(List<String> materiaLecionada) {
        this.materiaLecionada = materiaLecionada;
    }

    public String getAreaEnsino() {
        return areaEnsino;
    }

    public void setAreaEnsino(String areaEnsino) {
        this.areaEnsino = areaEnsino;
    }

}
