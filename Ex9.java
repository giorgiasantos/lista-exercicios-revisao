import java.util.Arrays;

// 9. Crie um vetor capaz de armazenar 50 números inteiros. Em seguida faça o seu preenchimento automático com os números de 101 a 150, ou seja, na posição número 0 ponha 101, na posição 1 ponha o número 102, e assim sucessivamente. Em seguida exiba os valores deste vetor.
public class Ex9 {
    public static void main(String[] args) {
        int arrayNumeros [] = new int[50];
        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayNumeros[i] = i + 101;
            //System.out.println(arrayNumeros[i]);

        }System.out.println(Arrays.toString(arrayNumeros));




    }
}
