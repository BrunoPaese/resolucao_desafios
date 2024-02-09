import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(73);
        arr.add(67);
        arr.add(38);
        arr.add(33);

        Result result = new Result();

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(result.calculaNotas(arr).get(i));
        }

    }

}


