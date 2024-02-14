import java.util.List;

public class Result {

    private List<Integer> ar;

    public Result(List<Integer> ar) {
        this.ar = ar;
    }

    public int contarParMeia() {

        int contadorMeia = 0;

        while (ar.size() > 0) {

            for (int i = 1; i < ar.size(); i++) {

                if (ar.get(0) == ar.get(i)) {
                    contadorMeia++;
                    ar.remove(i);
                    break;
                }
            }

            ar.remove(0);

        }

        return contadorMeia;

    }

}


