package Class;

import javax.swing.JOptionPane;

public class LoopsAnidados2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int semanas = 5;
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias:"));
		
		

			// ciclo externo, imprime semanas
			for (int i = 1; i <= semanas; ++i) {
				
				System.out.println("Semana: " + i);

				// ciclo interno, imprime dias
				for (int j = 1; j <= dias; ++j) {
					
					System.out.println("  Día: " + j);
					
				}
				if(i==2) {
					break;
				}
				
			}
		/*
		System.out.println("--------------------------------");
/*
		// manejo de filas
		for (int i = 1; i <=3 ; ++i) {

			//manejo de columnas
			for (int j = 1; j <= 3; ++j) {
				System.out.println(i + " " + j);
			}
			System.out.println("Fin del ciclo interno");
		}

		//ciclo dinamico y que valide
		/*
		 * 
			int semanas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nro de semanas "));
			int dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nro de dias"));

			// ciclo externo, imprime semanas
			for (int i = 1; i <= semanas; ++i) {
				System.out.println("Semana: " + i);

				// ciclo interno, imprime dias
				for (int j = 1; j <= dias; ++j) {
					System.out.println("  Día: " + j);
				}
			}
			
			int semanas, dias;
		do {
			semanas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nro de semanas (1-52)"));
		} while ((semanas<0 || semanas>=52));
		do {
			dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nro de dias (1-7)"));
		} while ((dias<=0 || dias >=7) );
		
		omitir una semana
		 if(i == 2) {
          break;
        }
		
		dias pares
					if(j % 2 != 0) {
						  continue;
					}
		 */

	}

}
