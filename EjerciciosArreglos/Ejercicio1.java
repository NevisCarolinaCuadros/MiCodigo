package EjerciciosArreglos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sn = new Scanner(System.in);
	        
	        int num = 0;
	        int numx = 0;
	        int numy = 0;
	        int numz = 0;
	        int max = 0;
	        int min = 0;
	        
	        System.out.println("Selecciona un número: ");
	        num = sn.nextInt();
	        System.out.println("Selecciona un número:");
	        numx = sn.nextInt();
	        System.out.println("Selecciona un número:");
	        numy = sn.nextInt();
	        System.out.println("Selecciona un número:");
	        numz = sn.nextInt();
	        
	        if(num > numx && numx > numy && numy > numz) {
	            max = num;
	            min = numz;
	            JOptionPane.showMessageDialog(null, "El número menor y mayor son: " + numx + " y " + numy);
	        } else if(num > numx && numx < numy && numy > numz) {
	            max = numx;
	            min = numz;
	            JOptionPane.showMessageDialog(null, "El número menor y mayor son:  " + numx + " y " + numz);
	        } else if(num < numx && numx > numy && numy < numz) {
	            max = numx;
	            min = numz;
	            JOptionPane.showMessageDialog(null, "El número menor y mayor son:  " + num + " y " + numz);                     
	        } else if(numx > num && num > numy && numy > numz) {
	            max = numx;
	            min = numz;
	            JOptionPane.showMessageDialog(null, "El número menor y mayor son:  " + num + " y " + numy);         
	        } else if(numy > num && num > numx && numx > numz) {
	            max = numy;
	            min = numz;
	            JOptionPane.showMessageDialog(null, "El número menor y mayor son:  " + num + " y " + numx);         
	        } else if(numx > num && num > numy && numy > numz) {
	            max = numx;
	            min = numz;
	            JOptionPane.showMessageDialog(null, "El número menor y mayor son:  " + numx + " y " + numy);            
	        }

	}

}
