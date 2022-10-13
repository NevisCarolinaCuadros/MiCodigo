package Taller4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int num;
	        boolean multiploTres = false;
	        
	        Scanner numero = new Scanner(System.in);
	        
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Introduce un número: ");
	            num = numero.nextInt();
	            if(num % 3 == 0){
	                //Hay múltiplo de tres...
	                multiploTres = true;
	            }            
	        }
	        if(multiploTres==false){
	            System.out.println("No hay multiplos");
	        }
	        else{
	            System.out.println("Hay al menos un multiplo de 3.");
	        }

	}

}
