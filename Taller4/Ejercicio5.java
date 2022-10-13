package Taller4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese un numero cualquiera");
		 int x;
		 x=sc.nextInt();
		 int producto=1;
		 int d=1;
		 do {
			 producto=producto*d;
			 d++;
			
		 	} while(d<=x);
		 
		 
		 	System.out.println("El numero tiene como fac " +producto);
		 

	}

}
