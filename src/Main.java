import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите выражение: ");
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
            System.out.println(result);
            System.out.println();
        }
    }
}


