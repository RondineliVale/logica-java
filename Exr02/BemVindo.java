/*
2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas
para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!
*/
import java.util.Scanner;
public class BemVindo{
	public static void main (String[] args){
		Scanner digite = new Scanner(System.in);
		
		
		System.out.println();
		System.out.print("Qual o seu nome? ");
		String nome = digite.nextLine();
		
		System.out.println();
		System.out.println("Ola " + nome + ", e um prazer te conhecer!");
		System.out.println();
	}
}		
