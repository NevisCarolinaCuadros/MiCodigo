package Parcial;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strArr = new String[11]; String separador = "";
		for ( int i = 1; i <= strArr.length; i += 2) { 
			System . out . print ( separador + strArr [i]) ; 
			separador= " , " ;
		}


	}

}
//La variable strArr.length esta dada con un valor mayor dentro del comando for y tal que i = 1 no puede ser 
//menor que 11