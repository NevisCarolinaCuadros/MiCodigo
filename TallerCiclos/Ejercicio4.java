package TallerCiclos;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	       String input = JOptionPane.showInputDialog("Ingrese la población de la ciudad: ");
	        int poblacion = Integer.parseInt(input);
	        while(poblacion>0) {
	            System.out.println("La población de la ciudad es: "+ poblacion);
	            
	            }if(poblacion<=0) {
	                System.out.print("Ingrese un valor no negativo o diferente de cero");
	                
	            }

	}

}
