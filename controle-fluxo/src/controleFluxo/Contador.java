package controleFluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Primeiro numero:");
		int parametroUm = scanner.nextInt();
		System.out.println("Segundo numero:");
		int parametroDois = scanner.nextInt();
 
		try {
 
			contar(parametroUm, parametroDois);
 
		}catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
 
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
    throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
  }
 
		int contagem = parametroDois - parametroUm;
 
		for (int i = 0; i < contagem; ++i) {
		  System.out.println("Imprimindo o numero " + (i+1));
		}
 
	}
	
	public static class ParametrosInvalidosException extends Exception {

  public ParametrosInvalidosException(String message) {
    super(message);
  }
}
}