package edu.pingpong.bicipalma;

import edu.pingpong.bicipalma.Movil;

public class Bicicleta implements Movil {
    private final int id;

    public Bicicleta(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return Integer.toString(getId());
    }

}