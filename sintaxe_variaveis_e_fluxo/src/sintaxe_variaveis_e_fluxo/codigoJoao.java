package sintaxe_variaveis_e_fluxo;

public class codigoJoao {
	public static void main(String[] args) {
		double salario = 3300.0;
		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("o IR é de 7.5%");
			System.out.println("A declaração o valor de R$ 142");
		} else if (salario >= 2800.1 && salario <= 3751.0) {
			System.out.println("o IR é de 15%");
			System.out.println("A declaração o valor de R$ 350");
		} else if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("o IR é de 22.5%");
			System.out.println("A declaração o valor de R$ 636");
		}
	}
}
