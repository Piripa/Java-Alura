package bytebank_herdado_conta;
//não herdamos o construtor
public class ContaPoupanca extends Conta {
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
}
