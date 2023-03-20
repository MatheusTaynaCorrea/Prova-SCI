import java.util.Scanner;

public class TresJava {
    public static void main(String[] args) throws Exception {


        Scanner m = new Scanner(System.in);
        String nome = "";
        double nota1, nota2,nota3,nota4, media;
    
        while (!nome.equals("Fim")) {

          System.out.print(" Nome: "); 
          nome = m.next();

          if (!nome.equals("Fim")) {

            System.out.print(" Nota1: "); 
            nota1 = m.nextDouble();

            System.out.print(" Nota2: ");
             nota2 = m.nextDouble();

             System.out.print(" Nota3: ");
             nota3 = m.nextDouble();

             System.out.print(" Nota4: ");
             nota4 = m.nextDouble();

             System.out.println(" Nome:  " + nome);
        
            media = (nota1 + nota2 + nota3 + nota4) / 4;
 
            System.out.println(" A média de " + nome + " é " + media);
          }
        }
    
        m.close();




    }
}
