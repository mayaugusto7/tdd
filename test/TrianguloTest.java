import cap04.triangulos.TipoTriangulo;
import cap04.triangulos.Triangulo;
import cap04.triangulos.TrianguloService;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrianguloTest {


    @Test
    public void deveVerificarSeETriangulo() {

        TrianguloService service = new TrianguloService();
        Triangulo isoceles = new Triangulo(0,2, 3);
        String valido =  service.validarTriangulo(isoceles);

        assertEquals("Nao e triangulo", valido);
    }

    @Test
    public void deveVerificarSeTrianguloEquilatero() {

        TrianguloService service = new TrianguloService();
        Triangulo equilatero = new Triangulo(2,2, 2);
        String equ =  service.validarTriangulo(equilatero);

        assertEquals(TipoTriangulo.EQUILATERO.name(), equ);
    }


    @Test
    public void deveVerificarSeTrianguloIsoceles() {

        TrianguloService service = new TrianguloService();
        Triangulo isoceles = new Triangulo(2,2, 3);
        String iso =  service.validarTriangulo(isoceles);

        assertEquals(TipoTriangulo.ISOCELES.name(), iso);
    }

    @Test
    public void deveVerificarSeTrianguloEscaleno() {

        TrianguloService service = new TrianguloService();
        Triangulo escaleno = new Triangulo(5,3, 4);
        String esc =  service.validarTriangulo(escaleno);

        assertEquals(TipoTriangulo.ESCALENO.name(), esc);
    }

}
