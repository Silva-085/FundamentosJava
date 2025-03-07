package fundamentos;

import java.util.Scanner;
public class DesafioConversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criando o Scanner
         
        System.out.println("Digite o primeiro salario:");
        String num1 = scanner.nextLine().replace(',', '.');
        
        System.out.println("Digite o segundo salario:");
        String num2 = scanner.nextLine().replace(',', '.');;

        System.out.println("Digite o terceiro salario:m");
        String num3 = scanner.nextLine().replace(',', '.');; 
        
        double valor1 = Double.parseDouble(num1);
        double valor2 = Double.parseDouble(num2);
        double valor3 = Double.parseDouble(num3);
        
       
        double media = (valor1 + valor2 + valor3) /3;
        System.out.println("Media é: " + media);
        
        scanner.close();
	}
}
