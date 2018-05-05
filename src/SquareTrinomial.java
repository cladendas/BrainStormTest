public class SquareTrinomial {
    private double x = 99999.99;
    private double x1 = 99999.99;
    private double x2 = 99999.99;
    private double a;
    private double b;
    private double c;
    private boolean noRoots;
    private boolean oneRoots;
    private boolean twoRoots;
    private boolean aEqualNull;

    public double getX() {
        return x;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public boolean getNoRoots() {
        return noRoots;
    }

    public boolean getOneRoot() {
        return oneRoots;
    }

    public boolean getTwoRoots() {
        return twoRoots;
    }

    public boolean getAEquallyNull() {
        return aEqualNull;
    }

    public SquareTrinomial(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public SquareTrinomial() {}

    public static void main(String[] args) {
        SquareTrinomial st = new SquareTrinomial();
        st.decision();
    }

    public void decision() {
        double discriminant = -1;
        if (a == 0) {
            aEqualNull = true;
        } else {
            discriminant = Math.pow(b, 2) - (4 * a * c);
        }
        if (discriminant > 0) {
            double squareOfDiscr = Math.sqrt(discriminant);
            x1 = realZero((-b + squareOfDiscr) / (2 * a));
            x2 = realZero((-b - squareOfDiscr) / (2 * a));
            twoRoots = true;
        } else if (discriminant < 0) {
            noRoots = true;
        } else {
            x = realZero(-b / (2 * a));
            oneRoots = true;
        }
    }

    /*
    данный метод необходим для решения ситуации с различным представлением 0.0 и -0.0,
    также данную ситуацю можно было бы решить с помощью побитового сравнения,
    используюя метод long Double.doubleToLongBits(double),
    но в данной задаче мне это кажется нецелесообразным
     */
    private double realZero(double number) {
        if (number == -0.0) {
            return 0.0;
        }
        return number;
    }
}
