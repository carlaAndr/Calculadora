/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programascalculadora;
import java.util.ArrayList;
import static programascalculadora.CalculadoraSitaxError.convertidorArray;
import static programascalculadora.CalculadoraSitaxError.pruebaSyntax;
/**
 *<pre>
 * Clase con método estático que utiliza todos los metodos del proyecto para calcular lo que el usuario requiera.
 * </pre>
 */
public class MetodoFinal {
    /**
     * <pre>
     * Con base a una cadena compuesta de elementos que el usuario indicó, se resuelve la operación y el resultado se regresa en forma de String.
     * </pre>
     * @param input String
     * @return String con el resultado
     */
    
    public static String calcula(String input) {
        String resultado = "";
        MetodoCalcula mc = new MetodoCalcula();
        infPosf inf = new infPosf();
        CalculadoraSitaxError sx = new CalculadoraSitaxError();
        Boolean b;
        String cad = "m34-(95.4/12)";
        ArrayList<String> arList = new ArrayList();
        ArrayList<String> arList2 = new ArrayList();
        Double res = null;

        
        if (pruebaSyntax(input)) {
            arList = convertidorArray(input);
            arList2 = infPosf.Convertir(arList);
            res = MetodoCalcula.calcula(arList2);
            return resultado + res;
        } else {
            resultado = ("Error ");  // !!!!!!
            return resultado;
        }
        
        

    }
    
}
