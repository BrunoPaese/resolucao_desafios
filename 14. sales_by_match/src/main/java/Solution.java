import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        List<Integer> ar = new ArrayList<>();
        ar.add(10);
        ar.add(20);
        ar.add(20);
        ar.add(10);
        ar.add(10);
        ar.add(30);
        ar.add(50);
        ar.add(10);
        ar.add(20);

        Result result = new Result(ar);

        System.out.println(result.contarParMeia());

    }

}
