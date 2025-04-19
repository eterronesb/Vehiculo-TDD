import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehiculoElectricoTest {

    @Test
    void testAcelerarDentroDelLimite() {
        VehiculoElectrico v = new VehiculoElectrico("Xiaomi","SU7", 200);
        v.acelerar(30);
        assertEquals (30, v.getVelocidadActual());
    }
}
