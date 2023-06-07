import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 8. Leia um conjunto de salários, sendo que para terminar a entrada será fornecido o valor -1. Após toda a entrada ter sido realizada, leia o valor de um reajuste. Em seguida exiba todos os salários já reajustados.

public class Ex8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Double> listaSalarios = new ArrayList<>();
        double salario = 0;
        // RECEBE OS VALORES DOS SALÁRIOS
        for (int i = 0; i >= 0; i++) {
            System.out.println("DIGITE O VALOR DO SALARIO: ");
            salario = entrada.nextDouble();

            if (salario > 0) {
                listaSalarios.add(salario);
            } else {
                System.out.println("Valor inválido.");
                break;
            }
        }
        // RECEBE O VALOR DO REAJUSTE
        System.out.println("DIGITE O VALOR DO REAJUSTE EM %: ");
        double reajusteEntrada = entrada.nextDouble();
        double reajusteFinal = 0;
        double salarioComAumento = 0;
        List<Double> listaSalariosAjustados = new ArrayList<>();

        // CONVERTE OS VALORES COM AJUSTE E INSERE NUMA NOVA LISTA
        for (int z = 0; z < listaSalarios.size(); z++) {

            reajusteFinal = (listaSalarios.get(z) * reajusteEntrada) / 100;
            salarioComAumento = listaSalarios.get(z) + reajusteFinal;
            listaSalariosAjustados.add(salarioComAumento);
            }

        // SAÍDA DOS VALORES DOS SALÁRIOS
        System.out.println("Os salários antes do aumento de " + reajusteEntrada + "% era: " + listaSalarios);
        System.out.println("Os valores de todos os salários reajustados será: " + listaSalariosAjustados);


    }
}
