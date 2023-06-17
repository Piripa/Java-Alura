package bytebank_herdado;

public class ControleBonificacao {
	private double soma;
	//Todo mundo que é funcionário pode ter sua bonificação controlada
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
		
	}
	
	public double getSoma(){
		return this.soma;
	}
}
