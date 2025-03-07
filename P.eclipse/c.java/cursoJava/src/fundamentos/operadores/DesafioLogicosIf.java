package fundamentos.operadores;

public class DesafioLogicosIf {

	public static void main(String[] args) {
		
	    boolean trabalho1 = false;
		boolean trabalho2 = false;

		 
		 if (trabalho2 && trabalho1) {
			System.out.println("Vamos comprar um tv grande e tomar sorvete.");
		} else if (trabalho2 || trabalho1) {
			System.out.println("Vamos comprar um tv pequena e tomar sorvete.");
		} else {
			System.out.println("nenhum trabalho não deu certo. ficamos mais saldaveis.");
		} 
		
	}
}
