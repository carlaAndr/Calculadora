/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Calculadora;
/**
 *
 * @author Carla Andrea
 */
public interface PilaADT <T>{
    public void push(T dato);
    public boolean isEmpty();
    public T pop();
    public T peek();
    public void multiPop(int i);
}
