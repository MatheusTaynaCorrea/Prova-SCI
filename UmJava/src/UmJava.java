import java.util.Scanner;

public class UmJava {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        double media = 0;
        int pares = 0;
        int impar = 0;
        for (int s = 0; s<5; s++){

        double numero = teclado.nextInt();
        if(numero % 2 == 00){
            pares ++;
        }
        else if(numero % 2 == 1){
            impar ++;
        }
        media += numero;
        }
        
        media = media / (pares+impar);
       

        System.out.println(pares + " Números pares");
        System.out.println(impar + " Números impar");
        System.out.println(" A  média é  " + media );

teclado.close();
    }}


