/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foobarspam.bicipalma;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Josep Mesquida
 */
public class Estacion {

    //variables 
    private int id;
    private String direccion;
    private int numeroAnclajes;
    private int[] anclajes = new int[numeroAnclajes];

    //Contructor
    public Estacion() {

    }

    ;
    
    public Estacion(int id, String direccion, int numeroAnclajes, int[] anclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
        this.anclajes = anclajes;

    }

    //Oculatcion de código
    //Sets
    private void setId(int id) {
        this.id = id;
    }

    private void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private void setNumeroAnclajes(int numeroAnclajes) {
        this.numeroAnclajes = numeroAnclajes;
    }

    private void setAnclajes(int[] anclajes) {
        this.anclajes = anclajes;
    }

    //Ocultacion de código 
    //Gets
    public int getId() {
        return this.id;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getNumeroAnclajes() {
        return this.numeroAnclajes;
    }

    public int[] getAnclajes() {
        return this.anclajes;
    }

    //Metodos
    //muestra un mensaje con id, direccion y numeroAnclajes
    public void consultarEstacion() {
        getId();
        getDireccion();
        getNumeroAnclajes();
    }

    //devuelve la cantidad de anclajes libres
    public void anclajesLibres() {
        getAnclajes();
    }

    //recorre el array anclajes y muestra el id de la bici anclada o si está libre
    public void consultarAnclajes() {
        for (int i = 0; i < anclajes.length; i++) {

        }
    
    // inserta el objeto bicicleta en el primer registro libre del array anclajes y llama a mostrarAnclaje()
    public void anclarBicicleta() {

    }

    //muestra un mensaje con el id de la bicicleta anclada y en qué anclaje se ha anclado
    public void mostrarAnclaje() {

    }

    //comprueba si la tarjeta de usuario está activada
    public void leerTargetUsuario() {

    }

    public void retirarBicicleta() {

    }

    //muestra un mensaje con el id de la bici y el número de anclaje donde estaba.
    public void mostrarBicicleta() {

    }

    //devuelve una posición al azar entre el número de anclajes
    public int generarAnclajes() {
        int i = ThreadLocalRandom.current().nextInt(0 - anclajes.length);
        return anclajes[i];
    }

}
