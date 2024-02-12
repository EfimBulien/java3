package org.example;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        boolean repeat = true;
        while (repeat){
            System.out.println("Введите три целых числа:");
            int a = sc.nextInt();
            sc.nextLine();
            int b = sc.nextInt();
            sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();

            System.out.println((a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) ?
                    (a + ", " + b + " и " + c + " являются сторонами прямоугольного треугольника") :
                    (a == b && b == c) ?
                            (a + ", " + b + " и " + c + " являются сторонами равностороннего треугольника") :
                    (a == b || b == c || c == a) ?
                            (a + ", " + b + " и " + c + " являются сторонами равнобедренного треугольника") :
                                    (a + b <= c || b + c <= a || c + a <= b) ?
                                            (a + ", " + b + " и " + c + " не являются сторонами треугольника") :
                                            (a + ", " + b + " и " + c + " являются сторонами обычного треугольника"));

            System.out.println("Желаете выполнить программу еще раз? (1 - да, 0 - нет)");
            int choice = sc.nextInt();
            repeat = (choice == 1);
        }
        sc.close();
    }
}
