package TallerCiclos;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String input = JOptionPane.showInputDialog("Ingrese un número entero mayor a cero: ");
	        int inputInt = Integer.parseInt(input);
	        int numero= inputInt;
	        while(0<numero) {
	            System.out.println("Usted ha ingresado: "+ numero);
	        }System.out.println("Número después del ciclo: "+ numero);
	        
	      

	}

}
