package QuizProgramacion;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				/*
				 * 
				 * pedir nota en letra 
				 * convertir en un numero
				 * imprimir los resultados
				 */
				
				String nota = JOptionPane.showInputDialog("Por favor ingrese la nota a convertir\n"
						+ "E, S, A, I, o D,");
				double notaNumero = 0.0;
				boolean valido = true;
				
				//validar con switch
				switch (nota.toLowerCase()) {
				case "e":
					notaNumero = 4.0;
				break;
				case "s":
					notaNumero = 3.0;
				break;
				case "a":
					notaNumero = 2.0;
				break;
				case "i":
					notaNumero = 1.0;
				break;
				case "d":
					notaNumero = 0.0;
				break;
				default:
					JOptionPane.showMessageDialog(null, nota + "no es válido, intente de nuevo ");
					valido = false;
				}
				//Imprimir resultados
				//Imprimir solo si valido es true
				if(valido==true) {
					JOptionPane.showMessageDialog(null, "La nota " + nota.toUpperCase() + 
						" es igual a "+ notaNumero);
				}	

	}

}
