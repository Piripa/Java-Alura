package sintaxe_variaveis_e_fluxo;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		
		if ( idade >= 18 ) {
			System.out.println("voê tem mais de 18 anos");
			System.out.println("Seja bem vindo");
			//Se tirar as chaves, ele só vai contar com a proxima linha caso a condição for true;
		}
		else {
			if(quantidadePessoas >=2) {
				System.out.println("VocÊ não tem 18,mas pode entrar,"
						+ "pois está acompanhado");
			}
			else {
			System.out.println("infelizmente você não pode entrar");
			}
		}
	}
}
