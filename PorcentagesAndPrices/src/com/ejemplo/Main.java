package com.ejemplo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        //Inicializamos variables
        String articulo;
        int clave;
        double precio;
        double preciofinal;

        //solicitamos entradas
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese nombre del artículo: ");
        articulo = bufEntrada.readLine();

        //Procesos
        System.out.println("Ingrese clave del artículo [1|2]: ");
        clave = Integer.parseInt(bufEntrada.readLine());

        if (clave == 1 || clave == 2) {
            System.out.println("Ingrese precio del artículo: ");
            precio = Double.parseDouble(bufEntrada.readLine());
            if (clave == 1) {
                preciofinal = precio * 0.9;
            } else {
                preciofinal = precio * 0.8;
            }
            //Salida
            System.out.println("Articulo: " + articulo + " |Clave: " + clave + " |Precio original $: " + precio + " |Precio condescuento $: " + preciofinal);
        } else {
            System.out.println("Error de carga. Valor de clave incorrecto!");
        }
    }
}

