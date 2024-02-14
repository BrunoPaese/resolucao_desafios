public class Result {

    /*exemplo "DDUUDDUDUUUD"
    D -> -1 nivel
    U -> +1 nivel*/

    /*                                /\
                         -    -      -  -
                          \  / \    /
                           \/   \/\/                        */


    private int steps;
    private String path;

    public Result(int steps, String path) {
        this.steps = steps;
        this.path = path;
    }

    public Result(String path, int steps) {
        this.path = path;
        this.steps = steps;
    }

    public int contadorVales() {

        int nivel = 0;
        int contaVale = 0;
        boolean abaixoNivel = false;

        for (int i = 0; i < steps; i++) {

            if (Character.toString(path.charAt(i)).equalsIgnoreCase("d")) {
                nivel--;
            } else if (Character.toString(path.charAt(i)).equalsIgnoreCase("u")) {
                nivel++;
            }

            if (nivel < 0 && !abaixoNivel) {
                contaVale++;
                abaixoNivel = true;
            } else if (nivel >= 0) {
                abaixoNivel = false;
            }

        }

        return contaVale;

    }

}


