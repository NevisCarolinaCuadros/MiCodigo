package QuizProgramacion;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. preguntar al usuario una pregunta de si o  no
		//2. capturar respuesta en string
		
		boolean aceptar; //solo tienen dos valores, true y false
		String respuesta = JOptionPane.showInputDialog("Tienes hambre?");
		
		//comparar respuesta utilizando if 
		//SINTAXIX para comparar string
		//variable.equals("valor a comparar")
		// ||= o
		//*
		if(respuesta.equals("si")|| respuesta.equals("s")) {
			aceptar = true;
		}else {
			aceptar = false; 
		}
		if (aceptar==true) {
			JOptionPane.showMessageDialog(null, "Ha respondido Si, es " + aceptar);
		}else {
			JOptionPane.showMessageDialog(null, "No ha respondido Si, es" + aceptar);
		}
		
		//comparar utilizando switch
		switch (respuesta.toLowerCase()) {
		case "si":
			aceptar = true;
		break;
		case "s":
			aceptar = true;
		break;
		case "no":
			aceptar = false;
		break;
		case "n":
			aceptar = false;
		break;
			
		}
		
		if (aceptar) {
			JOptionPane.showMessageDialog(null, "Ha respondido Si, es " + aceptar);
		}else {
			JOptionPane.showMessageDialog(null, "No ha respondido Si, es" + aceptar);
		}

	}

}
