package sintaxe_variaveis_e_fluxo;

public class TestaCaracteres {
	public static void main(String[] args) {
		char letra = 'a';//Só da pra usar o char com aspas simples
		System.out.println(letra);
		
		char valor = 66;//Numero no unicode 66 corresponde ao B;
		System.out.println(valor);
		
		valor = (char)(valor + 1);//casting
		System.out.println(valor);
		
		String palavra = "alura cursos online de tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
		
	}
}
