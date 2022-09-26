/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programascalculadora;

/**
 *
 * @author fredyglez
 */
public class MetodoFinalExe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       System.out.println(MetodoFinal.calcula("(6+2-1)*(9^(2*1))"));
       System.out.println(MetodoFinal.calcula("(6+2-1)*(9^(2*1)))"));
       System.out.println(MetodoFinal.calcula("((6+2-1)*(9^(2*1))"));
       System.out.println(MetodoFinal.calcula("(6+2-1)*(9^(2*-1))"));
       System.out.println(MetodoFinal.calcula("(6+2-1)*(9^(2*1/0))"));

       
       
    }
    
}
