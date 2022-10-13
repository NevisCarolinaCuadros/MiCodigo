package QuizProgramacion;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Pedir tipo temperatura en C,c,F,f
		 * pedir valor temperatura
		 * hacer la conversion 
		 * imprimir resultados 
		 * Grados_C = 5(Grados_F –32)/9
		 * Grados_F = (9(Grados_C/5)+ 32)
		 */

		
		String tipoTemperatura = JOptionPane.showInputDialog("ingrese la unidad"
				+ "Celsius (C,c)\n"
				+ "Fahrenheit (F,f)\n");
		String inputTemperatura = JOptionPane.showInputDialog("Ingrese el valor de la tempreatura");
		double temperatura = Double.parseDouble(inputTemperatura);
		double conversion=0.0; //Innicializar variable
		
		//Si ingresó Celsius
		if (tipoTemperatura.equals("C") || tipoTemperatura.equals("c")) {
			conversion = (5*(temperatura - 32)/9);	
		}else if (tipoTemperatura.equals("F") || tipoTemperatura.equals("f")) {
			conversion = (9*(temperatura/5)+32);
		}
		
		//Imprimir resultados
			JOptionPane.showMessageDialog(null, "La temperatura " + temperatura + " en " + tipoTemperatura +
				" es igual a " + conversion );

	}

}
