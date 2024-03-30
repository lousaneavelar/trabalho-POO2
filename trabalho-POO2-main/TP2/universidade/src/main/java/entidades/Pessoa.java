package main.java.entidades;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private char sexo;

    public Pessoa(String nome, String cpf, Endereco endereco, char sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
