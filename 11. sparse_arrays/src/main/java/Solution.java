import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("ab");
        strings.add("ab");
        strings.add("abc");

        List<String> query = new ArrayList<>();
        query.add("ab");
        query.add("abc");
        query.add("bc");

        Result result = new Result(strings, query);
        System.out.println(result.contadorIguais());
    }

}


