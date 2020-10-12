package modelFCE;

import java.io.Serializable;

public  class Saldo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	double quantidadeSaldo;		
	double custoSaldo;
	double totalSaldo;
	
	public Saldo() {
		
	}
	public Saldo(double quantidadeSaldo, double custoSaldo, double totalSaldo) {
		this.quantidadeSaldo = quantidadeSaldo;
		this.custoSaldo = custoSaldo;
		this.totalSaldo = totalSaldo;
	}
	public double getQuantidadeSaldo() {
		return quantidadeSaldo;
	}
	public void setQuantidadeSaldo(double quantidadeSaldo) {
		this.quantidadeSaldo = quantidadeSaldo;
	}
	public double getCustoSaldo() {
		return custoSaldo;
	}
	public void setCustoSaldo(double custoSaldo) {
		this.custoSaldo = custoSaldo;
	}
	public double getTotalSaldo() {
		return totalSaldo;
	}
	public void setTotalSaldo(double totalSaldo) {
		this.totalSaldo = totalSaldo;
	}	
	
}