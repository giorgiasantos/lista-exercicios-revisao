import java.util.Scanner;

// 1. Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se somar os dois, caso contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.
public class Ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE O PRIMEIRO NÚMERO: ");
        int num1 = entrada.nextInt();
        System.out.println("DIGITE O SEGUNDO NUMERO: ");
        int num2 = entrada.nextInt();
        int resultado = 0;

        if(num1 == num2) {
            resultado = num1 + num2;
            System.out.println("Os dois números são iguais. O resultado da soma entre eles é = " + resultado);
        } else if (num1 != num2){
            resultado = num1 * num2;
            System.out.println("Os dois números são diferentes. O resultado da multiplicação entre eles é = " + resultado);
        }
    }
}
