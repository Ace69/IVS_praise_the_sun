

package MathLib;
import Lib.MathLib;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Tomas Sverak (xsvera04)
 * @date 7.4. 2018
 * @version 1.0
 * @brief Testy predepsane pro matematicka knihovnu.
 */
public class MathLibTest {

    /**
     * @brief Test scitani dvou cisel.
     */
    @Test
    public void testScitani() {
        assertEquals(MathLib.scitani(0, 0), 0, 0.000001);
        assertEquals(MathLib.scitani(-5, 3), -2, 0.000001);
        assertEquals(MathLib.scitani(125, -700), -575, 0.000001);
        assertEquals(MathLib.scitani(-500000000, -900000000), -1400000000, 0.000001);
        assertEquals(MathLib.scitani(900000000, 1000000000), 1900000000, 0.000001);
        assertEquals(MathLib.scitani(0.987654, -0.123456), 0.864198, 0.000001);
        
        assertNotEquals(MathLib.scitani(0, 0), 1, 0.000001);
        assertNotEquals(MathLib.scitani(-90000, -12500), -65500, 0.000001);
        assertNotEquals(MathLib.scitani(-800000, 2500000), 3300000, 0.000001);
        assertEquals(MathLib.scitani(0.558654, -0.781236), -0.222583, 0.000001);
    }

    /**
     * @brief Test odcitani dvou cisel.
     */
    @Test
    public void testOdecitani() {
        assertEquals(MathLib.odcitani(0, 0), 0, 0.000001);
        assertEquals(MathLib.odcitani(-10, 2), -12, 0.000001);
        assertEquals(MathLib.odcitani(200, -500), 700, 0.000001);
        assertEquals(MathLib.odcitani(-1000000000, -1100000000), 100000000, 0.000001);
        assertEquals(MathLib.odcitani(900000000, 1800000000), -900000000, 0.000001);
        assertEquals(MathLib.odcitani(0.123456, -0.123456), 0.246912, 0.000001);
        
        assertNotEquals(MathLib.odcitani(0, 0), 1, 0.000001);
        assertNotEquals(MathLib.odcitani(-50000, -12500), -65500, 0.000001);
        assertNotEquals(MathLib.odcitani(-800000, 120000), 920000, 0.000001);
        assertNotEquals(MathLib.odcitani(-0.12987, 0.12621), -0.25607, 0.000001);
    }

    /**
     * @brief Test nasobeni dvou cisel.
     */
    @Test
    public void testNasobeni() {
        assertEquals(MathLib.nasobeni(0, 0), 0, 0.000001);
        assertEquals(MathLib.nasobeni(-10, 200), -2000, 0.000001);
        assertEquals(MathLib.nasobeni(298, 123987), 36948126, 0.000001);
        assertEquals(MathLib.nasobeni(-1000000000, 0.1000000), -100000000, 0.000001);
        assertEquals(MathLib.nasobeni(128, -322), -41216, 0.000001);
        
        assertNotEquals(MathLib.nasobeni(0, 0), 1, 0.000001);
        assertNotEquals(MathLib.nasobeni(-10000, -12500), -65500, 0.000001);
        assertNotEquals(MathLib.nasobeni(0.1987, 0.96123), 0.19099000, 0.000001);
        assertNotEquals(MathLib.nasobeni(-0.125, 120000), 150000, 0.000001);
    }

    /**
     * @brief Test deleni dvou cisel.
     */
    @Test
    public void testDeleni() {
        assertEquals(MathLib.deleni(0, 1), 0, 0.000001);
        assertEquals(MathLib.deleni(-10, 300), -0.0333333, 0.000001);
        assertEquals(MathLib.deleni(2048, -64), -32, 0.000001);
        assertEquals(MathLib.deleni(-95000000, 0.125), -760000000, 0.000001);
        assertEquals(MathLib.deleni(0.120045, -0.25), -0.48018, 0.000001);
        
        assertNotEquals(MathLib.deleni(25, 2), 12.4, 0.000001);
        assertNotEquals(MathLib.deleni(-10000, -12500), -65500, 0.000001);
        assertNotEquals(MathLib.deleni(0.555, 1.55), 0.3507, 0.000001);
        assertNotEquals(MathLib.deleni(-0.125, -0.125), 0.9, 0.000001);
    }
    
