package java_pilha;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        }
        catch(ArithmeticException | NullPointerException ex)//Se tivermos um catch expecífico, não será retirado da pilha e irá encerrar o programa
        {
        	String msg = ex.getMessage(); //Pega a mensagem de erro
        	System.out.println("Expection " + msg);
        	ex.printStackTrace(); //Mostra o rastro da exceção
        }
     
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        throw new ArithmeticException("deu errado"); //Criamos uma bomba que cai sobre a pilha e é jogada(throw) kkkkk
       
        //System.out.println("Fim do metodo2");
    }
}