import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = scanner.nextInt();
        String termos = "";
        for (int i = 0; i < tamanho + 1; i++) {
            termos = termos + " " + scanner.nextLine();
        }
        Result result = new Result(tamanho, termos);
        System.out.println(result.diferencaAbsolutaEntreDiagonais());
    }
}
