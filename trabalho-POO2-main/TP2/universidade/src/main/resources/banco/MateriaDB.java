package main.resources.banco;

import main.java.entidades.*;
import testes.mocks.MateriaMock;

import java.util.ArrayList;
import java.util.List;

public class MateriaDB {
    List<Materia> materias;

    public MateriaDB() {
        this.materias = MateriaMock.getMaterias();
    }

    public void inserirMateria(String areaEnsino, String nomeMateria, Universidade universidade, Professor professor, List<Estudante> aluno, List<Nota> notaAluno){
        Materia m = new Materia(countId(), areaEnsino,  nomeMateria, universidade, professor, aluno, notaAluno);
        materias.add(m);
    }

    private int countId() {
        return this.materias.size() + 1;
    }

    public List<Materia> listarMateria(){
        return materias;
    }

    public Materia buscarMateria(Integer identificador) {
        for (Materia m : materias) {
            if (m.getId() == identificador) {
                return m;
            }
        }
        return null;
    }

    public void excluirMateria(Integer identificador) {
        Materia materiaAux = null;
        for (Materia m : materias) {
            if (m.getId() == identificador) {
                materiaAux = m;
            }
        }
        materias.remove(materiaAux);
    }

}
