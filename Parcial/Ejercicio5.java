package Parcial;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		String texto;
		
		System.out.println("Ingrese una palabra");
		texto=sc.next();
		
		System.out.println("La cantidad de letras de tu palabra es:" +texto.length()+ "caracteres");
		
	}

}
