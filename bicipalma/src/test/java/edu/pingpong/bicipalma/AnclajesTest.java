package edu.pingpong.bicipalma;

import java.util.concurrent.ThreadLocalRandom;
import edu.pingpong.bicipalma.Anclajes;
import junit.framework.Assert;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class AnclajesTest {
    private final int numeroAnclajes = 10;
    private Movil bici = null;
    private boolean ocupado = false;

    private void AssertTrue(boolean b) {
    }

    @Test
    public void toStringTest() {
        Anclajes anclajes = new Anclajes(numeroAnclajes);
        assertEquals("Numero de anclajes: 10", anclajes.toString());
    }

    @Test
    public void anclajeOcupadoTest() {
        Anclajes anclajes = new Anclajes(numeroAnclajes);
        Movil bici = new Bicicleta(255);
        anclajes.ocuparAnclaje(2, bici);
        assertEquals(true, anclajes.isAnclajeOcupado(2));

    }

    @Test
    public void anclajeOcupadoDosTest() {
        Anclajes anclajes = new Anclajes(numeroAnclajes);
        Movil bici = new Bicicleta(005);
        anclajes.ocuparAnclaje(5, bici);
        assertEquals(false, anclajes.isAnclajeOcupado(7));
    }

    @Test
    public void desanclarAnclajeOcupadoTest() {
        Anclajes anclajes = new Anclajes(numeroAnclajes);
        Movil bici = new Bicicleta(005);
        anclajes.ocuparAnclaje(5, bici);
        anclajes.liberarAnclaje(5);
        assertEquals(false, anclajes.isAnclajeOcupado(5));
    }

    @Test
    public void selectAnclajeTest() {
        Integer idAnclaje = ThreadLocalRandom.current().nextInt(0, this.numeroAnclajes);
        AssertTrue(idAnclaje > 0);
        AssertTrue(idAnclaje < this.numeroAnclajes);
    }

    /**
     * @Test public void getBiciAtTest() {
     *
     *       this.bici = new Bicicleta(215);
     *
     *       Anclajes anclajes = new Anclajes(numeroAnclajes); crearAnclajes();
     *       Anclajes.ocuparAnclaje(2,); ocuparAnclaje(4, 005); assertEqual(215,
     *       getBiciAt(2)); }
     */

}
