package alura;

public class Conta {
	private double saldo;
	//private int agencia = 0;
	//private int numero = 0;
	private Cliente titular = new Cliente();
	
public double getSaldo() {
	return this.saldo;
}

public boolean Saque(double valor) {
	if (this.saldo >= valor) {
		this.saldo -= valor;
	    return true;
	}
	return false;
}

public Cliente getTitular() {
	return titular;
}

public void setTitular(Cliente titular) {
	this.titular = titular;
}

public boolean Deposita(double valor) {
	this.saldo += valor;
	return true;
}

public boolean Transfere(double valor, Conta destino) {
	//this.Saque(valor);
	if (this.Saque(valor)) {
	destino.Deposita(valor);
	System.out.println("Transferiu de: (" + this.titular.getNome() + ") para (" + destino.titular.getNome() + ")");
	return true;
	} 
	System.out.println("Valor de R$" + valor + " não pode ser transferido para " + destino.titular.getNome() + " seu saldo é de " + this.getSaldo());
	return false;
}

public String NomeDestino(Conta destino) {
	return destino.titular.getNome();
}
}
