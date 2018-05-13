/**
Класс Decision для решения уравнения с использованием полученных данных.
Метод void decisions() проверяет на ноль коэфициент a (boolean aEqualNull), вычисляет дискриминант double discriminant,
затем на основе него возвращает решение:
нет корней (boolean noRoots), один корень (boolean oneRoots, double x),
два корня (boolean twoRoots, double x1, double x2).
Для переменных a, b, c есть сеттеры.
Для решений уравнения есть геттеры.
Метод double realZero(double number) необходим для решения ситуации с различным представлением 0.0 и -0.0.
 */
public class Decision {
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

    protected String decisions() {
        double discriminant = -1;
        if (a == 0) {
            aEqualNull = true;
            return "\"A\" must not be ZERO!";
        } else {
            discriminant = Math.pow(b, 2) - (4 * a * c);
        }
        if (discriminant > 0) {
            double squareOfDiscr = Math.sqrt(discriminant);
            x1 = realZero((-b + squareOfDiscr) / (2 * a));
            x2 = realZero((-b - squareOfDiscr) / (2 * a));
            twoRoots = true;
            return "x1 = " + x1 + "; " + "x2 = " + x2;
        } else if (discriminant < 0) {
            noRoots = true;
            return "The equation has no roots";
        } else {
            x = realZero(-b / (2 * a));
            oneRoots = true;
            return "x = " + x;
        }
    }

    /*
    Данный метод необходим для решения ситуации с различным представлением 0.0 и -0.0,
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

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

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
}