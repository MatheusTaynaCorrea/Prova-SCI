import java.util.Scanner;

public class DoisJava {
    public static void main(String[] args) throws Exception {
       
        Scanner teclado = new Scanner(System.in);
  
        System.out.println("Digite o 1° número:");
        int num1 = teclado.nextInt();
        System.out.println("Digite o 2° número");
        int num2 = teclado.nextInt();
        System.out.println("Digite o 3° número");
        int num3 = teclado.nextInt();
        System.out.println("Digite o 4° número");
        int num4 = teclado.nextInt();
        System.out.println("Digite o 5° número");
        int num5 = teclado.nextInt();
        
// primeiro número
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1>num5) {
        System.out.println("O 1°valor é o maior  número");
        }
        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
            System.out.println("O 1°valor é o menor  número");


            // segundo número
            if (num2 > num2 && num2 > num3 && num2 > num4 && num2 > num5) {
                System.out.println("O 2°valor é o maior  número");
                }
                if (num2 < num1 && num2 < num3 && num2 < num4 && num2< num5) {
                    System.out.println("O 2°valor é o menor  número");
                }


                // terceiro número
                if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
                System.out.println("O 3°valor é o maior  número");
                }
                if (num3 < num1 && num3 < num2 && num3 < num4 && num3< num5) {
                    System.out.println("O 3°valor é o menor  número");
                }



                // quarto número
                if (num4 > num1 && num4  > num2 && num4 > num3 && num4  > num5) {
                    System.out.println("O 4°valor é o maior  número");
                    }
                    if (num4  < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
                        System.out.println("O 4°valor é o menor  número");
                    }
    

                    // quinto número
                    if (num5 > num1 && num5> num2 && num5 > num3 && num5  > num4) {
                        System.out.println("O 5°valor é o maior  número");
                        }
                        if (num5  < num1 && num5 < num2 && num5 < num3 && num5 < num4) {
                            System.out.println("O 5°valor é o menor  número");
                        }
        
    
    teclado.close();
        
    }
    }}
