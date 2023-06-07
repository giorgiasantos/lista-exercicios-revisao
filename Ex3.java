//
//3. Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas por um aluno nas 3 verificações e a média dos exercícios que fazem parte da avaliação, e calcule a média de aproveitamento, usando a fórmula: MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7
//        A atribuição dos conceitos obedece a tabela abaixo. O algoritmo deve escrever o número do aluno, suas notas, a média dos exercícios, a média de aproveitamento, o conceito correspondente e a mensagem 'Aprovado' se o conceito for A, B ou C, e 'Reprovado' se o conceito for D ou E.
//        Média de aproveitamento Conceito
//        >= 90 A
//        >= 75 e < 90 B
//        >= 60 e < 75 C
//        >= 40 e < 60 D
//< 40 E

import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("DIGITE O NÚMERO DE MATRÍCULA DO ALUNO: ");
        int aluno = entrada.nextInt();
        System.out.println("-------------------------------------------");
        System.out.println("DIGITE A PRIMEIRA NOTA DE 0 A 100: ");
        double nota1 = entrada.nextDouble();
        System.out.println("DIGITE A SEGUNDA NOTA DE 0 A 100: ");
        double nota2 = entrada.nextDouble();
        System.out.println("DIGITE A TERCEIRA NOTA DE 0 A 100: ");
        double nota3 = entrada.nextDouble();
        System.out.println("DIGITE A NOTA DOS EXERCÍCIOS: ");
        double exercicios = entrada.nextDouble();
        double mediaMa = (nota1 + (nota2 * 2) + (nota3 * 3) + exercicios) / 7;

        System.out.println("-------------------------------------------");

        System.out.println("BOLETIM DO ALUNO DE MATRÍCULA " + aluno);
        System.out.println();
        System.out.println("Primeira nota: " + nota1);
        System.out.println("Segunda nota: " + nota2);
        System.out.println("Terceira nota: " + nota3);
        System.out.println("Média dos exercícios: " + exercicios);
        System.out.println("Média de aproveitamento: " + df.format(mediaMa));
        System.out.println();
       if(mediaMa >= 90) {
           System.out.println("Seu conceito é A. Você foi aprovado!");
       } else if (mediaMa >= 75 && mediaMa < 90) {
           System.out.println("Seu conceito é B. Você foi aprovado!");
       } else if (mediaMa >= 60 && mediaMa < 75) {
           System.out.println("Seu conceito é C. Você foi aprovado!");
       } else if (mediaMa >= 40 && mediaMa <60) {
           System.out.println("Seu conceito é D. Você foi reprovado.");
       } else if (mediaMa < 40) {
           System.out.println("Seu conceito é E. Você foi reprovado.");
       }



    }
}
