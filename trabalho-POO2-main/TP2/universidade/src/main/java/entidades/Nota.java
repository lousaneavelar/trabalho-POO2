package main.java.entidades;

public class Nota {

    private Integer id;
    private Double valor;
    private String descricao;
    private String cpfEstudante;
    private String nomeMateria;

    public Nota(Integer id, Double valor, String descricao, String cpfEstudante, String nomeMateria) {
        this.id = id;
        this.valor = valor;
        this.descricao = descricao;
        this.cpfEstudante = cpfEstudante;
        this.nomeMateria = nomeMateria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCpfEstudante() {
        return cpfEstudante;
    }

    public void setCpfEstudante(String cpfEstudante) {
        this.cpfEstudante = cpfEstudante;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }
}
