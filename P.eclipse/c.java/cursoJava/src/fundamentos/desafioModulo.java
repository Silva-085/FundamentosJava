package fundamentos;

import java.util.Scanner;

public class desafioModulo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
        System.out.print("Digite o primeiro valor: ");
        Double num1 = entrada.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        Double num2 = entrada.nextDouble();
        
        System.out.print("Digite o operador: ");
        String op = entrada.next();
		

       double resultado = "+".equals(op) ? num1 + num2 : 0;
       resultado = "-".equals(op) ? num1 - num2 : resultado;
       resultado = "*".equals(op) ? num1 * num2 : resultado;
       resultado = "/".equals(op) ? num1 / num2 : resultado;
       resultado = "%".equals(op) ? num1 % num2 : resultado;
       
       System.out.printf("%.2f %s %.2f = %.2f",
    		   num1, op, num2, resultado);
	entrada.close();
}
}