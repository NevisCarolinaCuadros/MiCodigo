package Class;

public class ComSecuencialidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cast
		//Valores aleatorios method stub
		float valorAleatorioFloat = (float) (Math.random()*30);
		
		
		//Valores aleatorios enteros 
		int valoresAleatoriosInt = (int) (Math.random()*30);
		
		
		
		//Calcula valor aleatorio entre un rango de numeros
		int min = 30;
		int max = 40;
		
		int valorAleatorio = (int) Math.floor(Math.random()* (max - min + 1)) + min;
		
		System.out.println("Aleatorio entre " + min + " y " + max + ": " + valorAleatorio);

	}

}
