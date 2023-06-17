package bytebank_herdado;
//Gerente é um funcionário, gerente herda da class funcionario
public class Designer extends Funcionario{

	//super que dizer que o atributo ou método é de outra classe, ou seja da mãe;
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Designer");
		return  200;
	}

}
