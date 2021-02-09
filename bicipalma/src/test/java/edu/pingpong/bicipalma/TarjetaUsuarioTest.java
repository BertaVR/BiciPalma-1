package edu.pingpong.bicipalma;
import edu.pingpong.bicipalma.TarjetaUsuario;
import org.junit.*;

import static org.junit.Assert.*;


public class TarjetaUsuarioTest {
    private TarjetaUsuario tarjetaUsuario = null;

    @Before
    public void setupTarjetaUsuario() {
        this.tarjetaUsuario = new TarjetaUsuario("uwu", false);
        assertNotNull(tarjetaUsuario);
    }

    @Test
    public void constructorTest() {
        assertNotNull(tarjetaUsuario);
    }

    @Test
    public void isActivadaTest() {
        assertFalse(tarjetaUsuario.isActivada());
    }

    
}
