import java.util.Scanner;

// 2. Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar, imprimir o resultado desta operação.
public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE UM NÚMERO: ");
        double numero = entrada.nextInt();
        double resultado = 0;

        if (numero % 2 == 0) {
            resultado = numero + 5;
            System.out.println("O número é par. O resultado da sua soma com 5 é = " + resultado);
        } else if (numero % 2 != 0) {
            resultado = numero + 8;
            System.out.println("O número é ímpar. O resultado da sua soma com 8 é = " + resultado);
        }
    }
}
