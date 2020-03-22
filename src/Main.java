import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String exitIn;
        String exit = "exit";

        System.out.println("Приветствую!\n" +
                "Я Калькулятор.\n" +
                "Я умею складывать, вычитать, делить и умножать числа от 0 до 10.\n" +
                "Числа могут быть, как арабскими, так римскими.\n" +
                "Римские цифры должны иметь вид типа I, VIII, IX и т.п.\n" +
                "Выражение вводится строго по шаблону (без {}):\n" +
                "{число}{пробел}{знак +-*/}{пробел}{число}.\n" +
                "Например: 2 + 4 или III + IX\n" +
                "Для выхода наберите exit");

        do {
            System.out.println("Введите выражение:");
            Scanner scanner = new Scanner(System.in);
            String myString = scanner.nextLine();
            exitIn = myString;

            CorrectInputCheck correctInputString = new CorrectInputCheck();
            boolean resultCheckString = correctInputString.correctInputCheck(myString);

            if (resultCheckString) {
                // Арифметический знак
                String operator = myString.split(" ")[1];

                // Проверяем и изменяем значения с римских на арабские
                Dictionary dictionary = new Dictionary(myString);
                int resultDictionary_1 = dictionary.getOperand_1();
                int resultDictionary_2 = dictionary.getOperand_2();


                Calculator calculator = new Calculator();
                int result = calculator.calculate(resultDictionary_1, resultDictionary_2, operator);

                // результат проверки арабские или римские
                boolean statusRome = dictionary.getStatusRome();

                if (statusRome) { // Вывод результата если римские
                    new ArabicToRome(result);

                } else { // Вывод результата если арабские
                    System.out.println("________");
                    System.out.println("Ваш ответ: " + result);
                }
            } else {
                System.out.println("Выражение не соответствует шаблону.\n" +
                        "Повторите ввод.");
                System.out.println();
            }

        // Выход из бесконечного цикла
        } while (!exit.equals(exitIn));
        System.out.println("До свидания!");
    }

}


