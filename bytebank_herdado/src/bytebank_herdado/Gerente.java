package bytebank_herdado;
//Gerente é um Funcionario, gerente herda da class Funcionario, assina o contrato Autenticavel, é um autenticavel
//Não existe herança múltipla no java,gerente não pode herdar o funcionario e o autenticavel
//posso usar interfaces multiplas, assinar vários contratos.
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	//super que dizer que o atributo ou método é de outra classe, ou seja da mãe;
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonifacação do gerente");
		return  super.getSalario();
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
