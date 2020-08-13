package application;

import java.util.Locale;
import java.util.Scanner;

import ententies.Conta;

public class Pagamento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Digite o numero do Cliente:");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o nome do Cliente: ");
		String nome = sc.nextLine();
		System.out.print("Existe valor em conta(y/n)?");
		char opcao = sc.next().charAt(0);
		double valor = 0;
		
		switch(opcao) {
			case 'y':
				System.out.print("Digite o valor: ");
				valor = sc.nextDouble();
				conta = new Conta(numero,nome,valor);
				System.out.println();
			break;
			default:
				conta = new Conta(numero,nome);
				System.out.println();
		}
		
		System.out.println("Dados do Cliente: ");
		System.out.println(conta.toString());
		
		System.out.println();
		System.out.println("Digite o valor a ser depositado: R$");
		valor = sc.nextDouble();
		conta.addSaldo(valor);
		System.out.println(conta.toString());
		
		System.out.println();
		System.out.println("Digite o valor a ser debitado: R$");
		valor = sc.nextDouble();
		conta.removerSaldo(valor);
		System.out.println(conta.toString());
		
		System.out.println();
		System.out.println("Dados do Cliente");
		System.out.println(conta.toString());
		
		sc.close();
	}

}
