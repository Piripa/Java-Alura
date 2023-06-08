package sintaxe_variaveis_e_fluxo;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadePessoas = 2;
		boolean acompanhado;//Aqui a váriavel foi criada, mas não inicializada. Ela só roda inicializada
		//Variáveis declaradas dentro de um escopo, ela só é válida naquele escopo
		if(quantidadePessoas >=2) {
			acompanhado = true;
		}
		else {
			acompanhado = false;
		}
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
