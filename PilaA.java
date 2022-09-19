/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author Carla Andrea
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
}
    public void push(T dato){
        if(tope==pila.length-1){ //Pila LLena
        expande();
        }
        tope++;
        pila[tope]=dato;
}
private void expande(){
    T masGrande []=(T[])new Object[pila.length*2];
    for (int i=0; i<=tope; i++)
        masGrande[i]=pila[i];
    pila=masGrande;
}
public T pop(){
    if(this.isEmpty())
        throw new ExcepcionColeccionVacias("Error: la pila está vacía");
    T resultado;
    resultado=pila [tope];
    pila[tope]=null;
    tope--;
    return resultado;
}
public T peek(){
    if(this.isEmpty())
        throw new ExcepcionColeccionVacias("Error: la pila está vacía"); //Lanza la excepcion
    return pila [tope];
}

public boolean isEmpty(){
    return tope==-1;
}
public void multiPop(int n){
    if (n>tope+1)
      throw new ExcepcionColeccionVacias("No se pude sacar");
        //intento sacar un elemento más de lo que existe
    for (int i=0; i<n; i++){
        pila[tope]=null;
        tope--;
    }
    
}
public T[] multiPopRegresa (int n){
T[] array= (T[]) new Object[n];
    if (n>tope+1)
      throw new ExcepcionColeccionVacias("No se pude sacar");
        //intento sacar un elemento más de lo que existe
    for (int i=0; i<n; i++){
        array[i]=pila[tope];
        pila[tope]=null;
        tope--;
    }
 return array;
}
}