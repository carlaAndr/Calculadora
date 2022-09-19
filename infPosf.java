/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Calculadora;

import java.util.ArrayList;

/**
 *
 * @author Carla Andrea
 */
public class infPosf {

public static ArrayList <String> Convertir (ArrayList <String> lista){
ArrayList <String> listaFinal= new ArrayList();
PilaADT <String> pilaOp=new PilaA<String>();
Double num;

    for (int i=0; i<lista.size();i++){

       try{
        Double.parseDouble(lista.get(i));
        listaFinal.add(lista.get(i).toString());
         //  System.out.println(lista.get(i));
       }
       catch(Exception e){
        if(pilaOp.isEmpty()){

                pilaOp.push(lista.get(i));
                //System.out.println(lista.get(i));
            }
        else{
          if(prefOp(lista.get(i))>prefOp(pilaOp.peek())){

            pilaOp.push(lista.get(i));
            }
       else{
            if(prefOp(lista.get(i))<prefOp(pilaOp.peek())){
              
                if(prefOp(lista.get(i))!=0)
                while(!pilaOp.isEmpty())
                    listaFinal.add(pilaOp.pop());

            pilaOp.push(lista.get(i));
            }
            else{ // En este caso ya son iguales
                listaFinal.add(pilaOp.pop());
                pilaOp.push(lista.get(i));
               }
        }

    }
        

      }
    }
//Se asegura de vaciar la pila
    while(!pilaOp.isEmpty())
      listaFinal.add(pilaOp.pop());

    System.out.println(listaFinal.toString());

//Elimina los paréntesis 
for (int i=0; i<listaFinal.size();i++){
    if (listaFinal.get(i).equals("(") || listaFinal.get(i).equals(")")){
    listaFinal.remove(i);
    i--;
}
        
}

return listaFinal;

}


private static double prefOp (String c){
    switch (c){
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




    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

  ArrayList <String> operacion= new ArrayList<String>();
  ArrayList <String> operacion2= new ArrayList<String>();
  ArrayList <String> operacion3= new ArrayList<String>();
  ArrayList <String> operacion4= new ArrayList<String>();
  
    operacion.add("(");
    operacion.add("6");
    operacion.add("+");
    operacion.add("2");
    operacion.add(")");
    operacion.add("*");
    operacion.add("3");
    operacion.add("/");
    operacion.add("2");
    operacion.add("^");
    operacion.add("2");
    operacion.add("-");
    operacion.add("4");
    

    operacion2.add("(");
    operacion2.add("1");
    operacion2.add("*");
    operacion2.add("(");
    operacion2.add("2");
    operacion2.add("-");
    operacion2.add("3");
    operacion2.add(")");
    operacion2.add(")");
    operacion2.add("^");
    operacion2.add("(");
    operacion2.add("4");
    operacion2.add("+");
    operacion2.add("5");
    operacion2.add(")");


    operacion3.add("8");
    operacion3.add("-");
    operacion3.add("9");
    operacion3.add("*");
    operacion3.add("5");
    operacion3.add("^");
    operacion3.add("9");
    operacion3.add("+");
    operacion3.add("36");

    operacion4.add("(");
    operacion4.add("56");
    operacion4.add("*");
    operacion4.add("(");
    operacion4.add("78");
    operacion4.add("-");
    operacion4.add("32");
    operacion4.add(")");
    operacion4.add(")");
    operacion4.add("/");
    operacion4.add("(");
    operacion4.add("456");
    operacion4.add("+");
    operacion4.add("231");
    operacion4.add("-34");
    operacion4.add(")");
 





    System.out.println(Convertir(operacion4).toString());   // Check

    }
    
   }

