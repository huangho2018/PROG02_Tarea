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

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Introducir número entero de dos dígitos y visionar por separado ambos dígitos
        System.out.println("Introduce número entero (dos dígitos)...");
        int numero = entrada.nextInt();
        //String num = String.valueOf(numero);
        String num=Integer.toString(numero);
        //Salida de datos según ejercicio
        System.out.println("Primer dígito:" + num.substring(0, 1));
        System.out.println("Segundo dígito:" + num.substring(1, 2));
    }
}
