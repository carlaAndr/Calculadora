/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programascalculadora;

/**
 *<pre>
 * Contiene la funcionalidad de la Estructura de Datos denominada Pila.
 * </pre>
 * 
 */
public class PilaA <T> implements PilaADT<T>{
    private int tope;
    private T[] pila;
    private final int MAX=20;

    public PilaA(){
    pila=((T[]) new Object [MAX]);
    tope=-1;
}
    public PilaA(int max){
    pila=((T[]) new Object [max]);
    tope=-1;
}/**
 * Metodo que sirve para ingresar un dato en la superficie de la pila.
 * @param dato Es un genérico.
 */
    public void push(T dato){
        if(tope==pila.length-1){ //Pila LLena
        expande();
        }
        tope++;
        pila[tope]=dato;
}
    /**
     * Metodo que sirve para aumentar la capacidad de la pila. Usualmente se duplica el tamaño.
     */
private void expande(){
    T masGrande []=(T[])new Object[pila.length*2];
    for (int i=0; i<=tope; i++)
        masGrande[i]=pila[i];
    pila=masGrande;
}
/**
 * Metodo que elimina el dato superior de la pila y lo arroja como variable de salida.
 * @return T dato. Dato genérico de mayor nivel en la pila.
 */
public T pop(){
    if(this.isEmpty())
        throw new ExcepcionColeccionVacia("Error: la pila está vacía");
    T resultado;
    resultado=pila [tope];
    pila[tope]=null;
    tope--;
    return resultado;
}
/**
 * Metodo que regresa dato superior de la pila.
 * @return variable genérica.
 */
public T peek(){
    if(this.isEmpty())
        throw new ExcepcionColeccionVacia("Error: la pila está vacía"); //Lanza la excepcion
    return pila [tope];
}
/**
 * Metodo que dice si la pila esta vacía.
 * @return boolean
 */
public boolean isEmpty(){
    return tope==-1;
}
/**
 * Metodo que elimina más de un elemento de la pila. 
 * @param n La cantidad de elementos que se eliminaran. El rango abarca desde el elemento superior hasta abarcar el rango.
 */
public void multiPop(int n){
    if (n>tope+1)
      throw new ExcepcionColeccionVacia("No se pude sacar");
        //intento sacar un elemento más de lo que existe
    for (int i=0; i<n; i++){
        pila[tope]=null;
        tope--;
    }
    
}/**
 * Metodo que elimina más de un elemento y regresa los elementos eliminados en forma de arreglo.
 * @param n Cantidad de elementos que se eliminarán.
 * @return 
 */
public T[] multiPopRegresa (int n){
T[] array= (T[]) new Object[n];
    if (n>tope+1)
      throw new ExcepcionColeccionVacia("No se pude sacar");
        //intento sacar un elemento más de lo que existe
    for (int i=0; i<n; i++){
        array[i]=pila[tope];
        pila[tope]=null;
        tope--;
    }
 return array;
}
}

