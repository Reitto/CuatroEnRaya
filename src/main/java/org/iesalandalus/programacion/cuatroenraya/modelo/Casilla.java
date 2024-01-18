//Adrián Visiedo Rodríguez
package org.iesalandalus.programacion.cuatroenraya.modelo;

import javax.naming.OperationNotSupportedException;

public class Casilla {
    Ficha ficha;

    Casilla(){
        ficha = null;
    }

    boolean estaOcupado(){
        return ficha != null;
    }
    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) throws OperationNotSupportedException {
        if (ficha==null){
            throw new NullPointerException("No se puede poner una ficha nula.");
        }
        if (estaOcupado()){
            throw new OperationNotSupportedException("La casilla ya contiene una ficha.");
        }
        this.ficha = ficha;
    }

    @Override
    public String toString() {
        String retornado= " ";
        if (ficha != null) {
            retornado = String.format("%s", this.ficha);
        }
        return retornado;
    }
}
