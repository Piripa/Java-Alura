package bytebank_composto;

/*tipo conta:
saldo
agencia
numero
titular*/
public class Conta {
	// Atributos
	//Fora da class não pode ser modificado e nem lido;
	private double saldo;
	int numero;
	int agencia;
	Cliente titular;

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
	//Encapsulamento
	//Criamos o método que retorna aquele informação, mas não manipula-lá
	//Métodos que pegam uma informação, geralment usamos get
	public double getSaldo() {
		return this.saldo;
	}

}