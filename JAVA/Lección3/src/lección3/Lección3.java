/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lección3;

import java.util.Scanner;

public class Lección3 {

    
    public static void main(String[] args) {
        /*for (variable, condición;i++){
        
        break;}
        */
        
        /*
        while(condición){
        }
        */
        
        //Tipos de variables:
        //Boolean
        //int
        //float
        //String
        //Double
        //Char
        
        
        int cuenta=1000;
        String decisión;
        
                
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la acción. D para debito, C para Crédito y S para salir.");
        decisión= scanner.next();
        
        while (decisión.compareTo("s")!=0){
            if (decisión.compareTo("d")==0){
                System.out.println("Introduzca el monto a debitar:");
                int monto=scanner.nextInt();
                
                int remanente= cuenta-monto;
                if (remanente>=0){
                cuenta= cuenta-monto;
                    System.out.println("Debito listo, el monto actual de su cuenta es: $"+cuenta);
                }
                else {
                    System.out.println("No tiene fondos suficientes. Sólo tiene: $"+cuenta);
                }
                
            }
            else if (decisión.compareTo("c")==0){
                System.out.println("Introduzca el monto a acreditar:");
                int monto= scanner.nextInt();
                cuenta= cuenta+monto;
                System.out.println("Crédito listo! Quedan: $"+cuenta);
            }
            System.out.println("Introduzca la acción");
            decisión= scanner.next();
           
        }
        System.out.println("Su cuenta tiene: $"+cuenta);
        
    }
    
}
