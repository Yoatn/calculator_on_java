import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Приветствую!\n" +
                "Я Калькулятор.\n" +
                "Я умею складывать, вычитать, делить и умножать числа от 0 до 10.\n" +
                "Числа могут быть, как арабскими, так римскими.\n" +
                "Римские цифры должны иметь вид типа I, VIII, IX и т.п.\n" +
                "Выражение вводится строго по шаблону (без {}):\n" +
                "{число}{пробел}{знак +-*/}{пробел}{число}.\n" +
                "Например: 2 + 4 или III + IX");
        while (true) {
            System.out.println("Введите выражение:");
            Scanner scanner = new Scanner(System.in);
            String myString = scanner.nextLine();

            CorrectInputCheck correctInputString = new CorrectInputCheck();
            boolean resultCheckString = correctInputString.correctInputCheck(myString);

            if (resultCheckString) {
                // Арифметический знак
                String operator = myString.split(" ")[1];

                // Проверяем и изменяем значения с римских на арабские
                Dictionary dictionary = new Dictionary(myString);
                int resulrDictionary_1 = dictionary.getOperand_1();
                int resulrDictionary_2 = dictionary.getOperand_2();


                Calculator calculator = new Calculator();
                int result = calculator.calculate(resulrDictionary_1, resulrDictionary_2, operator);

                // Вывод результата
                System.out.println("________");
                System.out.println("Ваш ответ : " + result);
                System.out.println();
            } else {
                System.out.println("Выражение не соответствует шаблону.\n" +
                        "Повторите ввод.");
                System.out.println();
            }
        }
    }
}


