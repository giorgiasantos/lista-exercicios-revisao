import java.util.Scanner;

// 6. Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números. Encerre a execução quando um número negativo for digitado.
public class Ex6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("QUANTOS NÚMEROS VOCÊ DESEJA SOMAR?");
        int qtdeNumeros = entrada.nextInt();
        int somaPositivos = 0;
        int numeroUsuario = 0;

        for(int i = 0; i < qtdeNumeros; i++) {
            System.out.println("DIGITE UM NUMERO: ");
            numeroUsuario = entrada.nextInt();

            if (numeroUsuario >= 0) {
                somaPositivos += numeroUsuario;
            } else if (numeroUsuario < 0) {
                System.out.println("O NÚMERO INFORMADO É NEGATIVO. TCHAU.");
                break;
            }

        } System.out.println("A SOMA DOS NÚMEROS POSITIVOS É: " + somaPositivos);

    }
}
