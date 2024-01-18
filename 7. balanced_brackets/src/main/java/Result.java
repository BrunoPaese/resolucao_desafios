public class Result {

    private String texto;

    public Result(String texto) {
        this.texto = texto;
        excluiTodosPares();
    }

    public int pesquisaCaractere(String conjunto) {
         return texto.indexOf(conjunto);
    }

    public boolean encontrouCaracter(String conjunto) {
        boolean encontrou = false;
        if (pesquisaCaractere(conjunto) != -1) {
            encontrou = true;
        }
        return encontrou;
    }

    public void excluiPares(String conjunto) {
        boolean excluiu = true;
        while (excluiu) {
            if (encontrouCaracter(conjunto)) {
                texto = texto.replace(conjunto, "");
            } else {
                excluiu = false;
            }
        }
    }

    public void excluiTodosPares() {
        excluiPares("()");
        excluiPares("[]");
        excluiPares("{}");
    }

    public void verificaBalanceamento() {
        if (texto.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
