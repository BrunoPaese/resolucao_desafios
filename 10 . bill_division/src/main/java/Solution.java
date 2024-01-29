import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);
        int indexItemRefused = 1;
        double valuePerPesson = 7;
        Result result = new Result(bill, indexItemRefused, valuePerPesson);
        result.printRefund();
    }
}


