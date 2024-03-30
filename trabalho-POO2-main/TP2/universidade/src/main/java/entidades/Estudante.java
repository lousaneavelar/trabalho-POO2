package main.java.entidades;

public class Estudante extends Pessoa{

    private Integer id;
    private String matricula;
    private String periodo;

    public Estudante(Integer id, String nome, String cpf, Endereco endereco, char sexo, String matricula, String periodo) {
        super(nome, cpf, endereco, sexo);
        this.id = id;
        this.matricula = matricula;
        this.periodo = periodo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
