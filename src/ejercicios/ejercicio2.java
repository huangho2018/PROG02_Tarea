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

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Este ejemplo permite realizar cálculos básicos basándose en un par de números enteros distintos de cero");
        System.out.println("Introduce el primer número entero...");
        int num1 = entrada.nextInt();
        System.out.println("Introduce el segundo número entero...");
        int num2 = entrada.nextInt();
        System.out.println("\nEl valor resultante de sumar ambos números es: " + (num1 + num2));
        System.out.println("El valor resultante de restar el primero al segundo número es: " + (num2 - num1));
        System.out.println("El valor resultante de restar el segundo al primero número es: " + (num1 - num2));
        System.out.println("El valor resultante de multiplicar ambos números es: " + num1 * num2);
        System.out.println("El valor resultante de dividir primero entre segundo números es: " + (num1 / num2));
        System.out.println("El valor resultante de dividir segundo entre primero números es: " + (num2 / num1));
        //System.out.println("El valor resultante de elevar el primero al segundo números es: " + Math.pow(num1, num2));
        System.out.printf("El valor resultante de elevar el primero al segundo números es: %.0f" , Math.pow(num1, num2));
    }
}
