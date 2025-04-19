import org.junit.jupiter.api.Test;

public class VehiculoElectricoTest {

    // TC01: Aumentar velocidad dentro del límite
    @Test
    void acelerar_deberiaIncrementarVelocidad_siHayBateriaYSinExcederLimite() {
        // TODO: implementar test
    }

    // TC02: Acelerar más allá de la velocidad máxima
    @Test
    void acelerar_noDeberiaPasarVelocidadMaxima() {
        // TODO: implementar test
    }

    // TC03: Intentar acelerar sin batería
    @Test
    void acelerar_noDeberiaAumentar_siNivelBateriaEsCero() {
        // TODO: implementar test
    }

    // TC04: Frenar normalmente
    @Test
    void frenar_deberiaReducirVelocidad() {
        // TODO: implementar test
    }

    // TC05: Frenar por debajo de cero
    @Test
    void frenar_noDeberiaIrPorDebajoDeCero() {
        // TODO: implementar test
    }

    // TC06: Parar vehículo
    @Test
    void parar_deberiaEstablecerVelocidadACero() {
        // TODO: implementar test
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
