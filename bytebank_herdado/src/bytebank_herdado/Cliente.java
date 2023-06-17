package bytebank_herdado;
//ao usar uma class vc implements ela, ou seja, os méotods dela
public class Cliente implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	//Construtor padrão
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);;
		
	}
	@Override
	public boolean autentica(int senha) {
		return  this.autenticador.autentica(senha);
	}
	
	

}
