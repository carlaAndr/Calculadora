/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programascalculadora;

import java.util.ArrayList;

/**
 *<pre>
 * infPos:
 * 
 * Clase encargada de convertir un ArrayList con elementos organizados con base a una expresión infija a un ArrayList organizado de acuerdo al tipo postfijo.
 * </pre>
 * 
 */
public class infPosf {
    /**
     * <pre>
     * Convierte arrayList de elementos organizados de manera infifa a una ArrayList organizado de manera postfija.
     * </pre>
     * @param lista
     * @return ArrayList de String.
     */

    public static ArrayList<String> Convertir(ArrayList<String> lista) {
        ArrayList<String> listaFinal = new ArrayList();
        PilaADT<String> pilaOp = new PilaA<String>();
        Double num;

        for (int i = 0; i < lista.size(); i++) {

            try {
                Double.parseDouble(lista.get(i));
                listaFinal.add(lista.get(i).toString());
                //  System.out.println(lista.get(i));
            } catch (Exception e) {
                if (pilaOp.isEmpty()) {

                    pilaOp.push(lista.get(i));
                    //System.out.println(lista.get(i));
                } else {
                    if (prefOp(lista.get(i)) > prefOp(pilaOp.peek())) {

                        pilaOp.push(lista.get(i));
                    } else {
                        if (prefOp(lista.get(i)) < prefOp(pilaOp.peek())) {

                            if (prefOp(lista.get(i)) != 0) {
                                while (!pilaOp.isEmpty()) {
                                    listaFinal.add(pilaOp.pop());
                                }
                            }

                            pilaOp.push(lista.get(i));
                        } else { // En este caso ya son iguales
                            listaFinal.add(pilaOp.pop());
                            pilaOp.push(lista.get(i));
                        }
                    }

                }

            }
        }
//Se asegura de vaciar la pila
        while (!pilaOp.isEmpty()) {
            listaFinal.add(pilaOp.pop());
        }

        System.out.println(listaFinal.toString());

//Elimina los paréntesis 
        for (int i = 0; i < listaFinal.size(); i++) {
            if (listaFinal.get(i).equals("(") || listaFinal.get(i).equals(")")) {
                listaFinal.remove(i);
                i--;
            }

        }

        return listaFinal;

    }

    private static double prefOp(String c) {
        switch (c) {
            case "+":
                return 1;
            case "-":
                return 1;
            case "*":
                return 2;
            case "/":
                return 2;
            case "^":
                return 3;
            case "(":
                return 0;
            case ")":
                return 5; //Vacía la pila
            default:
                return 0;
        }
    }
}

