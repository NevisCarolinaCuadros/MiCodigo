package Quiz2;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escriba un programa que convierta las siguientes monedas a peso colombiano, 
		 * solicite el valor a convertir al usuario
		1 para dolar
		2 para euro
		3 para peso mexicano
		4 para libra exterlina
		*/
		
		String convertir = JOptionPane.showInputDialog(" Ingrese el tipo de moneda que desea convertir: "
				+ "\n1. Para dolar (P,p) "
				+ "\n2. para euro (E,e) "
				+ "\n3. para peso mexicano (M,m) "
				+ "\n4. para libra exterlina (L,l) ");
		String inputPeso = JOptionPane.showInputDialog("Ingrese el valor: ");
		double convertirDouble = Double.parseDouble(inputPeso); 
		double conversion = 0.0;//Inicializar variable
		
		if (convertir.equals("P") || convertir.equals("p") || convertir.equals("1")) {
			conversion = (1*(convertirDouble * 0.000216605));	
		}else if (convertir.equals("E") || convertir.equals("e") || convertir.equals("2")) {
			conversion = (1*(convertirDouble * 0.00022));
		}else if (convertir.equals("M") || convertir.equals("m") || convertir.equals("3")) {
			conversion = (1*(convertirDouble * 0.0044));
		}else if (convertir.equals("L") || convertir.equals("l") || convertir.equals("4")) {
			conversion = (1*(convertirDouble * 0.00020));
		}
		
		JOptionPane.showMessageDialog(null, "El peso Colombiano " + convertirDouble + " en la opcion " + convertir +
				" es igual a " + conversion );

	}

}
