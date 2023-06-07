import java.util.PrimitiveIterator;
import java.util.Scanner;

// 7. Leia o nome do usuário e um número N, após isso escreva o nome dele na tela N vezes.
public class Ex7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE O SEU NOME: ");
        String nome = entrada.next();
        System.out.println("DIGITE UM NÚMERO: ");
        int numero = entrada.nextInt();
        System.out.println("---------------------------------");
        for(int i = 0; i < numero; i++) {
            System.out.println(nome);
        }

    }
}
