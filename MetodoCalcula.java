/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programascalculadora;

import java.util.ArrayList;

/**
 * Resuelve operación de tipo postfija.
 * 
 */
public class MetodoCalcula {
    
    /**
     * <pre>
     * Recibe un ArrayList cuyos elementos están ordenados de acuerdo a una expresión de tipo postfijo.
     * Utiliza pilas para calcular el resultado final de la operacion. 
     * </pre>
     * @param postfijo
     *   Es un ArrayList de String, cuyos elementos están ordenados de manera postfija.
     * @return double
     *   Es un numero. Es el resultado de la operacion.
     * En caso de hacer una operacion que sea indefinida, se arroja NaN (not a number) como resultado.
     */
    
    public static double calcula (ArrayList <String> postfijo){
        PilaA <Double> pilar = new PilaA();
        
        for (int i =0; i < postfijo.size(); i++){
            if (esNumero(postfijo.get(i)) == true){
                pilar.push(Double.parseDouble(postfijo.get(i)));
            
            } else {
                double num2 = pilar.pop(); 
                double num1 = pilar.pop();
                
                switch (postfijo.get(i)){
                    
                    case "+":
                        pilar.push(num1 + num2);
                        break;
                        
                    case "-":
                        pilar.push(num1 - num2);
                        break;
                        
                    case "*":
                        pilar.push(num1 * num2);
                        break;
                        
                    case "/":
                        if (num2 != 0){
                            pilar.push(num1 / num2);
                        } else {
                            pilar.push(Double.NaN);
                        }
                        break;
                        
                    case "^":
                        pilar.push(Math.pow(num1, num2));
                        break;
                }   
            }
        }
        
        return pilar.pop();
    }
    
    /**
     * <pre> 
     * Indica si el carácter ingresado es un número.
     * </pre>
     * @param str String
     * @return boolean
     *   Es false si el String es un operador y true si es un numero.
     */
    
    public static boolean esNumero (String str){
        boolean res = true;
        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("^")){
            res = false;    
        } 
        return res;
    }
}

