package TresJava;

import java.util.Scanner;

public class TresJava {

	public static void main(String[] args) throws Exception {

		Scanner m = new Scanner(System.in);
		String nome = "";
		double nota = 0;
		double media = 0;
		double soma = 0;

		System.out.println("Nome: ");
		nome = m.next();
		for (int i = 1; i <= 4; i++) {

			System.out.println("Nota: ");
			nota = m.nextDouble();

			if (nota >= 0 && nota <= 10) {
				soma += nota;
			}

		}
		
		media = soma/4;
		
		if (media >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

		System.out.println(" A média de " + nome + " é " + media);

		m.close();
	}

}
