import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a string: ");
        String texto = scanner.nextLine();
        Result result = new Result(texto);
        result.verificaBalanceamento();
    }
}
