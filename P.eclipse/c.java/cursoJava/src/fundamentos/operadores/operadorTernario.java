package fundamentos.operadores;

public class operadorTernario {
	
	public static void main(String[] args) {
		
		double media = 9.0;
		String resultadoParcial = media >= 5.0 ? "Em recuperação" : "Reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
		
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 10;
		boolean bomComportamento = true;
		boolean passouMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("Tem desconto? %s", resultado);
	}
}
