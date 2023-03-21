package DoisJava;

import java.util.Scanner;

public class DoisJava {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int valor[] = new int[5];
		int maior = valor[0], menor = Integer.MAX_VALUE;

		for (int i = 0; i < valor.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor: ");
			valor[i] = key.nextInt();
			if (valor[i] > maior) {
				maior = valor[i];
			}
		}
		for (int j = 0; j < valor.length; j++) {
			if (valor[j] < menor) {
				menor = valor[j];
			}
		}
		key.close();
		System.out.println("Maior valor digitado é: " + maior);
		System.out.println("Menor valor digitado é: " + menor);
	}
}
