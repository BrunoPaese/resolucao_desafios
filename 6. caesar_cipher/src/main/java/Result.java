import java.util.ArrayList;
import java.util.List;

public class Result {

    private int tamanhoString;
    private String texto;
    private int rotacao;
    private String alfabeto = "abcdefghijklmnopqrstuvwxyz";
    private List<String> listaLetras = new ArrayList<>();

    public Result(int tamanhoString, String texto, int rotacao) {
        this.tamanhoString = tamanhoString;
        this.texto = texto;
        this.rotacao = rotacao;
        adicionaNaLista();
    }

    public List<String> adicionaNaLista() {
        for (int i = 0; i < alfabeto.length(); i++) {
            listaLetras.add(alfabeto.substring(i, i + 1));
        }
        return listaLetras;
    }

    public int verificaIndexCriptografado(String letra) {
        return listaLetras.indexOf(letra) + rotacao;
    }

    public String converteCriptografia() {
        String letras = "";
        for (int i = 0; i < tamanhoString; i++) {
            if (texto.substring(i, i + 1).equals("-")) {
                letras += "-";
            } else {
                letras += listaLetras.get(verificaIndexCriptografado(texto.substring(i, i + 1)));
            }
        }
        return letras;
    }

    public void imprimeCifra() {
        System.out.println(converteCriptografia());
    }

}
