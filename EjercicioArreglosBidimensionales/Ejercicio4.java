package EjercicioArreglosBidimensionales;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intArray;
		intArray = new int[20][20];
		
		 for(int i=0;i<intArray.length;i++) {
	        	for(int j=0;j<intArray[i].length;j++) {
	        		if(i==j) {
	        		intArray[i][j]=1;
	        	}
	   
		    }
		 }
		  //Imprimo - Filas
	  		for (int i=0; i<intArray.length;i++) {
	  			//columnas
	  			for (int j=0; j<intArray[i].length;j++) {
	  				System.out.print(intArray[i][j]+"  ");
	  	
	  			}
	  			System.out.println();
	  		}
	  	}

	}
