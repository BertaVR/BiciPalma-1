package edu.pingpong.bicipalma;

import edu.pingpong.bicipalma.Estacion;
import edu.pingpong.bicipalma.Bicicleta;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class EstacionTest {
    private Estacion estacion = null;
    private TarjetaUsuario tarjetaUsuario = null;

    @Before
    public void setupEstacion() {
        this.estacion = new Estacion(1545542, "Calle de la pipa", 6);
        assertNotNull(estacion);
    }

    // @Test
    // public void getterIdTest() {
    // assertEquals(1545542, this.estacion.getId());
    // } (hecho para ver el funcionamiento en formato public de getId)

    // @Test
    // public void getterDireccionTest() {
    // assertEquals("Calle de la pipa", this.estacion.getDireccion());
    // } (hecho para ver el funcionamiento en formato public de getDireccion)

    // @Test
    // public void numAnclajesTest() {
    // assertEquals(6, this.estacion.numAnclajes());
    // } (hecho para ver el funcionamiento en formato public de numAnclajes)

    @Test
    public void toStringTest() {
        assertEquals("id: 1545542 direccion: Calle de la pipa anclajes: 6", estacion.toString());
    }

    @Test
    public void anclajesLibresSinBiciTest() {
        assertEquals(6, estacion.anclajesLibres());
    }

    @Test
    public void acumularAnclajesTest() {
        estacion.anclarBicicleta(new Bicicleta(700));
        assertEquals(5, estacion.anclajesLibres());
        estacion.anclarBicicleta(new Bicicleta(123));
        assertEquals(4, estacion.anclajesLibres());
        estacion.anclarBicicleta(new Bicicleta(922));
        assertEquals(3, estacion.anclajesLibres());

    }

    @Test
    public void anclajesLibresLiberarBiciFalseTest() {
        TarjetaUsuario tarjeta = new TarjetaUsuario("yop", false);
        estacion.retirarBicicleta(tarjeta);
        assertEquals(6, estacion.anclajesLibres());

    }

    @Test
    public void anclajesLibresLiberarBiciTrue() {
        estacion.anclarBicicleta(new Bicicleta(700));
        assertEquals(5, estacion.anclajesLibres());
        TarjetaUsuario tarjeta = new TarjetaUsuario("yop", true);
        estacion.retirarBicicleta(tarjeta);
        assertEquals(6, estacion.anclajesLibres());

    }

}
