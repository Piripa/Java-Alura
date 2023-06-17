package bytebank_herdado_conta;


public abstract class Conta {
	// Atributos
	//Fora da class não pode ser modificado e nem lido;
	protected double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	//Não muda, o total  é um atributo da classe não mais do objeto.
	//Static quer dizer,da class
	private static int total;
	
	
	
	//Construtor(pode receber parâmetros, padrão,uma rotina de inicialização, ao construir o objeto.
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas é " + total);
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		//System.out.println("Estou criando uma conta " + this.numero);
	}

//Criando métodos
//Não existe método,dentro de métodos;
	// Void para retornar nada
	public abstract void deposita(double valor);
	
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
		if(this.saca(valor)) {
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
	//Pega o número
	public int getNumero() {
		return this.numero;
	}
	//Altera alguma coisa, ou seja, aqui o número
	public void setNumero(int numero) {
		if(numero <=0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <=0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		//static quer dizer da class, e não da instância;
		//Dentro de um método static, não existe o this, nem um atributo de instância;
		return Conta.total;
	}
}