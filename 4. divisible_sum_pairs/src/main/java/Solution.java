import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputDivisor = scanner.nextLine();
        String inputArray = scanner.nextLine();
        Result result = new Result(inputDivisor, inputArray);
        System.out.println(result.getParesValidos());
    }
}
