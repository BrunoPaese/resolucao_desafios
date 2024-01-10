import java.util.ArrayList;
import java.util.List;

public class Result {

    private int tamanho;
    private String termos;

    public Result(int tamanho, String matriz) {
        this.tamanho = tamanho;
        this.termos = matriz;
    }

    public void formataTermos() {
        termos = termos.replace("\n", " ").trim();
    }

    public List<String> transformaTermoEmMatriz() {
        formataTermos();
        return List.of(termos.split(" "));
    }

    public List<Integer> formataMatrizParaInteiro() {
        List<Integer> matrizInteiro = new ArrayList<>();
        for (int i = 0; i < Math.pow(tamanho, 2); i++) {
            matrizInteiro.add(Integer.parseInt(transformaTermoEmMatriz().get(i)));
        }
        return matrizInteiro;
    }

    public int somaDiagonalPrimaria() {
        List<Integer> matriz = formataMatrizParaInteiro();
        int soma = 0;
        int index = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += matriz.get(index);
            index += tamanho + 1;
        }
        return soma;
    }

    public int somaDiagonalSecundaria() {
        List<Integer> matriz = formataMatrizParaInteiro();
        int soma = 0;
        int index = tamanho - 1;
        for (int i = 0; i < tamanho; i++) {
            soma += matriz.get(index);
            index += tamanho - 1;
        }
        return soma;
    }

    public int diferencaAbsolutaEntreDiagonais() {
        return Math.abs(somaDiagonalPrimaria() - somaDiagonalSecundaria());
    }

}
