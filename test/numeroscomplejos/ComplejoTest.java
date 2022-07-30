package numeroscomplejos;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ComplejoTest {

    private Complejo cReal1, cImaginario1, cReal2, cImaginario2;
    private List<Complejo> cResultado;

    public ComplejoTest() {
    }

    @Before
    public void inicializar() {
        //definir entradas
        cReal1 = new Complejo(2, 0);
        cReal2 = new Complejo(3, 0);

        cImaginario1 = new Complejo(0, -5);
        cImaginario2 = new Complejo(0, 2);

        //definir las salidas
        cResultado = new ArrayList<>();
        cResultado.add(new Complejo(5, 0));
        cResultado.add(new Complejo(0, -3));
        cResultado.add(new Complejo(2, -5));
    }

    @After
    public void finalizar() {
        cReal1 = null;
        cReal2 = null;
        cImaginario1 = null;
        cImaginario2 = null;
        cResultado = null;
    }

    /**
     * Test of sumar method, of class Complejo.
     */
    @Test
    public void pruebaSumarReales() {
        System.out.println("sumar dos numeros reales");

        Complejo result = cReal1.sumar(cReal2);

        assertEquals(cResultado.get(0), result);
    }

    @Test
    public void pruebaSumarImaginarios() {
        System.out.println("sumar dos numeros imaginarios");
        Complejo result = cImaginario1.sumar(cImaginario2);

        assertEquals(cResultado.get(1), result);
    }
    
    @Test
    public void pruebaSumarRealImaginario() {
        System.out.println("sumar un real con un imaginario");
        Complejo result = cReal1.sumar(cImaginario1);

        assertEquals(cResultado.get(2), result);
    }

    /**
     * Test of toString method, of class Complejo.
     */
    /*
     @Test
     public void testToString() {
     System.out.println("toString");
     Complejo instance = null;
     String expResult = "";
     String result = instance.toString();
     assertEquals(expResult, result);
     // TODO review the generated test code and remove the default call to fail.
     fail("The test case is a prototype.");
     }
     */
}
