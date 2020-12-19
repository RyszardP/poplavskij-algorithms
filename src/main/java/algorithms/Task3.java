package algorithms;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел массива:");
        n = scanner.nextInt();
        int a[] = new int[n];
        int count = 0;

        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] % 3 == 1) {
                count++;
            }
        }

        int n2 = 0;

        int a2[] = new int[count];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0) {
                a2[n2] = a[i];
                n2++;
            }
        }

        System.out.println("Числа кратные трем");
        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i]);
        }
    }
}
