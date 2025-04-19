public class VehiculoElectrico {
    private String marca;
    private String modelo;
    private int velocidadActual;
    private int velocidadMaxima;
    private int nivelBateria;
    private int autonomiaRestante;

    public VehiculoElectrico(String marca, String modelo, int velocidadActual, int velocidadMaxima, int nivelBateria){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0;
        this.nivelBateria = nivelBateria;
        this.autonomiaRestante = nivelBateria *4;
    }

    public void acelerar(int incremento) {
       if (nivelBateria == 0){
           System.out.println("No se puede acelerar, cargar batería");
           return;
       }

        if (velocidadActual + incremento <= velocidadMaxima){
            velocidadActual +=incremento;
        } else {
            velocidadActual = velocidadActual;
        }
        int consumo = incremento / 10;
        nivelBateria -= consumo;
        if (nivelBateria < 0) {
            nivelBateria = 0;
        }
        actualizarAutonomia();
    }
    public void actualizarAutonomia() {
        autonomiaRestante = nivelBateria * 4;
    }

    public int getVelocidadActual(){
        return velocidadActual;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public int getAutonomiaRestante() {
        return autonomiaRestante;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
