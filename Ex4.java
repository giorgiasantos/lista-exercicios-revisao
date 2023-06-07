import java.util.Scanner;
import java.text.DecimalFormat;

// 4. Leia a idade de 20 pessoas e exiba a média das idades.
public class Ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double somaIdades = 0;

        for (int i =0; i < 3; i++){
            double idade = 0;
            System.out.println("DIGITE A IDADE: ");
            idade = entrada.nextDouble();
            somaIdades += idade;
            //System.out.println(idade);
        }
        double media = somaIdades / 3;
        System.out.println("A média das idades é: " + df.format(media));

    }
}
