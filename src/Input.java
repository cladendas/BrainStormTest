import java.util.InputMismatchException;
import java.util.Scanner;

/**
Класс Input для считывания с консоли и обработки введенных пользователем данных.
Метод для считывания с консоли inputDouble() и обработки исключения несоответствия введенных данных.
Метод для логирования исключения exceptionMessage().
 */
public class Input {

    private Scanner scanner = new Scanner(System.in);

    protected double inputDouble() {
        while(true) {
            try {
                double valueDouble = scanner.nextDouble();
//                для отчистки буфера от \n
                scanner.nextLine();
                return valueDouble;

            } catch (InputMismatchException e) {
                exceptionMessage();
            }
        }
    }

    private void exceptionMessage() {
//        Реализовать логирование вместо вывода в консоль
        System.out.println("ENTER THE NUMBER!!!");
//        для отчистки буфера от \n
        scanner.nextLine();
    }
}