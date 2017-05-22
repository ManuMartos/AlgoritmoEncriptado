package com.company.datos;

/**
 * Created by Manu on 22/05/2017.
 */
public class AlgoritmoMultiplicacion implements Algoritmo{

    private int numero;

    public AlgoritmoMultiplicacion(int numero) {
        this.numero = numero;
    }

    @Override
    public int encriptar(int param) {

        return param * numero;
    }

    @Override
    public int desencriptar(int param) {
        return param / numero;
    }
}
