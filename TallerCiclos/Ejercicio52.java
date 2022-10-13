package TallerCiclos;

import javax.swing.JOptionPane;

public class Ejercicio52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1 = 0,sum2=0,sum3=0;
		int n1=0,n2=0,n3=0;
		
		for(int i=1;i<=5;i++) {
			JOptionPane.showMessageDialog(null, "Tu turno es: " + i);
       
		String jugador1 = JOptionPane.showInputDialog(null, "Primer puntaje ");
		n1 = Integer.parseInt(jugador1);
		sum1 = sum1+n1;
		String jugador2 = JOptionPane.showInputDialog(null, "Segundo puntaje");
		 n2 = Integer.parseInt(jugador2);
		sum2 = sum1+n2;
		String jugador3 = JOptionPane.showInputDialog(null, "Tercer puntaje");
		 n3 = Integer.parseInt(jugador3);
		sum3 = sum3+n3;
		}
		System.out.print("El puntaje es: " + sum1);
		System.out.print("El puntaje es: " + sum2);
		System.out.print("El puntaje es: " + sum3);
		JOptionPane.showMessageDialog(null, "Siguiente turno");
	     
		
		if(n1>n2 && n1>n3) {
        
        JOptionPane.showMessageDialog(null,"Gano el jugador 1: ");
	}
		if(n2>n1 && n2>n3) {
	        
	        JOptionPane.showMessageDialog(null,"Gano el jugador 2: ");
		}	
		if(n3>n2 && n3>n1) {
	        
	        JOptionPane.showMessageDialog(null,"Gano el jugador 3: ");
		}

	}

}
