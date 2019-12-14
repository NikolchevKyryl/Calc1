import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class CalculatorEngineTest2 {

    CalculatorEngine calcEngine = new CalculatorEngine();

    @Before
    public void runBeforeEveryTest() {
        calcEngine.currentTotal = 0;
    }

    @Test
    public void testEqual() throws Exception {
        calcEngine.equal("20");
        assertEquals(calcEngine.currentTotal, 20.0);
    }

    @Test
    public void testAdd() throws Exception {
        calcEngine.add(20);
        assertEquals(calcEngine.currentTotal, 20.0);

    }

    @Test
    public void testSubtract() throws Exception {
        calcEngine.subtract(20);
        assertEquals(calcEngine.currentTotal, -20.0);
    }

    @Test
    public void testMultiplyZero() throws Exception {
        calcEngine.multiply(10);
        assertEquals(calcEngine.currentTotal, 0.0);
    }

    @Test
    public void testDivideZero() throws Exception {
        calcEngine.divide(10);
        assertEquals(calcEngine.currentTotal, 0.0);
    }

    @Test
    public void testMultiply() throws Exception {
        calcEngine.add(20);
        calcEngine.multiply(10);
        assertEquals(calcEngine.currentTotal, 200.0);
    }

    @Test
    public void testDivide() throws Exception {
        calcEngine.add(10);
        calcEngine.divide(10);
        assertEquals(calcEngine.currentTotal, 1.0);
    }

    @Test(timeout=1000)
    public void testInfiniteTametakingLoop() throws InterruptedException {
            while(true)
            {
                Thread.currentThread().sleep(500);
            }
        }
}