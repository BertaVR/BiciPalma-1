package edu.pingpong.bicipalma;

class Anclajes {
private final Anclaje[] anclajes;

    Anclajes(int numAnclajes){
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes(); 
    }
private void crearAnclajes(){
    for (int i = 0; i < anclajes.length; i++){
        this.anclajes[i] = new Anclaje();
    }
} 
Anclaje[] anclajes() {
    return this.anclajes; //devuelve el array
}

int numAnclajes() {
    return this.anclajes.length; //devuelve la longitud del array
}

void ocuparAnclaje(int posicion, Movil bici) {
    this.anclajes[posicion].anclarBici(bici); //le cambia la variable ocupado (definida en anclaje) a true
}

void liberarAnclaje(int posicion) {
    this.anclajes[posicion].liberarBici(); //le cambia la variable ocupado (definida en anclaje) a true
}

boolean isAnclajeOcupado(int posicion) {
    return this.anclajes[posicion].isOcupado();  //Mira si ese anclaje (en función de la posición) está ocupado (método boleano definido en Anclaje)
}



Movil getBiciAt(int posicion) {
return this.anclajes[posicion].getBici(); //mira qué bici hay en ese anclaje que le pasas como parámetro. Te devuelve un id (int) --> el que pedimos en Móvil
}

@Override
public String toString() {
    return "Numero de anclajes: " + Integer.toString(numAnclajes());
}

}


