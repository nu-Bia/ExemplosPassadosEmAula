//a)   Ler 10 elementos de uma matriz tipo vetor e apresentá-los. 
package aula;

public class ExercicioManzanoA {
	public static void main(String[] args) {
		
		int [] Numeros = new int [10];
	    
	    Numeros [0] = 1 ;
		Numeros [1] = 2;
		Numeros [2] = 3;
		Numeros [3] = 4;
		Numeros [4] = 5;
		Numeros [5] = 6;
		Numeros [6] = 7;
		Numeros [7] = 8;
		Numeros [8] = 9;
		Numeros [9] = 10;
	     
	     for (int posicao=0 ; posicao < 10; posicao++) {
	    	 System.out.println(Numeros[posicao] + ""); 
	    	 }
	}
}
