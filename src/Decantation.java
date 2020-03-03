import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Decantation {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите выражение: ");
            Scanner scanner = new Scanner(System.in);
            String myString = scanner.nextLine();
            String[] myCharArray = myString.split(" ");

            int operand_1 = Integer.parseInt(myCharArray[0]);
            int operand_2 = Integer.parseInt(myCharArray[2]);
            char operator = myCharArray[1].charAt(0);

            System.out.println(operand_1);
            System.out.println(operand_2);
            System.out.println(operator);
        }
    }
}
