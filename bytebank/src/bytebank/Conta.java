package bytebank;

/*tipo conta:
saldo
agencia
numero
titular*/
public class Conta {
	// Atributos
	double saldo;
	int numero;
	int agencia = 42;
	String titular;

//Criando métodos
//Não existe método,dentro de métodos;
	// Void para retornar nada
	public void deposita(double valor) {
		// (Opcional)This(aponta para um objeto) referência para o atributo que está
		// sendo chamado em uma referencia de uma objeto, o método;
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
		
	}

}