/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programascalculadora;

import java.util.ArrayList;

/**
 *
 * @author fredyglez
 */
public class CalculadoraSitaxErrorExe {


    public static void main(String[] args) {
        
        // Pruebas método SyntaxError
        System.out.println(CalculadoraSitaxError.pruebaSyntax("9+7*(9-8/(3-2))")); //Caso que debería ser correcto.
        System.out.println(CalculadoraSitaxError.pruebaSyntax("9+7*(9-8/(3-2)")); //Caso con Paréntesis sin balancear.
        System.out.println(CalculadoraSitaxError.pruebaSyntax("9+7*(9-8/0")); //Caso dividido entre 0.
        System.out.println(CalculadoraSitaxError.pruebaSyntax("9+7..9*(9-8/(3-2))")); //Caso con doble punto.
        System.out.println(CalculadoraSitaxError.pruebaSyntax("9+7*(9-8/*(3-2))")); //Caso con doble operador.
        System.out.println(CalculadoraSitaxError.pruebaSyntax("+9+7*(9-8/(3-2))")); //Caso inicia con operador.
        System.out.println(CalculadoraSitaxError.pruebaSyntax("9+7*(9-8/(3-))")); //Caso expresión incompleta.
        System.out.println(CalculadoraSitaxError.pruebaSyntax("9+7*(9-8/(3-3))")); //Caso dividir entre 0.

        //Pruebas método isOperador no se pueden hacer por ser un método privado
        //Pruebas método isParentesis no se pueden hacer por ser un método privado
        
        //Pruebas método convertidorArray
        ArrayList<String> a = CalculadoraSitaxError.convertidorArray("9+7*(9-8/(3-2))"); //Caso que debería ser correcto.
        String s = "";
        for(int i = 0; i < a.size(); i++){
            s = s + a.get(i);
        }
        System.out.println(a);

        //Pruebas método balanceParentesis
        System.out.println(CalculadoraSitaxError.balanceParentesis("9+7*(9-8/(3-3))")); //Caso correcto.
        System.out.println(CalculadoraSitaxError.balanceParentesis("9+7*(9-8/(3-3)")); //Caso hace falta paréntesis de cierre.
        System.out.println(CalculadoraSitaxError.balanceParentesis("9+7*(9-8/3-3))")); //Caso hace falta paréntesis de apertura.
        System.out.println(CalculadoraSitaxError.balanceParentesis("9+7*(9-8/((3-3))")); //Caso paréntesis apertura de más.
        System.out.println(CalculadoraSitaxError.balanceParentesis("9+7*(9-8/(3-3)))")); //Caso paréntesis cerradura de más.
      
       //Pruebas método vacio
        System.out.println(CalculadoraSitaxError.vacio("9+7*(9-8/(3-3))")); //Caso false.
        System.out.println(CalculadoraSitaxError.balanceParentesis(")")); //Caso false.
        System.out.println(CalculadoraSitaxError.vacio("")); //Caso true.
        
        //Pruebas metodo incompleta
        System.out.println(CalculadoraSitaxError.incompleta("9+7*(9-8/(3-3))")); //Caso false.
        System.out.println(CalculadoraSitaxError.incompleta("9+7*(9-8/(3-3))+")); //Caso true.
        
        //Pruebas metodo divideCero
        System.out.println(CalculadoraSitaxError.divideCero("9+7*(9-8/0)")); //Caso true.
        System.out.println(CalculadoraSitaxError.divideCero("9+7*(9-8/(3-3))")); //Caso false.
        
        //Pruebas metodo iniciaOperador
        System.out.println(CalculadoraSitaxError.iniciaOperador("-9+7*(9-8/(3-3))")); //Caso true.
        System.out.println(CalculadoraSitaxError.iniciaOperador("9+7*(9-8/(3-3))")); //Caso false.
        
        //Pruebas metodo operadoresJuntos
        System.out.println(CalculadoraSitaxError.operadoresJuntos("9+-7*(9-8/(3-3))")); //Caso true.
        System.out.println(CalculadoraSitaxError.operadoresJuntos("9+7*(9-8/(3-3))")); //Caso false.
        
        //Pruebas metodo doblePunto
        System.out.println(CalculadoraSitaxError.doblePunto("9+7*(9-8/(3..6-3))")); //Caso true.
        System.out.println(CalculadoraSitaxError.doblePunto("9+7*(9-8/(3.6-3))")); //Caso false.





      


        


    }
    
}
