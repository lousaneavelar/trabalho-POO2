package main.java.entidades;

import java.util.List;

public class Materia {

    private int id;
    private String areaEnsino;
    private String nomeMateria;
    private Universidade universidade;
    private Professor professor;
    private List<Estudante> aluno;
    private List<Nota> notaAluno;

    public Materia(int id, String areaEnsino, String nomeMateria, Universidade universidade, Professor professor, List<Estudante> aluno, List<Nota> notaAluno) {
        this.id = id;
        this.areaEnsino = areaEnsino;
        this.nomeMateria = nomeMateria;
        this.universidade = universidade;
        this.professor = professor;
        this.aluno = aluno;
        this.notaAluno = notaAluno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAreaEnsino() {
        return areaEnsino;
    }

    public void setAreaEnsino(String areaEnsino) {
        this.areaEnsino = areaEnsino;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Estudante> getAluno() {
        return aluno;
    }

    public void setAluno(List<Estudante> aluno) {
        this.aluno = aluno;
    }

    public List<Nota> getNotaAluno() {
        return notaAluno;
    }

    public void setNotaAluno(List<Nota> notaAluno) {
        this.notaAluno = notaAluno;
    }

}
