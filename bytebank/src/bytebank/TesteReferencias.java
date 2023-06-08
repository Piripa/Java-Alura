package bytebank;

public class TesteReferencias {
	public static void main(String[] args) {
		//A Conta primeiraConta é uma referência para uma nova Conta;
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("O saldo da primeira conta: " + primeiraConta.saldo);
		//Ele não copia os valores do objeto;
		//Copia o endereço de memória;
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		//Referenciam para o mesmo objeto;
		
		System.out.println("O novo saldo da segunda conta: " + segundaConta.saldo);
		
		System.out.println("O saldo da primeira conta é : " + primeiraConta.saldo);
		//Não compara o objetos e,sim, sua referência;
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesmissima conta");
		}
		//Referencia da primeiraConta
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
