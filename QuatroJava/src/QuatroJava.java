import java.util.InputMismatchException;
import java.util.Scanner;

public class QuatroJava {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[] vetor = new double[5];
        boolean numeroNaoInformado = true;
        double num = 0;

        for (int i = 0; i < vetor.length; i++) {

            while (numeroNaoInformado) {

                System.out.println(" Escreva qualquer número : ");
                try {
                    num = teclado.nextDouble();
                    numeroNaoInformado = false;
                } catch (InputMismatchException e) {
                    System.out.println("Número inválido");
                    teclado = new Scanner(System.in);
                }

            }

            vetor[i] = num;
            numeroNaoInformado = true;
        } 

        System.out.println("Valor da terceira posição " + vetor[2]);

        teclado.close();
    }

}
