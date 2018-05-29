import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DecisionTest {

    @Test
    public void noRootsTest() {
        Decision decision = new Decision();
        decision.setA(1);
        decision.setB(1);
        decision.setC(1);
        decision.decisions();
        assertEquals(true, decision.getNoRoots());
        assertEquals(false, decision.getOneRoot());
        assertEquals(false, decision.getTwoRoots());
    }

    @Test
    public void oneRootTest_1() {
        Decision decision = new Decision();
        decision.setA(1);
        decision.setB(2);
        decision.setC(1);
        decision.decisions();
        assertEquals(true, decision.getOneRoot());
        assertEquals(-1.0, decision.getX());
    }

    @Test
    public void oneRootTest_2() {
        Decision decision = new Decision();
        decision.setA(1);
        decision.setB(0);
        decision.setC(0);
        decision.decisions();
        assertEquals(true, decision.getOneRoot());
        assertEquals(0.0, decision.getX());
    }

    @Test
    public void oneRootTest_3() {
        Decision decision = new Decision();
        decision.setA(99);
        decision.setB(0);
        decision.setC(0);
        decision.decisions();
        assertEquals(true, decision.getOneRoot());
        assertEquals(0.0, decision.getX());
    }

    @Test
    public void oneRootTest_4() {
        Decision decision = new Decision();
        decision.setA(-99);
        decision.setB(0);
        decision.setC(0);
        decision.decisions();
        assertEquals(true, decision.getOneRoot());
        assertEquals(0.0, decision.getX());
    }

    @Test
    public void twoRootsTest_1() {
        Decision decision = new Decision();
        decision.setA(0.5);
        decision.setB(1);
        decision.setC(0);
        decision.decisions();
        assertEquals(true, decision.getTwoRoots());
        assertEquals(0.0, decision.getX1());
        assertEquals(-2.0, decision.getX2());
    }

    @Test
    public void twoRootsTest_2() {
        Decision decision = new Decision();
        decision.setA(-0.5);
        decision.setB(1);
        decision.setC(0);
        decision.decisions();
        assertEquals(true, decision.getTwoRoots());
        assertEquals(0.0, decision.getX1());
        assertEquals(2.0, decision.getX2());
    }

    @Test
    public void twoRootsTest_3() {
        Decision decision = new Decision();
        decision.setA(5);
        decision.setB(-6);
        decision.setC(-1);
        decision.decisions();
        assertEquals(true, decision.getTwoRoots());
        assertEquals(1.348331477354788, decision.getX1());
        assertEquals(-0.14833147735478827, decision.getX2());
    }

    @Test
    public void twoRootsTest_4() {
        Decision decision = new Decision();
        decision.setA(1);
        decision.setB(2.5);
        decision.setC(1);
        decision.decisions();
        assertEquals(true, decision.getTwoRoots());
        assertEquals(-0.5, decision.getX1());
        assertEquals(-2.0, decision.getX2());
    }

    @Test
    public void aEquallyNullTest() {
        Decision decision = new Decision();
        decision.setA(0);
        decision.setB(3);
        decision.setC(4);
        decision.decisions();
        assertEquals(true, decision.getAEquallyNull());
        assertEquals(99999.99, decision.getX());
        assertEquals(99999.99, decision.getX1());
        assertEquals(99999.99, decision.getX2());
    }
}