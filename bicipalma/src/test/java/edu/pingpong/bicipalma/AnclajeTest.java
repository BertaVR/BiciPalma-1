package edu.pingpong.bicipalma;

import edu.pingpong.bicipalma.Anclaje;
import edu.pingpong.bicipalma.Movil;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AnclajeTest {
    private boolean ocupado = false;
    private Movil bici = null;

    @Before
    public void setupBicicleta() {
        this.bici = new Bicicleta(215);
    }

    @Test
    public void constructorTest() {
        assertNotNull(this.ocupado);
        assertNotNull(this.bici);
    }

    @Test
    public void getBici() {
        assertEquals(215, Movil.Anclaje.getBici(bici));
    }
}