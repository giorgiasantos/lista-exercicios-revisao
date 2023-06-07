import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 5. Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.
public class Ex5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        int numero = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("DIGITE UM NÚMERO: ");
            numero = entrada.nextInt();

            if (numero >= 0 && numero <= 100) {
                lista.add(numero);

            }else {
                System.out.println("Este número não está no intervalo de 0 a 100.");
            }
        }
        System.out.println("Os números que estão no intervalo entre 0 a 100 são: " + lista);
    }
}
