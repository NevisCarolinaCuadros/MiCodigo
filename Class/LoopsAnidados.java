package Class;

public class LoopsAnidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int semanas = 3, dias = 7;
		
		//ciclo externo, imprime semanas
		for(int i =1; i<= semanas; ++i) {
			System.out.println("Semana: " + i);
			
			//ciclo interno, imprime dias 
			for(int j = 1; j<= dias; ++j) {
				System.out.println("Día: " + j);
			}
		}

	}

}
