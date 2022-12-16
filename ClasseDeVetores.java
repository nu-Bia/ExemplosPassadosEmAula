package aula;

public class ClasseDeVetores {
public static void main (String[]args) {
	
	String [] nome = {"Núbia" , "Núb" , "Bia", "Nú","Núbi"};
	String [] numero = {"119876543" , "1194184567" , "1198765432", "1198873532","11024938345"};
	String [] email = {"Núbiareis@gmail.com" , "Núbiafaria@gmail.com" , "Núbia@gmail.com", "Núbinha@gmail.com","Núbiaf@gmail.com"};
	String [] idade = {"18","34","63","25","33"};
	String [] genero = {"Feminino" , "Feminino" , "Feminino" , "Feminino" , "Feminino"};
	String[] solteira = {"true", "false", "true" , "false", "true"};

	for (int i = 0 ; i < nome.length ; i++) { 
	System.out.println (nome[i]);}
	
	for (int i = 0 ; i < numero.length ; i++) {
		System.out.println (numero[i]);}
	
	for (int i = 0 ; i < email.length ; i++) {
		System.out.println (email[i]);}
	
	for (int i = 0 ; i < idade.length ; i++) {
		System.out.println (idade[i]);}
	
	for (int i = 0 ; i < solteira.length ; i++) {
		System.out.println (solteira[i]);}
	
	
	System.out.println ("A cliente"+ nome.length + "portadora do telefone"+ numero.length + 
	"e e-mail"+ email.length + "com idade de" + idade.length+ "e estado civil de " + solteira.length );
	

	
}}
