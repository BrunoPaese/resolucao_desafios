import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do texto: ");
        int tamanhoString = scanner.nextInt();
        System.out.println("Digite o texto: ");
        String texto = scanner.next();
        System.out.println("Digite a rotação: ");
        int rotacao = scanner.nextInt();
        Result result = new Result(tamanhoString, texto, rotacao);
        result.imprimeCifra();
    }
}
