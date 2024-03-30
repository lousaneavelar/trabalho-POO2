package testes.mocks;

import main.java.entidades.Nota;

import java.util.ArrayList;
import java.util.List;

public class NotaMock {

    public static Nota getNotaEstudante01() {
        return new Nota(1, 5.5, "P1", "011.111.010-11", "POO2");
    }

    public static Nota getNotaEstudante02() {
        return new Nota(2, 7.5, "P1", "013.122.012-11", "POO2");
    }

    public static List<Nota> getNotas() {
        List<Nota> notas = new ArrayList<>();
        notas.add(getNotaEstudante01());
        notas.add(getNotaEstudante02());
        return notas;
    }

}
