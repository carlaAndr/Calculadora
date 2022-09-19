/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import pila.*;

/**
 *
 * @author Carla Andrea
 */
public class ExcepcionColeccionVacias extends RuntimeException {
        ExcepcionColeccionVacias(){
        super();
    }
     ExcepcionColeccionVacias(String mensaje){
        super(mensaje);
    }

}
