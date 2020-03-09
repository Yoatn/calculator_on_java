import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Decantation {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите выражение: ");
            Scanner scanner = new Scanner(System.in);
            String myString = scanner.nextLine();
            if (myString.matches("^([0-9]|10)\\s[\\-|\\+|\\*|\\/]\\s([0-9]|10)$|" +
                    "^(I|II|III|IV|V|VI|VII|VIII|IX|X)\\s[\\-|\\+|\\*|\\/]\\s(I|II|III|IV|V|VI|VII|VIII|IX|X)$")) {
                System.out.println(myString);
                System.out.println();
            } else {
                System.out.println("Неверное выражение. Повторите ввод.");
                System.out.println();
            }
//            String[] myCharArray = myString.split(" ");
//
//            int operand_1 = Integer.parseInt(myCharArray[0]);
//            int operand_2 = Integer.parseInt(myCharArray[2]);
//            char operator = myCharArray[1].charAt(0);
//
//            System.out.println(operand_1);
//            System.out.println(operand_2);
//            System.out.println(operator);
        }
    }
}


// ^\d{1,2}\s[\-|\+|\*|\/]\s\d{1,2} arabic
// ^(I|II|III|IV|V|VI|VII|VIII|IX|X)\s[\-|\+|\*|\/]\s(I|II|III|IV|V|VI|VII|VIII|IX|X)$ rome

// ^([0-9]|10)\s[\-|\+|\*|\/]\s([0-9]|10)$|^(I|II|III|IV|V|VI|VII|VIII|IX|X)\s[\-|\+|\*|\/]\s(I|II|III|IV|V|VI|VII|VIII|IX|X)$