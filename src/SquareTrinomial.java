import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SquareTrinomial {
    private static double x = 0;
    private static double x1 = 0;
    private static double x2 = 0;
    private static double aa;
    private static double bb;
    private static double cc;
    private static double dd;
    private static boolean noRoots;
    private static boolean oneRoots;
    private static boolean twoRoots;
    private static boolean aEquallyNull;

    public static double getX() {
        return x;
    }

    public static double getX1() {
        return x1;
    }

    public static double getX2() {
        return x2;
    }

    public static boolean getNoRoots() {
        return noRoots;
    }

    public static boolean getOneRoots() {
        return oneRoots;
    }

    public static boolean getTwoRoots() {
        return twoRoots;
    }

    public static boolean getAEquallyNull() {
        return aEquallyNull;
    }

    public SquareTrinomial(double aa, double bb, double cc) {
        this.aa = aa;
        this.bb = bb;
        this.cc = cc;
    }

    public static void main(String[] args) throws IOException {


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String dsd = br.readLine().trim();
//        System.out.println(dsd);
//    scanner();
        decision();
    }

    public static void decision() {
        if (aa == 0) {
//            System.out.println("Число a не может быть равным 0");
            aEquallyNull = true;
        }
        dd = (bb * bb) - (4 * aa * cc);
        if (dd > 0) {
            double ddd  = Math.sqrt(dd);
            x1 = (-bb - ddd) / (2 * aa);
            x2 = (-bb + ddd) / (2 * aa);
//            System.out.println(x1);
//            System.out.println(x2);
            twoRoots = true;
        } else if (dd < 0) {
//            System.out.println("решением являются комплексные числа");
            noRoots = true;
        } else {
            x = -bb / (2 * aa);
//            System.out.println(x);
            oneRoots = true;
        }
    }
//    public static void scanner() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введи число a:");
//        while ((aa = scanner.nextInt()) == 0) {
//            System.out.println("Число a не может быть равным 0");
//            System.out.println("Введи число a:");
//            continue;
//        }
//        System.out.println("Введи число b:");
//        bb = scanner.nextInt();
//        System.out.println("Введи число c:");
//        cc = scanner.nextInt();
//        dd = (bb * bb) - (4 * aa * cc);
//        if (dd > 0) {
//            double ddd  = Math.sqrt(dd);
//            x1 = (-bb - ddd) / (2 * aa);
//            x2 = (-bb + ddd) / (2 * aa);
//            System.out.println(x1);
//            System.out.println(x2);
//        } else if (dd < 0) {
//            System.out.println("решением являются комплексные числа");
//        } else {
//            x = -bb / (2 * aa);
//            System.out.println(x);
//        }
//    }
}
