package Parcial;

import javax.swing.JOptionPane;

public class Ejercicio62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []parcelas = new String [20];
		int alt, opc, cont=0, opc2, opc3;
		for (int i=0; i<20; i++) {
			alt = (int)Math.round(Math.random()*2);
			//Cuando colocamos un int a la derecha de un Math.random tranforma el decimal a un entero.
			if (alt == 0) {
				parcelas [i] = "Papas";
			} 
			if (alt == 1) {
				parcelas [i] = "Yucas";
			}
			if (alt == 2) {
				parcelas [i] = "Maíz";
			}
		}
		do {
			cont = 0;
			opc = Integer.parseInt(JOptionPane.showInputDialog("1. Ver parcelas con papas "
					+ " \n 2. Ver parcelas yuca "
					+ "\n 3. Ver parcelas maíz " 
					+ "\n 4. Sembrar una parcela "
					+ "\n 5. Cosechar una parcela "));
			if (opc == 1) {
				for (int i=0; i<20; i++) {
					if (parcelas[i] == "Papas") {
						JOptionPane.showMessageDialog(null, "Hay papas en la parcela " + (i+1));
						cont++;
					}
				}
				JOptionPane.showMessageDialog(null, "Hay " + cont + " parcelas de papas ");
			}
			if (opc == 2) {
				for (int i=0; i<20; i++) {
					if (parcelas[i] == "Yucas") {
						JOptionPane.showMessageDialog(null, "Hay yucas en la parcela " + (i+1));
						cont++;
					}
				}
				JOptionPane.showMessageDialog(null, "Hay " + cont + " parcelas de yucas ");
			}
			if (opc == 3) {
				for (int i=0; i<20; i++) {
					if (parcelas[i] == "Maíz") {
						JOptionPane.showMessageDialog(null, "Hay maíz en la parcela " + (i+1));
						cont++;
					}
				}
				JOptionPane.showMessageDialog(null, "Hay " + cont + " parcelas de maíz ");
			}
			if (opc == 5) {
				opc2 = Integer.parseInt(JOptionPane.showInputDialog("¿Qué parcela desea cosechar? "));
				if (parcelas[opc2-1] == null) {
					JOptionPane.showMessageDialog(null, "Esta parcela se encuentra vacia ");
				}
				else {
					JOptionPane.showMessageDialog(null, "Vas a cosechar " + parcelas[opc2-1]);
					parcelas[opc2-1]= null;
				}
			}
			if (opc == 4) {
				opc2 = Integer.parseInt(JOptionPane.showInputDialog("¿Qué parcela desea cosechar? "));
				if (parcelas[opc2-1] == null) {
					opc3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Con que semillas quiere cosechar\n"
							+ "\n1. Papas"
							+ "\n2. Yucas"
							+ "\n3. Maíz "));
					//Integer.parseInt funciona para pasar un String a un Integer
					if (opc3 == 1) {
						parcelas[opc2-1] = "Papas";
					}
					if (opc3 == 2) {
						parcelas[opc2-1] = "Yucas";
					}
					if (opc3 == 3) {
						parcelas[opc2-1] = "Maíz";
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Esta parcela esta llena de " + parcelas[opc2-1] + " no puedes cultivar ");
				}
			}
		}while (true);

	} 
	

}
