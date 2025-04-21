import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehiculoElectricoTest {

    // TC01: Aumentar velocidad dentro del límite
    @Test
    void acelerar_deberiaIncrementarVelocidad_siHayBateriaYSinExcederLimite() {

        VehiculoElectrico v = new VehiculoElectrico("Xiaomi", "SU7", 180);
        v.setVelocidadActual(50);
        v.setNivelBateria(100);
        v.acelerar(20);
        assertEquals(70, v.getVelocidadActual());
    }

    // TC02: Acelerar más allá de la velocidad máxima
    @Test
    void acelerar_noDeberiaPasarVelocidadMaxima() {
        VehiculoElectrico v = new VehiculoElectrico("Xiaomi", "SU7", 180);
        v.setVelocidadActual(160);
        v.setNivelBateria(100);
        v.acelerar(50);
        assertEquals(160, v.getVelocidadActual());
    }

    // TC03: Intentar acelerar sin batería
    @Test
    void acelerar_noDeberiaAumentar_siNivelBateriaEsCero() {
        VehiculoElectrico v = new VehiculoElectrico("Xiaomi", "SU7", 180);
        v.setVelocidadActual(60);
        v.setNivelBateria(0);
        v.acelerar(30); // Sin batería, no debe acelerar
        assertEquals(60, v.getVelocidadActual()); // Velocidad se mantiene
    }

    // TC04: Frenar normalmente
    @Test
    void frenar_deberiaReducirVelocidad() {
        VehiculoElectrico v = new VehiculoElectrico("Xiaomi", "SU7", 180);
        v.setVelocidadActual(80);
        v.frenar(20);
        assertEquals(60, v.getVelocidadActual());
    }

    // TC05: Frenar por debajo de cero
    @Test
    void frenar_noDeberiaIrPorDebajoDeCero() {
        VehiculoElectrico v = new VehiculoElectrico("Xiaomi", "SU7", 180);
        v.setVelocidadActual(10);
        v.frenar(30); // 10 - 30 = -20 → debería quedar en 0
        assertEquals(0, v.getVelocidadActual());
    }

    // TC06: Parar vehículo
    @Test
    void parar_deberiaEstablecerVelocidadACero() {
        VehiculoElectrico v = new VehiculoElectrico("Xiaomi", "SU7", 180);
        v.setVelocidadActual(100);
        v.parar();
        assertEquals(0, v.getVelocidadActual());
    }


    // TC07: Recargar batería al 100%
    @Test
    void recargarBateria_deberiaLlenarBateriaYActualizarAutonomia() {
        // TODO: implementar test
    }

    // TC08: Vehículo deportivo (vel. máx. > 180)
    @Test
    void esDeportivo_deberiaRetornarTrue_siVelocidadMaximaMayorA180() {
        // TODO: implementar test
    }

    // TC09: Vehículo no deportivo (vel. máx. <= 180)
    @Test
    void esDeportivo_deberiaRetornarFalse_siVelocidadMaximaMenorOIgualA180() {
        // TODO: implementar test
    }

    // TC10: Consumir batería y autonomía normalmente
    @Test
    void consumirBateria_deberiaReducirBateriaYAutonomia() {
        // TODO: implementar test
    }

    // TC11: No permitir batería o autonomía negativa
    @Test
    void consumirBateria_noDeberiaIrPorDebajoDeCero() {
        // TODO: implementar test
    }
}
