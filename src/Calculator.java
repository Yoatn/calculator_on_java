/*
План:
1. Ввод чисел и знака
2. Ввод из одной строки
3. Ввод римских цифр
4. Постоянный ввод
5. Обработка исключений:
    a. Неверный шаблон ввода (Количество, пробелы, символы) ...may be RegEx?
    b. Пустой ввод
    c.
    d.
    e.
    g.
6.
 */


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while (true) {
            Scanner reader = new Scanner(System.in);

            System.out.println("Введите число 1: ");
            int digitOne = reader.nextInt();
//            System.out.println(digitOne);

            System.out.println("Введите число 2: ");
            int digitTwo = reader.nextInt();
//            System.out.println(digitTwo);

            System.out.println("Введите знак: ");
            char operand = reader.next().charAt(0);
//            System.out.println(operand);
        }
    }
}

