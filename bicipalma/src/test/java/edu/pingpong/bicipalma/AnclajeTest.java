package edu.pingpong.bicipalma;

import edu.pingpong.bicipalma.Anclaje;
import edu.pingpong.bicipalma.Movil;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


public class AnclajeTest {
    private boolean ocupado = false;
    private Movil bici = null;

    /*@Before
    public void rellenarAnclaje(){
    Anclaje anclaje = new Anclaje();
    anclaje.anclarBici(new Bicicleta(215));
    assertTrue(anclaje.isOcupado());
    }*/ //Este before no lo sé hacer funcionar


    @Test
    public void anclarBiciTest() {
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(new Bicicleta(215));
        assertTrue(anclaje.isOcupado());
    }
    @Test
    public void getBiciTest() {
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(new Bicicleta(215));
        assertTrue(anclaje.isOcupado());
        anclaje.getBici();
        assertTrue(anclaje.isOcupado());
    }

    @Test
    public void liberarBiciTest() {
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(new Bicicleta(215));
        assertTrue(anclaje.isOcupado());
        anclaje.liberarBici();
        assertTrue(!anclaje.isOcupado());        
    }
    @Test
    public void toStringTest() {
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(new Bicicleta(215));
        assertEquals("Ocupado:true", anclaje.toString());
    } 

}