    /**
     * @brief Test na deleni nulou
     */
    @Test (expected = ArithmeticException.class)
    public void testDeleniNulou() {
        MathLib.deleni(1, 0);
    }

    /**
     * @brief Test faktorialu.
     */
    @Test
    public void testFaktorial() {
        assertEquals(MathLib.faktorial(0), 1, 0);
        assertEquals(MathLib.faktorial(1), 1, 0);
        assertEquals(MathLib.faktorial(5), 120, 0);
        
        assertNotEquals(MathLib.faktorial(9), 362881, 0);
        assertNotEquals(MathLib.faktorial(3), 5, 0);
    }
    
    /**
     * @brief Test zaporneho faktorialu.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testZapornyFaktorial() {
        MathLib.faktorial(-1);
    }
    
    /**
     * @brief Test zakladu umocneneho na exponent.
     */
    @Test
    public void testMocnina() {
        assertEquals(MathLib.mocnina(0,1), 0, 0.000001);
        assertEquals(MathLib.mocnina(2,1), 2, 0.000001);
        assertEquals(MathLib.mocnina(5,10), 9765625, 0.000001);
        assertEquals(MathLib.mocnina(0.125,3), 0.001953125, 0.000001);
        assertEquals(MathLib.mocnina(-20,5), -3200000, 0.000001);
        
        assertNotEquals(MathLib.mocnina(-10,2), -100, 0.000001);
        assertNotEquals(MathLib.mocnina(0.99,7), 0.932000, 0.000001);
    }
    
    /**
     * @brief Test pokud exponent neni prirozene cislo.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testNeprirozenaMocnina1() {
        MathLib.mocnina(1, 0);
    }
    /**
     * @brief Druhy test pokud exponent neni prirozene cislo.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testNeprirozenaMocnina2() {
        MathLib.mocnina(1, -1);
    }
    
    /**
     * @brief Test zakladu umocneneho na exponent.
     */
    @Test
    public void testOdmocnina() {
        assertEquals(MathLib.odmocnina(4,2), 2, 0.000001);
        assertEquals(MathLib.odmocnina(16,4), 2, 0.000001);
        assertEquals(MathLib.odmocnina(125,1000), 1.0048399888, 0.000001);

        assertNotEquals(MathLib.odmocnina(27,3), 4, 0.000001);
    }
    
    /**
     * @brief Test zaporneho zakladu odmocniny.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testZapornyZakladOdmocniny() {
        MathLib.odmocnina(-1, 2);
    }
    
    /**
     * @brief Test nulte odmocniny ze zakladu.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testNultaOdmocnina() {
        MathLib.odmocnina(2, 0);
    }

    /**
     * @brief Test mudulo.
     */
    @Test
    public void testModulo() {
        assertEquals(MathLib.modulo(1,2), 1, 0.000001);
        assertEquals(MathLib.modulo(12,4), 0, 0.000001);
        assertEquals(MathLib.modulo(-50,15), -5, 0.000001);
        assertEquals(MathLib.modulo(-63123,1523), -680, 0.000001);
        assertEquals(MathLib.modulo(-123,-5.01), -2.760, 0.000001);
        
        assertNotEquals(MathLib.modulo(27,3), -4, 0.000001);
        assertNotEquals(MathLib.modulo(100000, 50), 1.2589254, 0.000001);
    }
    

    /**
     * @brief Test modulo nulou.
     */
    @Test (expected = ArithmeticException.class)
    public void testModuloNulou() {
        MathLib.modulo(1, 0);
    }   
}
