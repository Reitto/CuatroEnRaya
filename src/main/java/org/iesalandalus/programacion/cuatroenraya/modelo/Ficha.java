//Adrián Visiedo Rodríguez
package org.iesalandalus.programacion.cuatroenraya.modelo;

public enum Ficha {
    VERDE("V"),
    AZUL("A");

    private final String cadenaMostrar;

    Ficha(String nombre) {
        this.cadenaMostrar = nombre;
    }

    @Override
    public String toString() {
        return cadenaMostrar;
    }

}
