package com.company.datos;

/**
 * Created by Manu on 22/05/2017.
 */
public class Encriptador {

    public int encriptarDeEncriptador(int param, Algoritmo a){

        return a.encriptar(param);
    }

    public int desencriptarDeEncriptador(int param, Algoritmo a){

        return a.desencriptar(param);
    }
}
