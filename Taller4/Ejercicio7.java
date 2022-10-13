package Taller4;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String passwort = JOptionPane.showInputDialog("Ingrese su contraseña");
        int passwortInt = Integer.parseInt(passwort);
        
        if (passwortInt==7777) {
            JOptionPane.showMessageDialog(null, "Bienvenido");
        }
        
        while (passwortInt!= 7777) {
            String otraVez= JOptionPane.showInputDialog("Intente nuevamente");
            int otraVezInt = Integer.parseInt(otraVez);
            
            if (otraVezInt==7777) {
                JOptionPane.showMessageDialog(null, "Bienvenido");
                System.exit(0);
            }
        }

	}

}
