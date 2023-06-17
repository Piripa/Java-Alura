package bytebank_herdado;
//é algo abstrato, não concreto, o compilador não permite instanciar um objeto dessa classe
//funcionário é um conceito
public abstract class Funcionario {
	private String nome;
	private String cpf;
	//protected significa que é publico para class filhas que herdaram da class mãe
	private double salario;
	
	//método não concreto, método abstrato, método não tem corpo,não há implementação,obriga os filgos a implementar o método;
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
