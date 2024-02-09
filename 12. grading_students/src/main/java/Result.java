import java.util.ArrayList;
import java.util.List;

public class Result {

     /*abaixo de 40 nao arredonda, abaixo da media
    se diferenca do multiplo de 5 for igual a 3 nao arredonda
    se diferenca do multiplo de 5 e menor que 3 arredonda para multiplo*/

    public List<Integer> calculaNotas(List<Integer> grades) {

        int diferenca = 0;
        int multiplos_cinco = 0;
        int notaFinal = 0;
        List<Integer> notas = new ArrayList<>();
        boolean aplicaArredondamento = false;

        for (int i = 0; i < grades.size(); i++) {

            if (grades.get(i) < 38) {
                aplicaArredondamento = true;
                notaFinal = grades.get(i);
            }

            while (!aplicaArredondamento) {

                multiplos_cinco += 5;

                if (multiplos_cinco > grades.get(i)) {

                    aplicaArredondamento = true;
                    diferenca = multiplos_cinco - grades.get(i);

                    if (diferenca < 3) {
                        notaFinal = multiplos_cinco;
                    } else if (diferenca >= 3) {
                        notaFinal = grades.get(i);
                    }

                }

            }

            notas.add(notaFinal);

            multiplos_cinco = 0;
            aplicaArredondamento = false;

        }

        return notas;

    }

}


