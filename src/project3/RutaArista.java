/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

/**
 *
 * @author josehernandez
 */

/*
 * En ésta clase, representamos las aristas, objetos que contendran ambos la aerolínea que la realiza, así como
 * el precio de la misma.
 */

public class RutaArista {

    ////Atributos////
    private String airline;//aerolínea que ejecuta el vuelo
    private double cost;//costo de ése vuelo

    public RutaArista(String airline, double cost) {//ctor de la clase
        this.airline = airline;
        this.cost = cost;
    }//fin del ctor

    public String getAirline() {//método accesor de la aerolínea
        return airline;
    }//fin del método getAirline

    public double getCost() {//Retorna el costo de traversar la arista
        return cost;
    }//fin del método getCost

    @Override
    public String toString() {//creamos nuestro propio toString para mejorar la impresión presentada al usuario
        return airline + ", $" + cost;
    }//fin del metodo toString

}//fin de la clase RutaArista
