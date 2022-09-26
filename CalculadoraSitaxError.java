/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programascalculadora;
import java.util.ArrayList;
import programascalculadora.PilaA;
import programascalculadora.PilaADT;
/**
 *Checa sintaxis correcta en los datos ingresados por el usuario de la calculadora.
 * 
 */
public class CalculadoraSitaxError {

    /**
     * <pre>
     * Corre todas las pruebas para verificar que no haya errores de sintaxis en la expresión ingresada por el usuario.
     * Contiene métodos en los que se profundiza posteriormente.
     * </pre>
     *
     * @param cad Es la cadena que se genera cuando el usuario interactua con la calculadora y solicita el resultado.
     * @return boolean Es true cuando la cadena esta lista para ser evaluada. Es false si la cadena no puede ser evaluada, pues tiene algún error de sintaxis.
     */
    public static boolean pruebaSyntax(String cad) {
        boolean res = true;
        if (vacio(cad) || !balanceParentesis(cad) || incompleta(cad) || divideCero(cad) || iniciaOperador(cad) || operadoresJuntos(cad) 
                || doblePunto(cad) ) {
            res = false;
        }
        return res;
    }

    /**
     * Dice si el character ingresado corresponde a uno de los 5 operadores básicos.
     * @param c  Es una character. 
     * @return boolean. 
     */
    private static boolean isOperador(char c) {
        boolean res = false;
        //detectar los operadores directamente
        if (c == '-' || c == '+' || c == '*' || c == '/' || c == '^') {
            res = true;
        }
        return res;
    }
    /**
     * Dice si el character ingresado es un paréntesis.
     * @param c  Es un character.
     * @return 
     */

    private static boolean isParentesis(char c) {
        boolean res = false;
        if (c == '(' || c == ')') {
            res = true;
        }
        return res;
    }

    /**
     * <pre>
     * Convierte la cadena ingresada en un array. 
     * Separa los elementos de la cadena ingresada en números, caracteres y operadores.
     * </pre>
     *
     * @param cad  String.
     * @return ArrayList de String. Es el String separado por sus caracteres.
     */
    public static ArrayList<String> convertidorArray(String cad) {
        ArrayList<String> a = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cad.length(); i++) {
            if (!isOperador(cad.charAt(i)) && !isParentesis(cad.charAt(i))) {
                if (cad.charAt(i) == 'm') {
                    sb.append("-");
                } else {
                    sb.append(cad.charAt(i));
                }

            } else {
                if (!sb.toString().isEmpty()) {
                    a.add(sb.toString());
                }
                a.add(String.valueOf(cad.charAt(i)));
                sb.delete(0, sb.length());
            }
        }
        if (!sb.toString().isEmpty()) {
            a.add(sb.toString());
        }

        return a;
    }

    /* 
    Comienzo de pruebas de sintaxis:
    -balanceParentesis
    -vacio
    -incompleta
    -divideCero
    -iniciaOperador
    -OperadoresJuntos
     */
    /**
     * <pre>
     * Dice si los paréntesis de la cadena ingresada esten balanceados.
     * Es decir, a todo paréntesis abierto le corresponde uno cerrado y viceversa. 
     * Asimismo, no puede haber un paréntesis cerrado antes de un abierto.
     * </pre>
     *
     * @param cad String.
     * @return boolean
     */
    public static boolean balanceParentesis(String cad) {
        boolean res = true;
        PilaADT<Character> p1 = new PilaA();
        int i = 0;
        while (res && i < cad.length()) {
            if (cad.charAt(i) == '(') {
                p1.push(cad.charAt(i));
            } else {
                if(!p1.isEmpty()){
                if (cad.charAt(i) == ')' && p1.peek() == '(')
                    try {
                    p1.pop();
                } catch (Exception e) {
                    res = false;
                }
                }
                else{
                    if(cad.charAt(i) == ')')
                        res = false;
                }
            }
            i++;
        }
        return res && p1.isEmpty();
    }

    /**
     * <pre>
     * Dice si la cadena no contiene elementos.
     * </pre>
     *
     * @param cad String.
     * @return boolean.
     */
    public static boolean vacio(String cad) {
        boolean res = false;
        if (cad.length() == 0) {
            res = true;
        }
        return res;
    }

    /**
     * <pre> 
     * Indica si la cadena esta incompleta.
     * Es decir, si no termina con un número.
     * </pre>
     *
     * @param cad String
     * @return boolean
     */
    public static boolean incompleta(String cad) {
        boolean res = false;
        if (cad.endsWith("+") || cad.endsWith("-") || cad.endsWith("/") || cad.endsWith("*") || cad.endsWith(".") || cad.endsWith("^")) {
            res = true;
        }
        return res;
    }

    /**
     * <pre>
     * Indica si hay alguna división cuyo denominador sea 0.
     * Esto no es posible de resolver.
     * </pre>
     *
     * @param cad String
     * @return boolean 
     */
    public static boolean divideCero(String cad) {
        boolean res = false;
        if (cad.contains("/0")) {
            res = true;
        }
        return res;
    }

    /**
     * <pre>
     * Indica si la cadena inicia con algún elemento que no sea un número.
     * </pre>
     *
     * @param cad String
     * @return boolean 
     */
    public static boolean iniciaOperador(String cad) {
        boolean res = false;
        if (cad.startsWith("-") || cad.startsWith("+") || cad.startsWith("*") || cad.startsWith("/") || cad.startsWith("^")) {
            res = true;
        }
        return res;
    }

    /**
     * <pre>
     * Indica si hay algún operador después de otro.
     *</pre>
     * @param cad String
     * @return boolean
     */
    public static boolean operadoresJuntos(String cad) {
        boolean res = false;
        int i = 0;
        while (!res && i < cad.length()) {
            if (isOperador(cad.charAt(i)) && isOperador(cad.charAt(i + 1))) {
                res = true;
            }
            i++;
        }
        return res;
    }
    /**
     * <pre>
     * Indica si en la cadena se presenta algún punto junto a otro.
     * </pre>
     * @param cad String
     * @return boolean
     */
    
    public static boolean doblePunto(String cad) {
        boolean res = false;
        if (cad.contains("..")) {
            res = true;
        }
        return res;
    }
}
