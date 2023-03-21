package UmJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UmJava {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        String par = "";
        String impar = "";
        double soma = 0;
        double numero = 0;
        boolean numeroNaoInformado = true;

        for (int s = 0; s < 5; s++) {

            System.out.println("Insira qualquer número :");

            do {
                try {
                    numero = teclado.nextDouble();
                    numeroNaoInformado = false;
                } catch (InputMismatchException e) {
                    System.out.println("Valor inválido");
                   teclado = new Scanner(System.in);
                }
            } while (numeroNaoInformado);

            soma += numero;

            if (numero % 2 == 0) {
                par += " " + numero;
            } else {
                impar += " " + numero;
            }
        }

        System.out.println(" Números pares :" + par);
        System.out.println(" Números impares :" + impar);
        System.out.println(" A média dos números é " + (soma / 5));

        teclado.close();

    }
}


