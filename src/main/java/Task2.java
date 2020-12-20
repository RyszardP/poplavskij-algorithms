import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет,
        // то вывести "Нет такого имени"
        String template = "Вячеслав";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scanner.nextLine();
        if (name.equals(template)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

    }
}
