
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test_2 {
    public static void main(String[] args) {
//        System.out.println("Введите выражение: ");
//        Scanner scanner = new Scanner(System.in);
//        String myString = scanner.nextLine();
        String myString = "I + II"; // Временный input
//        String[] inputExpression = myString.split(" ");


//        String operator = inputExpression[1];
        Dictionary resulrDictionary = new Dictionary();

        System.out.println(Arrays.toString(resulrDictionary.dictionary(myString)));

    }
}



// Калькулятор
//class Calculator {
//    public int calculator() {
//
//        int result = 0;
//        int value_1 = 0;
//        int value_2 = 0;
//
//        switch (operator) {
//            case "+":
//                result = value_1 + value_2;
//                break;
//            case "-":
//                result = value_1 - value_2;
//                break;
//            case "*":
//                result = value_1 * value_2;
//                break;
//            case "/":
//                result = value_1 / value_2;
//                break;
//
//
//        }
//        // Вывод результата
//        System.out.println("________");
//        System.out.println("Результат: " + result);
//        System.out.println(Calculator.class);
//
//        return result;
//    }
//
//        }
//
//
//    }
//
//}