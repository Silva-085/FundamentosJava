package fundamentos;

public class DesafioAritimetico {
	public static void main(String[] args) {
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (5 - 1)*(2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double supeior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);

		double resultado = supeior / inferior;
				
		System.out.println("O resultado é: " + resultado);
	}
}
