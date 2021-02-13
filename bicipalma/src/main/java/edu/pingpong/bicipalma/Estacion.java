package edu.pingpong.bicipalma;

import java.util.Arrays;
import java.util.Optional;
import edu.pingpong.bicipalma.*;

public class Estacion {
    private final int id;
    private final String direccion;
    private final Anclajes anclajes;

    public Estacion(int id, String direccion, int numAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numAnclajes); // esto es el número de anclajes

    }

    private int getId() {
        return id;
    }

    private String getDireccion() {
        return direccion;
    }

    private Anclaje[] anclajes() {
        return this.anclajes.anclajes();
    }

    private int numAnclajes() {
        return this.anclajes.numAnclajes();
    }

    @Override
    public String toString() {
        return String.format("id: %d direccion: %s anclajes: %s", // COMENTAR
                getId(), getDireccion(), numAnclajes());
    }

    public void consultarEstacion() {
        System.out.println(this);
    }

    public long anclajesLibres() {

        return Arrays.stream(anclajes()).filter(a -> !a.isOcupado()).count();

    }

    public void anclarBicicleta(Movil bici) {
        int posicion = 0;
        int numAnclaje = posicion + 1;
        for (Anclaje anclaje : anclajes()) {
            if (!anclaje.isOcupado()) {
                anclajes.ocuparAnclaje(posicion, bici);

                break;
            } else {
                posicion++;
            }
            numAnclaje++;

        }
    }

    public boolean leerTarjetaUsuario(Autenticacion tarjetaUsuario) {
        return tarjetaUsuario.isActivada();
    }

    public void retirarBicicleta(Autenticacion tarjetaUsuario) {

        if (leerTarjetaUsuario(tarjetaUsuario)) {

            Optional<Anclaje> anclajeOcupado = Arrays.stream(anclajes()).filter(Anclaje::isOcupado).findAny();

            if (anclajeOcupado.isPresent()) {

                // mostrarBicicleta(anclajeOcupado.get().getBici());
                anclajeOcupado.get().liberarBici();

            } else {
                System.out.println("No hay bicis");
            }

        } else {
            System.out.println("Tarjeta de usuario inactiva :(");
        }
    }

    private void mostrarBicicleta(Movil bici, int numeroAnclaje) {
        System.out.println("bicicleta retirada " + bici.getId() + " del anclaje: " + numeroAnclaje);
    }

    private void mostrarAnclaje(Movil bici, int numeroAnclaje) {
        System.out.println("bicicleta" + bici.getId() + "anclada en el anclaje" + numeroAnclaje);
    }

    public void consultarAnclajes() {
        Arrays.stream(anclajes()).map(a -> Optional.ofNullable(a.getBici()))
                .forEach(bici -> System.out.print("Anclaje " + (bici.isPresent() ? bici.get() : "libre") + '\n'));
    }
    // FORMA FACILITA DE HACERLO
    /**
     * int posicion = 0; int numeroAnclaje = 0;
     * 
     * for (Anclaje anclaje : anclajes()) { numeroAnclaje = posicion + 1; if
     * (anclaje.isOcupado()) { System.out.println("Anclaje " + numeroAnclaje + " " +
     * anclaje.getBici().getId()); } else { System.out.println("Anclaje " +
     * numeroAnclaje + " " + " libre"); } posicion++; }
     */
}

// }
// }
