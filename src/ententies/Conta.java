package ententies;

public class Conta {
	
	private int numeroCliente;
	private String nomeCliente;
	private double saldoCliente;

	
	public Conta(int numeroCliente, String nomeCliente) {
		super();
		this.numeroCliente = numeroCliente;
		this.nomeCliente = nomeCliente;
	}

	public Conta(int numeroCliente,  String nomeCliente, double saldoCliente) {
		super();
		this.numeroCliente = numeroCliente;
		this.nomeCliente = nomeCliente;
		addSaldo(saldoCliente);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public double getSaldoCliente() {
		return saldoCliente;
	}
	
	public void addSaldo(double deposito) {
		saldoCliente+=deposito;
	}
	
	public void removerSaldo(double deposito) {
		saldoCliente-=deposito+1.00;
	}
	
	public String toString() {
		return "Numero cliente: "
				+numeroCliente
				+", Nome cliente: "
				+ nomeCliente
				+", Saldo cliente: R$"
				+String.format("%.2f", saldoCliente);
				
	}

}
