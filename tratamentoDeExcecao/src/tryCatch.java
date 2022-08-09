import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      try {
      int num1 = 0;
          System.out.println("Digite um número: ");
      int num2 = scan.nextInt();

      int soma = num1 + num2;

          System.out.println("A soma é: " + soma);

      }
      catch(Exception e) {
          System.out.println("ERRO. Você não digitou um numero.");
      }
    }
}
