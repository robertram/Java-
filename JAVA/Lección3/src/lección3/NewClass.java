/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lección3;

import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class NewClass {
    public static void main(String[] args) {
        
        float número;
        int contador=0;
        float promedio =0;
        float suma=0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca números. Si desea salir pulse 0");
        número = scanner.nextInt();
        suma=número+0;
                
        while (número != 0){
            contador=contador+1;
            System.out.println("Introduzca números. Si desea salir pulse 0");
            número = scanner.nextInt();
            suma= suma+número;
            
        }
        promedio= suma/contador;
        System.out.println("El promedio es de:"+promedio);
    
    
    }
    
}
