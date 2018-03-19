/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author huangho
 */
import java.util.*;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Solicitar el Nombre
        System.out.println("Introduce nombre completo...");
        String nombre = entrada.nextLine();
        
        
        
        System.out.println("Primeros dos caracteres: " + nombre.substring(0, 2));
        System.out.println("Últimos tres caracteres: " + nombre.substring(nombre.length()-3 , nombre.length()));
        System.out.println("Intervalo 3-5: " + nombre.substring(2, 4));
    }
}
