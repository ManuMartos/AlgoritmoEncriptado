package com.company.datos;

/**
 * Created by Manu on 22/05/2017.
 */
public class AlgoritmoDiferencia implements Algoritmo {

    private int numero;

    public AlgoritmoDiferencia(int numero) {
        this.numero = numero;
    }

    @Override
    public int encriptar(int param) {
        return numero - param;
    }

    @Override
    public int desencriptar(int param) {
        return numero + param;
    }
}
