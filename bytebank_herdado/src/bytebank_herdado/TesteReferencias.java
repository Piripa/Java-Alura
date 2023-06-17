package bytebank_herdado;

public class TesteReferencias {
	public static void main(String[] args) {
		//Gerente herda de funcionario,o contrário não funciona.
		//Pois um funcionario não é um tipo de gerente, mas gerente é um tipo de funcionário;
		//Referencia variavel = novo objeto();
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		// Quem define o que podemos chamar é a referência
		//Mesmo usando um método genérico, sempre será chamado do método específico do objeto;
		//Como o gerente é um funcionário, ele busca na classe gerente a bonificação dele.
		controle.registra(g1);
		
		
		controle.registra(ev);
		
		controle.registra(d);
		
		System.out.println(controle.getSoma());


		
		
				
	}
}
