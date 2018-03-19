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

public class ejercicio5 {
    public static void main(String[] args) throws java.lang.Exception{
Scanner entrada = new Scanner(System.in);
		int N = entrada.nextInt();
		while(N-- !=0){
			int a=entrada.nextInt(), b=entrada.nextInt();
    		if(a<b)
    			System.out.println("<");
    		if(a==b)
    			System.out.println("=");
    		if(a>b)
	  			System.out.println(">");
		}        
    }
}
