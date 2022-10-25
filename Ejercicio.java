package QuizArrays;

import javax.swing.JOptionPane;

public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double max, min, potencia;
		double raiz;
		int num;
		int numA = 0; int numB = 0; int numC= 0; int numD = 0;
		
		
		num = Integer.parseInt(JOptionPane.showInputDialog(" 1. Ver el número mayor\n "
				+ "2. Ver el número menor\n "
				+ "3. Calcular la raiz cuadrada\n "
				+ "4. Elevar a una potencia\n"
				+ "5. Salir "));
		
		switch(num) {
			case 1: max = Double.parseDouble(JOptionPane.showInputDialog(" Ingrese dos números ")); 
			convertir(max);
			break;
			
			case 2: min = Double.parseDouble(JOptionPane.showInputDialog("Ingrese dos números "));
			convertir21(min);
			break;
			
			case 3: raiz = Double.parseDouble(JOptionPane.showInputDialog("Ingrese número para conocer su raiz cuadrada "));
			convertir311(raiz);
			break;
			
			case 4: potencia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese números para elevar a una potencia "));
			convertir41(potencia);
			break;
			
		}while (num!=5);
		
	}



	private static double convertir(double max) {//números para mirar el mayor
		boolean conversion1;
		
		int numA = 0;
		int numB = 0;
		
		conversion1 = numA > numB;
		
		JOptionPane.showMessageDialog(null, "El número mayor es: " + conversion1);
		return numB;
		
		
	}private static boolean convertir21(double min) {//números para mirar el menor 
		boolean conversion21;
		
		int numA = 0;
		int numB = 0;
		
		conversion21 = numA<numB;
		
		JOptionPane.showMessageDialog(null, "El número menor es: " + conversion21);
		return conversion21;
	
	
	}private static double convertir311(double raiz) {//número para mirar la raiz 
		double conversion311;
		
		int numA = 0;
		
		conversion311 = Math.sqrt(numA);
		
		JOptionPane.showMessageDialog(null, "La raiz es: " + conversion311);
		return conversion311;
		
		
	}private static double convertir41(double potencia) {//número para calcular la potencia
	double conversion41;
		
		int numA = 0;
		int numB = 0;
		
		conversion41 = (int) (Math.pow(numA,numB));
		
		JOptionPane.showMessageDialog(null, "La potencia es: " + conversion41);
		return conversion41;
		
		
	
}
}

