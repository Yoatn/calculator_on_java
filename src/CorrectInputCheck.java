import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CorrectInputCheck {
    public boolean correctInputCheck(String inputString) {

//            System.out.println("Введите выражение: ");
//            Scanner scanner = new Scanner(System.in);
//            String myString = scanner.nextLine();
        boolean result;
        if (inputString.matches("^([0-9]|10)\\s[\\-|\\+|\\*|\\/]\\s([0-9]|10)$|" +
                "^(I|II|III|IV|V|VI|VII|VIII|IX|X)\\s[\\-|\\+|\\*|\\/]\\s" +
                "(I|II|III|IV|V|VI|VII|VIII|IX|X)$")) {
            result = true;
//            System.out.println(myString);
//            System.out.println();
        } else {
            result = false;
//            System.out.println("Выражение не соответствует шаблону.\n" +
//                    "Повторите ввод:");
//            System.out.println();
        }

        return result;
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


// ^\d{1,2}\s[\-|\+|\*|\/]\s\d{1,2} arabic
// ^(I|II|III|IV|V|VI|VII|VIII|IX|X)\s[\-|\+|\*|\/]\s(I|II|III|IV|V|VI|VII|VIII|IX|X)$ rome

// ^([0-9]|10)\s[\-|\+|\*|\/]\s([0-9]|10)$|^(I|II|III|IV|V|VI|VII|VIII|IX|X)\s[\-|\+|\*|\/]\s(I|II|III|IV|V|VI|VII|VIII|IX|X)$