package fundamentos.operadores;

public class Aritimeticos {

	public static void main(String[] args) {

		// Declarando variáveis do tipo double
		var x = 34.56; // 'var' permite inferência de tipo (neste caso, double)
		double y = 2.2; // Declaração explícita do tipo double
		
		// Operações aritméticas com variáveis do tipo double
		System.out.println(x + y); // Soma
		System.out.println(x - y); // Subtração
		System.out.println(x * y); // Multiplicação
		System.out.println(x / y); // Divisão
		
		// Declarando variáveis do tipo inteiro
		int a = 8;
		int b = 3;
		
		// Operações aritméticas com variáveis inteiras
		System.out.println(a + b); // Soma
		System.out.println(a - b); // Subtração
		System.out.println(a * b); // Multiplicação
		System.out.println(a / b); // Divisão entre inteiros (resultado será inteiro)
		System.out.println(a / (double) b); // Conversão explícita para double para obter resultado com casas decimais
		System.out.println(a / (float) b); // Conversão explícita para float para obter resultado com casas decimais
		
		// Operação de módulo (resto da divisão)
		System.out.println(a % b); // Resto da divisão de 8 por 3
		System.out.println(8 % 3); // Outra forma de fazer a mesma operação
		
		// Expressão combinada com soma, subtração e multiplicação
		System.out.println(x + y - a * b); // Segue a ordem de precedência dos operadores

	}
}

