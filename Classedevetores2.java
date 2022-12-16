package aula;

import java.util.Scanner;

public class Classedevetores2 {
	
public static void main (String[]args) {

Scanner sc = new Scanner(System.in);{
	
String [] nomes = {};
String [] numeros = {};
String [] email = {};
String [] idades = {};
String [] genero = {};
String[] solteira = {};

for (int i = 0 ; i < 5 ; i++) {
	System.out.println("Digite o seu nome :");
	nomes [i] = (String) sc.nextLine();}

for (int i = 0 ; i < 5 ; i++) {
	System.out.println("Digite o seu número de telefone :");
	numeros [i] = (String) sc.nextLine();}

for (int i = 0 ; i < 5 ; i++) {
	System.out.println("Digite o seu e-mail :");
	email [i] = (String) sc.nextLine();}

for (int i = 0 ; i < 5 ; i++) {
	System.out.println("Digite a sua idade :");
	idades [i] = (String) sc.nextLine();}

for (int i = 0 ; i < 5 ; i++) {
	System.out.println("Digite o seu genero :");
	genero [i] = (String) sc.nextLine();}

for (int i = 0 ; i < 5 ; i++) {
	System.out.println("Você é solteiro? Responda True(sim) ou False (não)");
	solteira [i] = (String) sc.nextLine();}

}
}}
