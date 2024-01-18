import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        System.out.println("Digite a base da escada: ");
        Scanner scanner = new Scanner(System.in);
        int baseAltura = scanner.nextInt();
        Result result = new Result(baseAltura);
        result.imprimeEscada();
    }
}
