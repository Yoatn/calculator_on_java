import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        while (true) {
            // Ввод значения
            System.out.println("Введите выражение: ");
            Scanner scanner = new Scanner(System.in);
            String inputExpression = scanner.nextLine();

            String[] operators = inputExpression.split("( )");
            System.out.println(operators);
            for (int i = 0; i < operators.length; i++)
                System.out.println(operators[i]);


        }
    }
}
