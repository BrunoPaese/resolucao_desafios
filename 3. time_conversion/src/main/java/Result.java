public class Result {

    private String hora;
    private String horaConvertida;

    public Result(String hora) {
        this.hora = hora;
        capturaHorario();
    }

    public void capturaHorario() {
        if (hora.endsWith("AM")) {
            horaConvertida = hora.substring(0, hora.length() - 2);
        } else {
            horaConvertida = converteHorario() + hora.substring(2, hora.length() - 2) ;
        }
    }

    private String converteHorario() {
        int horario = 0;
        if (hora.startsWith("0")) {
            horario = Integer.parseInt(String.valueOf(hora.charAt(1)));
        } else {
            horario = Integer.parseInt(hora.substring(0, 2));
        }
        int conversao = horario + 12;
        return String.valueOf(conversao);
    }

    public String getHoraConvertida() {
        return horaConvertida;
    }
}
