package constantes;

public enum ParafiscalesString {

    SOLICITUD_NOMBRE("Indresa el nombre del empleado"),
    SOLICITUD_SALARIO("Indresa el salrio del empleado"),
    MENSAGE_EMPLEADO("Enpleado"),
    MENSAGE_SALARIO("Su salario base es "),
    MENSAGE_PENCIO("Su descuento de pencion es"),
    MENSAGE_SALUD("Su descuento de salud es"),
    MENSAGE_TOTAL("Su salario final es");



    private String mensage;
    ParafiscalesString(String s) {
        this.mensage = s;
    }

    public String getMensage() {
        return mensage;
    }
}
