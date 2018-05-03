import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SquareTrinomialTest {

    private double xOne;

    @Test
    public void noRoots() {
        SquareTrinomial st = new SquareTrinomial(1,2,3);
        SquareTrinomial.decision();
        assertEquals(true, st.getNoRoots());
    }

    @Test
    public void oneRoots() {
        SquareTrinomial st = new SquareTrinomial(5,0,0);
        SquareTrinomial.decision();
        assertEquals(true, SquareTrinomial.getOneRoots());
    }

    @Test
    public void twoRoots() {
        SquareTrinomial st = new SquareTrinomial(-2,3,0);
        SquareTrinomial.decision();
        assertEquals(true, SquareTrinomial.getTwoRoots());
    }

    @Test
    public void aEquallyNull() {
        SquareTrinomial st = new SquareTrinomial(0,3,4);
        SquareTrinomial.decision();
        assertEquals(true, SquareTrinomial.getAEquallyNull());
    }

    @Test
    public void result() {

    }

    private void assertResult(double a, double b, double c) {
        SquareTrinomial st = new SquareTrinomial(a,b,c);
        SquareTrinomial.decision();
        if (SquareTrinomial.getOneRoots()) {
            assertEquals(xOne, SquareTrinomial.getX());
        }
    }
}
