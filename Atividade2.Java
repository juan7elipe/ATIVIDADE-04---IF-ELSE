import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);

    int numero;

    System.out.println("Digite o número:");
    numero = scanner.nextInt();

    if (numero % 2 == 0 ) {
        System.out.println("O número que você digitou é par:");
        System.out.println(numero);
    }

    else {
        System.out.println("O nímero que você digitou é ímpar:");
        System.out.println(numero);
    }

    scanner.close();

    }
}
