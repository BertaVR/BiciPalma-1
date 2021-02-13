package edu.pingpong.bicipalma;


import edu.pingpong.bicipalma.Anclajes;
import org.junit.Test;
import static org.junit.Assert.*;


public class AnclajesTest {
    private final int numeroAnclajes = 10;

        @Test
        public void toStringTest() {
            Anclajes anclajes = new Anclajes(numeroAnclajes);
            assertEquals("Numero de anclajes: 10", anclajes.toString());
        } 
    
}
