import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //  Составить алгоритм: если введенное число больше 7, то вывести “Привет”

        System.out.println("Введите число, если число дробное используте \".\" для разделения ");
        Scanner scanner = new Scanner(System.in);

        double number = scanner.nextDouble();
        if (number > 7)
            System.out.println("Привет");

    }
}
