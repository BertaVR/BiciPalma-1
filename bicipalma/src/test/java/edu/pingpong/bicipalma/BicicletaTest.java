package edu.pingpong.bicipalma;

import edu.pingpong.bicipalma.Bicicleta;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class BicicletaTest {

    private Bicicleta bici = null;

    @Before
    public void setupBicicleta() {
        this.bici = new Bicicleta(215);
    }

    @Test
    public void constructorTest() {

        assertNotNull(this.bici);
    }

    @Test
    public void getNumber() {
        assertEquals(215, this.bici.getId());
    }

    @Test

    public void toStringTest() {
        assertEquals("215", Integer.toString(this.bici.getId()));
    }

}