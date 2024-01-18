public class Result {

    private int baseAltura;

    public Result(int baseAltura) {
        this.baseAltura = baseAltura;
    }

    public int quantidadeEspacos(int altura) {
        return baseAltura - altura - 1;
    }

    public int quantidadeSustenidos(int altura) {
        return baseAltura - quantidadeEspacos(altura);
    }

    public String multiplicaCaracteres(int quantidade, String caractere) {
        String linha = "";
        for (int i = 0; i < quantidade; i++) {
            linha = linha + caractere;
        }
        return  linha;
    }

    public String linha(int altura) {
        return multiplicaCaracteres(quantidadeEspacos(altura), " ") + multiplicaCaracteres(quantidadeSustenidos(altura), "#");
    }

    public void imprimeEscada() {
        for (int i = 0; i < baseAltura; i++) {
            System.out.println(linha(i));
        }
    }
}
