/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;
import java.util.ArrayList;

/**
 *
 * @author frida
 */
public class MetodoCalcula {
    
    /**
     * Metodo que recibe la expresion en postfijo y utiliza pilas para calcular el resultado final de la operacion 
     * @param postfijo
     * es un ArrayList de String
     * @return double
     * es un numero, el resultado de la operacion
     * en caso de hacer una operacion que sea indefinida, se arroja NaN (not a number) como resultado
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
     * Metodo que identifica los numeros y operadores que hay en la operación
     * @param str
     * es un String 
     * @return boolean
     * regresa un boolean, es false si el String es un operador y true si es un numero
     */
    
    public static boolean esNumero (String str){
        boolean res = true;
        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("^")){
            res = false;    
        } 
        return res;
    }
    
   /*
    public static void main(String[] args) {
        
        ArrayList postfijo = new ArrayList <String>();
        
        postfijo.add("3");
        postfijo.add("2");
        postfijo.add("4");
        postfijo.add("*");
        postfijo.add("1");
        postfijo.add("1");
        postfijo.add("+");
        postfijo.add("3");
        postfijo.add("^");
        postfijo.add("/");
        postfijo.add("+");
     
     
       System.out.println(calcula(postfijo));
       
    }*/
     
}


