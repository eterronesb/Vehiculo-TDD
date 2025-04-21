public class VehiculoElectrico {
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    private int velocidadActual;
    private int nivelBateria;
    private int autonomiaRestante;


    public VehiculoElectrico(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0;
        this.nivelBateria = 100;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public int getAutonomiaRestante() {
        return autonomiaRestante;
    }

    public void recargarBateria() {
        nivelBateria = 100;
        autonomiaRestante = nivelBateria * 4; // 4 km por 1%
    }

    public void acelerar(int incremento) {
        if (nivelBateria > 0 && velocidadActual + incremento <= velocidadMaxima) {
            velocidadActual += incremento;
        }
    }
    public void frenar(int decremento) {
        velocidadActual -= decremento;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }
    public void parar() {
        velocidadActual = 0;
    }
    public boolean esDeportivo() {
        return velocidadMaxima > 180;
    }


}
