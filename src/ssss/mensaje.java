package ssss;

public enum mensaje {

    NOMBRE_MENSAJE("INGRECE SU NOMBRE");

private String mensaje;
    mensaje(String s) {this.mensaje =s;}

    public String getMensaje() {
        return mensaje;
    }
}

