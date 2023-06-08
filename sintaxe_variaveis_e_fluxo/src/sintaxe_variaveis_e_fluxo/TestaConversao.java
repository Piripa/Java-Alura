package sintaxe_variaveis_e_fluxo;

public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1270.50;
		//F no final indica que é um float, um número decimal.
		float pontoFlutuante = 3.14f;
		int valor = (int)salario; //Transforma double em inteiro,isso é um casting;
		System.out.println(valor);
		//Guarda um número grande, de valor de 64 bits, coloque um l no final para indicar que ele é grande;
		long numeroGrande = 32432423523L;
		//Guarda um pequeno número,valor de 32bits;
		short valorPequeno = 2131;
		//Menor ainda, de um byte;
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
		
	}
}
