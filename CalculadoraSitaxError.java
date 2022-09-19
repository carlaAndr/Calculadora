/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Calculadora;
import java.util.ArrayList;

/**
 *
 * @author mariajosevelazquez
 */
public class CalculadoraSitaxError {

    /**
     * pruebaSyntax:
     * corre todas las pruebas para verificar que no haya
     * errores de sintaxis en la expresión ingresada por el usuario
     *
     * @param cad
     * @return boolean 
     * true: La cadena esta lista para pasar a array 
     * false: la cadena tiene un error de sintaxis
     */
    public static boolean pruebaSyntax(String cad) {
        boolean res = true;
        if (vacio(cad) || !balanceParentesis(cad) || incompleta(cad) || divideCero(cad)|| iniciaOperador(cad) || operadoresJuntos(cad)){
            res = false;
        }
        return res;
    }

    
    /**
     * 
     * @param c
     * @return 
     */
    private static boolean isOperador(char c) {
        boolean res = false;
        //detectar los operadores directamente
        if (c == '-' ||c == '+' || c == '*' || c == '/' || c == '^') {
            res = true;    
        }
        return res;
    }
    
    private static boolean isParentesis(char c){
        boolean res = false;
        if (c == '(' ||c == ')') 
            res = true;    
        return res;
    }

    /**
     * convertidorArray convierte la cadena en un array que separa los numeros de los parentesis y operadores
     * @param cad
     * @return ArrayList<String>
     */ 
    public static ArrayList<String> convertidorArray(String cad) {
        ArrayList<String> a = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cad.length(); i++) {
            if(!isOperador(cad.charAt(i)) && !isParentesis(cad.charAt(i))) {
                if(cad.charAt(i)=='m'){
                    sb.append("-");
                }else{
                  sb.append(cad.charAt(i));  
                }
      
            }else{
                if(!sb.toString().isEmpty())
                    a.add(sb.toString());
            a.add(String.valueOf(cad.charAt(i)));
            sb.delete(0, sb.length());
            }        
        }
        if(!sb.toString().isEmpty())
            a.add(sb.toString());
            
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
     *balanceParentesis verifica que estén balanceados
     * @param cad
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
                if (cad.charAt(i) == ')' && p1.peek() == '(')
                    try {
                    p1.pop();
                } catch (Exception e) {
                    res = false;
                }
            }
            i++;
        }
        return res && p1.isEmpty();
    }

    /**
     * vacio
     *
     * @param cad
     * @return boolean true: La expresión está vacia false: La expresión no está
     * vacia
     */
    public static boolean vacio(String cad) {
        boolean res = false;
        if (cad.length()==0) {
            res = true;
        }
        return res;
    }

    /**
     * Incompleta
     *
     * @param cad
     * @return boolean true: La expresión acaba con una operación o punto false:
     * La expresión esta completa
     */
    public static boolean incompleta(String cad) {
        boolean res = false;
        if (cad.endsWith("+") || cad.endsWith("-") || cad.endsWith("/") || cad.endsWith("*") || cad.endsWith(".") || cad.endsWith("^")) {
            res = true;
        }
        return res;
    }

    /**
     * Busqueda de /0
     * 
     * @param cad
     * @return boolean 
     * true: se divide entre 0 y hay un error 
     * false: no se divide entre 0
     */
    public static boolean divideCero(String cad) {
        boolean res = false;
        if (cad.contains("/0")) {
            res = true;
        }
        return res;
    }

    /**
     * iniciaOperador
     * @param cad
     * @return boolean
     * nos dice si la cadena empieza con un operador
     */
    public static boolean iniciaOperador(String cad) {
        boolean res = false;
        if (cad.startsWith("-") ||cad.startsWith("+") ||cad.startsWith("*") || cad.startsWith("/") || cad.startsWith("^")) {
            res = true;
        }
        return res;
    }

    /**
     *operadoresJuntos 
     * @param cad
     * @return boolean
     */  
public static boolean operadoresJuntos(String cad){
    boolean res=false;
    int i=0;
    while(!res && i<cad.length()){
        if(isOperador(cad.charAt(i)) && isOperador(cad.charAt(i+1))) 
          res=true;
        i++;
        } 
    return res;
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

  //Crear objetos de las clases
MetodoCalcula mc=new MetodoCalcula();
infPosf inf=new infPosf();
CalculadoraSitaxError sx=new CalculadoraSitaxError();
Boolean b;
String cad="m34-(95.4/12)";
ArrayList <String> arList= new ArrayList();
ArrayList <String> arList2= new ArrayList();
Double res;

//b=pruebaSyntax(cad);

    if (pruebaSyntax(cad)){
    arList=convertidorArray(cad);
    arList2=infPosf.Convertir(arList);
    res=MetodoCalcula.calcula(arList2);
        System.out.println(res);
    }
    else {
            System.out.println("Error ");  // !!!!!!
    }


}
}
