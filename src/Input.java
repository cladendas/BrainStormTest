import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);

    protected double inputDouble() {
        while(true) {
            try {

                double valueInt = scanner.nextDouble();

                scanner.nextLine();  // для отчистки буфера от \n

                return valueInt;

            } catch (InputMismatchException e) {
                exceptionMessage();
            }
        }
    }

    private void exceptionMessage() {
        System.out.println("НЕОБХОДИМО ВВЕСТИ ИМЕННО ЦИФРУ");
        scanner.nextLine();  // для отчистки буфера от \n
    }

}
