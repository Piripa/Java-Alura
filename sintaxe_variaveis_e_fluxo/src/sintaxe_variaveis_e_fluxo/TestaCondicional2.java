package sintaxe_variaveis_e_fluxo;

public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;
		System.out.println("valor de acompanhado = " + acompanhado);
		
		if ( idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
			//Se tirar as chaves, ele só vai contar com a proxima linha caso a condição for true;
		}
		else {
			System.out.println("infelizmente você não pode entrar");	
		}
		//#True ou False;
		
	}
}
