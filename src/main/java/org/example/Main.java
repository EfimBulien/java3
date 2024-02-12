package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра класса
        Scanner sc = new Scanner(System.in);
        // Переменная для выхода из цикла и повторения
        boolean repeat = true;
        // Цикл с повторением выполенения программы
        while (repeat){
            System.out.println("Введите три целых числа:");
            // Запись в переменную стороны а
            int a = sc.nextInt();
            sc.nextLine();
            // Запись в переменную стороны b
            int b = sc.nextInt();
            sc.nextLine();
            // Запись в переменную стороны c
            int c = sc.nextInt();
            sc.nextLine();
            // Тернарное выражение в println
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
            //Выбор по работе программы
            int choice = sc.nextInt();
            //Условие выбора (сравнение с единицей)
            repeat = (choice == 1);
        }
        //Закрытие сканера
        sc.close();
    }
}
