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

    @Test
    public void anclajes_libres_sin_bici(){
        assertEquals(6, estacion.anclajesLibres());
    }

    @Test
    public void anclajes_libres_primera_bici(){
        estacion.anclarBicicleta(new Bicicleta(700));
        assertEquals(5, estacion.anclajesLibres());
    }
    @Test
    public void anclajes_libres_liberar_bici_false(){
        TarjetaUsuario tarjeta = new TarjetaUsuario("yop", false);
        estacion.retirarBicicleta(tarjeta);        
        assertEquals(6, estacion.anclajesLibres());

    }
    @Test
    public void anclajes_libres_liberar_bici_true(){
        estacion.anclarBicicleta(new Bicicleta(700));
        assertEquals(5, estacion.anclajesLibres());
        TarjetaUsuario tarjeta = new TarjetaUsuario("yop", true);
        estacion.retirarBicicleta(tarjeta);        
        assertEquals(6, estacion.anclajesLibres());

    }

    }


    

