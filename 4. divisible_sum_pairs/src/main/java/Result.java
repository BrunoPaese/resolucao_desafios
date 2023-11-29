import java.util.ArrayList;
import java.util.List;

public class Result {

    private int k;
    private int n;
    private List<Integer> ar = new ArrayList<>();
    private int paresValidos;

    public Result(String inputDivisor, String inputArray) {
        converteEmInteiro(inputDivisor);
        converteEmList(inputArray);
        setN();
        setParesValidos();;
    }

    private void converteEmInteiro(String inputDivisor) {
        k = Integer.parseInt(String.valueOf(
                inputDivisor.replaceAll(" ", "").charAt(1)));
    }

    public void converteEmList(String input) {
        String sequencia = input.replaceAll(" ", "");
        for (int i = 0; i < sequencia.length(); i++) {
            int numero = Integer.valueOf(sequencia.substring(i, i+1));
            ar.add(numero);
        }
    }

    public void setN() {
        n = ar.size();
    }

    public void setParesValidos() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0 && i < j) {
                    paresValidos++;
                }
            }
        }
    }

    public int getParesValidos() {
        return paresValidos;
    }
}
