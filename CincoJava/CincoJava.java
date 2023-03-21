package CincoJava;

import java.util.Scanner;

public class CincoJava {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int qtAlunos = 3;
		int qtNotas = 4;
		
		double [][] notasDaTurma = new double [qtAlunos][qtNotas];//MATRIZ É BIDIMENCIONAL;
		
		
		
		double total = 0;
	    for ( int a = 0; a < notasDaTurma.length; a++ ) {
	    	for ( int n = 0; n < notasDaTurma[a].length; n++ ) {
	    		
	    		System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a);
	    		notasDaTurma [a] [n] = entrada.nextDouble();
	    		total += notasDaTurma [a] [n];
	    		
	    	}
	    }
	    
	    double media = total / (qtAlunos * qtNotas);
	    System.out.println("Media da Turma é: " + media);
	    entrada.close();
 		
		

	}
}
