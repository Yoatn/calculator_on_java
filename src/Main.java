import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Приветствую!\n" +
                "Я Калькулятор.\n" +
                "Я умею складывать, вычитать, делить и умножать числа от 0 до 10.\n" +
                "Числа могут быть, как арабскими, так римскими.\n" +
                "Римские цифры должны иметь вид типа I, VIII, IX и т.д.\n" +
                "Выражение вводится строго по шаблону (без {}):\n" +
                "{число}{пробел}{знак +-*/}{пробел}{число}.\n" +
                "Например: 2 + 4 или III + IX");
        while (true) {
            System.out.println("Введите выражение:");
            Scanner scanner = new Scanner(System.in);
            String myString = scanner.nextLine();

            //        String myString = "I + III"; // Временный input для тестов
            String operator = myString.split(" ")[1];

            Dictionary dictionary = new Dictionary();
            int[] resulrDictionary = dictionary.dictionary(myString);

            Calculator calculator = new Calculator();
            int result = calculator.calculate(resulrDictionary, operator);


            // Вывод результата
            System.out.println("________");
            System.out.println("Ваш ответ : " + result);
            System.out.println();
        }
    }
}


