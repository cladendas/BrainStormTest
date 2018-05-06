/**
Класс SquareTrinomial взаимодейстует с пользоватлем.
version 1.0
 */

public class SquareTrinomial {
    private static String enterA = "Enter A";
    private static String enterB = "Enter B";
    private static String enterC = "Enter C";

    static Decision decision = new Decision();

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println(enterA);
        decision.setA(input.inputDouble());
        System.out.println(enterB);
        decision.setB(input.inputDouble());
        System.out.println(enterC);
        decision.setC(input.inputDouble());

        decision.decisions();
        presentDecision();
    }

    private static void presentDecision() {
        if (decision.getAEquallyNull()) {
            System.out.println("\"A\" must not be ZERO!");
        } else if (decision.getNoRoots()) {
            System.out.println("The equation has no roots");
        } else if (decision.getOneRoot()) {
            System.out.println("The equation has one root: " + decision.getX());
        } else if (decision.getTwoRoots()) {
            System.out.println("The equation has two roots: " + decision.getX1() + ", " + decision.getX2());
        }
    }
}
