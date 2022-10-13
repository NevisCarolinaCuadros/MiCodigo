package Taller2;

import javax.swing.JOptionPane;

public class Punto6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Aqui voy a ingresar primero el area del circulo
		String areaCirculo = JOptionPane.showInputDialog("Ingresar radio del circulo ");
		
		double areaCirculoDouble = Double.parseDouble(areaCirculo);
		final double pi = 3.1415;
		
		int resultado = (int) (Math.pow(areaCirculoDouble, 2));
		System.out.print(resultado);
		double operacion1 = resultado*pi;
		
		JOptionPane.showMessageDialog(null, operacion1);
		
		
		
		//Aqui voy a ingresar segundo el area de un triangulo
		String areaTriangulo = JOptionPane.showInputDialog("Ingresar base del triangulo ");
		String areaTriangulox = JOptionPane.showInputDialog("Ingresar altura del triangulo");
		
		double areaTrianguloDouble = Double.parseDouble(areaTriangulo);
		double areaTrianguloxDouble = Double.parseDouble(areaTriangulox);
		
		double operacion11 = areaTrianguloDouble*areaTrianguloxDouble;
		double operacion22 = operacion11/2;
		
		JOptionPane.showMessageDialog(null, operacion22);
		
		
		
		
		//Aqui voy a ingresar el area de un cuadrado
		String areaCuadrado = JOptionPane.showInputDialog("Ingresar lado 1 del cuadrado ");
		String areaCuadradoy = JOptionPane.showInputDialog("Ingresar lado 2 del cuadrado ");

		double areaCuadradoDouble = Double.parseDouble(areaCuadrado);
		double areaCuadradoyDouble = Double.parseDouble(areaCuadradoy);
		
		double operacion111 = areaCuadradoDouble*areaCuadradoyDouble;
		
		JOptionPane.showMessageDialog(null, operacion111);
		

	}

}
