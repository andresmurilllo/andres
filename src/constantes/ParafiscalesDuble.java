package constantes;

public enum ParafiscalesDuble {
    CERO_PUNTO_DOS(0.04),
    CERO_PUNTO_TRES(0.04),
    CERO_PUNTO_CUATRO(0.04),
    CERO_PUNTO_CINCO(0.04);
private double descuento;
    ParafiscalesDuble(double v) {
        this.descuento= v;
    }

    public double getDescuento() {
        return descuento;
    }
}
