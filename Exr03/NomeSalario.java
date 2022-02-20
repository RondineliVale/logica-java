/*
3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
*/


import java.util.Scanner;
public class NomeSalario{
	public static void main (String[] args){
		Scanner leia = new Scanner(System.in);
	
		System.out.println();
		System.out.print("Insira o nome do funcionario(a): ");
		String funcionario = leia.nextLine();
		System.out.println();
	
		System.out.println();
		System.out.print("Insira o salario que o funcionario(a) " + funcionario + " recebe: ");
		double salario = leia.nextDouble();
		System.out.println();
		
		System.out.println("O funcionario(a) " + funcionario + " tem um salario de R$" + salario + " nessa empresa no ate o presente mes.");
		System.out.println();
	
	}
}

	
	