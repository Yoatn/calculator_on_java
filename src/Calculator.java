/*
План:
1. Ввод чисел и знака +
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
//            Scanner reader = new Scanner(System.in);
//
//            System.out.println("Введите число 1: ");
//            int digitOne = reader.nextInt();
////            System.out.println(digitOne);
//
//            System.out.println("Введите число 2: ");
//            int digitTwo = reader.nextInt();
////            System.out.println(digitTwo);
//
//            System.out.println("Введите знак: ");
//            char operand = reader.next().charAt(0);
////            System.out.println(operand);
            // Считываем выражение
            System.out.println("Введите выражение: ");
            Scanner scanner = new Scanner(System.in);
            String inputExpression = scanner.next();



//            String[] operators = inputExpression.split("[0-9]+"); // Находим цифры
//            String[] operands = inputExpression.split("[+/*-]");  // Находим операнд
//
            String[] operators = inputExpression.split("[0-9]+"); // Находим цифры
            String[] operands = inputExpression.split("[+/*-]");  // Находим операнд

            int agregate = Integer.parseInt(operands[0]);
            for (int i = 1; i < operands.length; i++) {
                if (operators[i].equals("+"))
                    agregate += Integer.parseInt(operands[i]);
                else if (operators[i].equals("*"))
                    agregate *= Integer.parseInt(operands[i]);
                else if (operators[i].equals("/"))
                    agregate /= Integer.parseInt(operands[i]);
                else
                    agregate -= Integer.parseInt(operands[i]);
            }
            System.out.println(agregate);
        }
    }
}

