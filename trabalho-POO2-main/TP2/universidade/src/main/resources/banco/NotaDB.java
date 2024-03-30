package main.resources.banco;

import main.java.entidades.*;
import testes.mocks.NotaMock;

import java.util.ArrayList;
import java.util.List;

public class NotaDB {

    List<Nota> notas;

    public NotaDB() {
        this.notas = NotaMock.getNotas();
    }

    public void inserirNota(Double valor, String descricao, String cpfEstudante, String nomeMateria){
        Nota e = new Nota(countId(), valor,  descricao, cpfEstudante, nomeMateria);
        notas.add(e);
    }

    private int countId() {
        return this.notas.size() + 1;
    }

    public List<Nota> listarNota(){
        return notas;
    }

    public Nota buscarNotaPorAlunoEMateria(String cpf, String nomeMateria) {
        for (Nota n : notas) {
            if (n.getCpfEstudante().equals(cpf) && n.getNomeMateria().equals(nomeMateria)) {
                return n;
            }
        }
        return null;
    }

    public void excluirNota(Integer identificador) {
        Nota notaeAux = null;
        for (Nota c : notas) {
            if (c.getId().equals(identificador)) {
                notaeAux = c;
            }
        }
        notas.remove(notaeAux);
    }

}
