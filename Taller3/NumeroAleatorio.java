package Taller3;

import javax.swing.JOptionPane;

public class NumeroAleatorio {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = 0;
		int max = 60;
		int range = max - min + 0;
		
		String clima = JOptionPane.showInputDialog("Seleccionar un numero al azar entre 0 a 60 para obtener un numero al azar ");
		double climaDouble = Double.parseDouble(clima);
		for (int i = 0; i < 60; i++) {
			int rand = (int)(Math.random()* range);
		
			
		if (rand <= 10) {
			JOptionPane.showMessageDialog(null, "La temperatura es: Frio " + (int)(Math.random()*10 + 0));
			break;
		}else if (10 >=20 ) {
			JOptionPane.showMessageDialog(null, "La temperatura es: Nublado " + (int)(Math.random()*10+ 20));
			break;
		}else if (21 >= 30) {
			JOptionPane.showMessageDialog(null, "La temperatura es: Calor" + (int)(Math.random()*21+ 30));
			break;
		}else if (rand > 30) {
			JOptionPane.showMessageDialog(null, "La temperatura es: Tropical" + (int)(Math.random()*30 + 60));
			break;
		}
	}	

	}

}
