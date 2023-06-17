package bytebank_herdado;
//uma interface não pode ter nada concreto;
//concreto é aquelas variaveis de instancia, ou métodos;
//contrato Autenticavel
	//quem assinar esse contrato, precisa implementar 
		//método setSenha
		//método autentica
public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
