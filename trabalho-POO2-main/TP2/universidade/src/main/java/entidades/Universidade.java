package main.java.entidades;

public class Universidade {

    private int id;
    private String nomeUniversidade;
    private Endereco endereco;

//    public Universidade() {
//
//    }


    public Universidade(int id, String nomeUniversidade, Endereco endereco) {
        this.id = id;
        this.nomeUniversidade = nomeUniversidade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nomeUniversidade;
    }

    public void setNome(String nome) {
        this.nomeUniversidade = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
