
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите выражение: ");
            Scanner scanner = new Scanner(System.in);
            String myString = scanner.nextLine();
            String[] inputExpression = myString.split(" ");

            int operand_1;
            int operand_2;
            String operator = inputExpression[1];
            int result = 0;

            // Создание словаря
            Map<String, Integer> romeArabicDict = new HashMap<>();

            //Добавление элементов
            romeArabicDict.put("I", 1);
            romeArabicDict.put("II", 2);
            romeArabicDict.put("III", 3);
            romeArabicDict.put("IV", 4);
            romeArabicDict.put("V", 5);
            romeArabicDict.put("VI", 6);
            romeArabicDict.put("VII", 7);
            romeArabicDict.put("VIII", 8);
            romeArabicDict.put("IX", 9);
            romeArabicDict.put("X", 10);

            //Проверяем на наличе в словаре
            Integer value_1 = romeArabicDict.get(inputExpression[0]);
            Integer value_2 = romeArabicDict.get(inputExpression[2]);

            if (value_1 != null && value_2 != null) {
                operand_1 = romeArabicDict.get(inputExpression[0]);
                operand_2 = romeArabicDict.get(inputExpression[2]);
//                char operator = inputExpression[1].charAt(0);

//                System.out.println(operand_1);
//                System.out.println(operand_2);
//                System.out.println(operator);

//                System.out.println(romeArabicDict.get(inputExpression[0])); //Если ввод есть, то печатае значение по ключу
//                System.out.println(romeArabicDict.get(inputExpression[2]));
            } else {
                operand_1 = Integer.parseInt(inputExpression[0]);
                operand_2 = Integer.parseInt(inputExpression[2]);
//                char operator = inputExpression[1].charAt(0);

//                System.out.println(operand_1);
//                System.out.println(operand_2);
//                System.out.println(operator);

            }
//            System.out.println("Значение 1: " + operand_1);
//            System.out.println("Значение 2: " + operand_2);
//            System.out.println("Знак: " + operator);


            switch (operator) {
                case "+":
                    result = operand_1 + operand_2;
                    break;
                case "-":
                    result = operand_1 - operand_2;
                    break;
                case "*":
                    result = operand_1 * operand_2;
                    break;
                case "/":
                    result = operand_1 / operand_2;
                    break;
            }
            System.out.println("________");
            System.out.println("Результат: " + result);
            System.out.println();


        }
    }

}