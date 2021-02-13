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
    public void isnotActivadaTest() {
        assertFalse(tarjetaUsuario.isActivada());
    }

    @Test
    public void inActivadaTest() {
        this.tarjetaUsuario = new TarjetaUsuario("owo", true);
        assertTrue(tarjetaUsuario.isActivada());
    }

    @Test
    public void activacionTest() {
        tarjetaUsuario.setActivada(true);
        assertTrue(tarjetaUsuario.isActivada());
    }

    @Test
    public void anulacionTest() {
        this.tarjetaUsuario = new TarjetaUsuario("owo", true);
        tarjetaUsuario.setActivada(false);
        assertFalse(tarjetaUsuario.isActivada());
    }

    @Test

    public void getterTest() {
        assertEquals("uwu", tarjetaUsuario.getId());

    }

}
