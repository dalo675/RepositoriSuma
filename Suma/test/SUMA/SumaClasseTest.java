
package SUMA;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danilopez
 */
public class SumaClasseTest {

    SumaClasse checker = new SumaClasse();

    //Test per al metodeSuma
    @Test
    public void testMetodeSuma() {

        int suma = checker.sumar(5, 5);
        assertEquals(10, suma);
    }

    //Test per al metodeGetNum1
    @Test
    public void testGetNum1() {

        int numero = checker.getNum1(5);
        assertEquals(5, numero);
    }

    //Test per al metode sumaValorAbsoluto
    @Test
    public void testsumaValorAbsolut() {

        int suma = checker.sumaValorAbsolut(-2, -3);
        assertEquals(5, suma);
    }
    
}