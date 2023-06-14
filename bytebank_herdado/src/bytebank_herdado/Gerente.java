package bytebank_herdado;
//Gerente é um funcionário, gerente herda da class funcionario
public class Gerente extends Funcionario{
	
	private int senha;
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	//super que dizer que o atributo ou método é de outra classe, ou seja da mãe;
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}

}
