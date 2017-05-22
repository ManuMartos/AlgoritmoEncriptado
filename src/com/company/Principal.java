package com.company;

import com.company.datos.Algoritmo;
import com.company.datos.AlgoritmoDiferencia;
import com.company.datos.AlgoritmoMultiplicacion;
import com.company.datos.Encriptador;

/**
 * Created by Manu on 22/05/2017.
 */
public class Principal {

    public static void main(String[] args) {
        Encriptador e = new Encriptador();

        int codigo = 123;

        Algoritmo aM = new AlgoritmoMultiplicacion( 10 );

        int aux = e.encriptarDeEncriptador( codigo, aM);

        System.out.println("Algoritmo Multiplicacion");
        System.out.println("Encriptado: " + aux);

        System.out.println("Desencriptado: " + e.desencriptarDeEncriptador( aux, aM));

        Algoritmo aD = new AlgoritmoDiferencia(456);

        aux = e.encriptarDeEncriptador(codigo, aD);

        System.out.println("========================");

        System.out.println("Algoritmo Diferencia");
        System.out.println("Encriptado: " + aux);
        System.out.println("Desencriptado :" + e.desencriptarDeEncriptador(aux, aD) );
    }
}
