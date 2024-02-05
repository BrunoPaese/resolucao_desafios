import java.util.ArrayList;
import java.util.List;

public class Result {

    private List<String> strings = new ArrayList<>();
    private List<String> query = new ArrayList<>();

    public Result(List<String> strings, List<String> query) {
        this.strings = strings;
        this.query = query;
    }

    public int contadorIguais() {
        int contadorIguais = 0;
        for (int i = 0; i < query.size(); i++) {
            for (int j = 0; j < strings.size(); j++) {
                if (query.get(i).equalsIgnoreCase(strings.get(j))) {
                    contadorIguais++;
                }
            }
        }
        return contadorIguais;
    }
}

