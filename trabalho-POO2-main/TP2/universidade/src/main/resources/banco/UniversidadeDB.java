package main.resources.banco;

import main.java.entidades.*;

import java.util.ArrayList;
import java.util.List;

public class UniversidadeDB {
    List<Universidade> universidades = new ArrayList<>();

    public void inserirUniversidade(String nomeUniversidade, Endereco endereco){
        Universidade u = new Universidade(countId(), nomeUniversidade, endereco);
        universidades.add(u);
    }

    private int countId() {
        return this.universidades.size() + 1;
    }

    public List<Universidade> listarUniversidades(){
        return universidades;
    }

    public Universidade buscarUniversidade(int identificador) {
        for (Universidade u : universidades) {
            if (u.getId() == identificador) {
                return u;
            }
        }
        return null;
    }

    public void excluirEstudante(Integer identificador) {
        Universidade universidadeAux = null;
        for (Universidade u : universidades) {
            if (u.getId() == identificador) {
                universidadeAux = u;
            }
        }
        universidades.remove(universidadeAux);
    }

}
