package Class;

import javax.swing.JOptionPane;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear menu
		
				String inputOption = JOptionPane.showInputDialog("Seleccione una opcion: \n"
						+ "1. Suma\n"
						+ "2. Resta\n"
						+ "3. Multiplicacion\n");
				int option = Integer.parseInt(inputOption);
				
				switch (option) {
				case 1:
					JOptionPane.showMessageDialog(null, "Ha seleccionado suma");
					break;//Para frenar el comando
				case 2: 
					JOptionPane.showMessageDialog(null, "Ha seleccionado resta");
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Ha seleccionado suma");
					break;
				default:
					JOptionPane.showConfirmDialog(null, "Opcion invalida");
						
				}

	}

}
