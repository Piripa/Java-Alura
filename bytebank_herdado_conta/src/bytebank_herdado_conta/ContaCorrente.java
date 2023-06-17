package bytebank_herdado_conta;
//herda os atributos , os métodos , mas não herda os construtores
//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		//chamando o construtor da class mãe
		super(agencia, numero);
	}
	//Configuração para o copilador para saber que esta sobrescrevendo o método
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
