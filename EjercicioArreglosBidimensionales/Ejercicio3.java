package EjercicioArreglosBidimensionales;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] intArray;
		intArray = new int[5][5];
		
		System.out.print(intArray.length);
		
	    for(int i=0;i<intArray.length;i++) {
        	for(int j=0;j<intArray[i].length;j++) {
        		intArray[i][j]=j*i;
        	}
   
	    }
	  //Imprimo
	  		for (int i=0; i<intArray.length;i++) {
	  			//columnas
	  			for (int j=0; j<intArray[i].length;j++) {
	  				System.out.print(intArray[i][j]+" ");
	  	
	  			}
	  			System.out.println();
	  		}
		
	}

}
