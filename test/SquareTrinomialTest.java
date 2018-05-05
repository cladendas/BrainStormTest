import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SquareTrinomialTest {

    @Test
    public void noRootsTest() {
        SquareTrinomial st = new SquareTrinomial(1,1,1);
        st.decision();
        assertEquals(true, st.getNoRoots());
        assertEquals(false, st.getOneRoot());
        assertEquals(false, st.getTwoRoots());
    }

    @Test
    public void oneRootTest_1() {
        SquareTrinomial st = new SquareTrinomial(1,2,1);
        st.decision();
        assertEquals(true, st.getOneRoot());
        assertEquals(-1.0, st.getX());
    }

    @Test
    public void oneRootTest_2() {
        SquareTrinomial st = new SquareTrinomial(1,0,0);
        st.decision();
        assertEquals(true, st.getOneRoot());
        assertEquals(0.0, st.getX());
    }

    @Test
    public void oneRootTest_3() {
        SquareTrinomial st = new SquareTrinomial(99,0,0);
        st.decision();
        assertEquals(true, st.getOneRoot());
        assertEquals(0.0, st.getX());
    }

    @Test
    public void oneRootTest_4() {
        SquareTrinomial st = new SquareTrinomial(-99,0,0);
        st.decision();
        assertEquals(true, st.getOneRoot());
        assertEquals(0.0, st.getX());
    }

    @Test
    public void twoRootsTest_1() {
        SquareTrinomial st = new SquareTrinomial(0.5,1,0);
        st.decision();
        assertEquals(true, st.getTwoRoots());
        assertEquals(0.0, st.getX1());
        assertEquals(-2.0, st.getX2());
    }

    @Test
    public void twoRootsTest_2() {
        SquareTrinomial st = new SquareTrinomial(-0.5,1,0);
        st.decision();
        assertEquals(true, st.getTwoRoots());
        assertEquals(0.0, st.getX1());
        assertEquals(2.0, st.getX2());
    }

    @Test
    public void twoRootsTest_3() {
        SquareTrinomial st = new SquareTrinomial(5,-6,-1);
        st.decision();
        assertEquals(true, st.getTwoRoots());
        assertEquals(1.348331477354788, st.getX1());
        assertEquals(-0.14833147735478827, st.getX2());
    }

    @Test
    public void twoRootsTest_4() {
        SquareTrinomial st = new SquareTrinomial(1,2.5,1);
        st.decision();
        assertEquals(true, st.getTwoRoots());
        assertEquals(-0.5, st.getX1());
        assertEquals(-2.0, st.getX2());
    }

    @Test
    public void aEquallyNullTest() {
        SquareTrinomial st = new SquareTrinomial(0,3,4);
        st.decision();
        assertEquals(true, st.getAEquallyNull());
        assertEquals(99999.99, st.getX());
        assertEquals(99999.99, st.getX1());
        assertEquals(99999.99, st.getX2());
    }
}