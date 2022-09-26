/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programascalculadora;

/**
 *Creación de excepción para el funcionamiento de la pila.
 * 
 */
public class ExcepcionColeccionVacia extends RuntimeException {
    /**
     * Excepción sin mensaje personalizado.
     */
    public ExcepcionColeccionVacia() {
        super();
    }
    
    /**
     * Execpción con mensaje personalizado.
     * @param mensaje 
     */
    public ExcepcionColeccionVacia(String mensaje) {
        super(mensaje);
    }
    
}
