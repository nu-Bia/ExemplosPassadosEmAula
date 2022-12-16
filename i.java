package aula;

import java.util.Scanner;

public class i {
	
public static void main (String[]args) {
	Scanner sc = new Scanner(System.in);
	int valor = sc.nextInt ();
	String resultado = (valor % 2 == 0)? "O numero digitado é par":"numero digitado é impar";
	System.out.println(resultado);
	sc.close();
	
}
}
