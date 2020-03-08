//            String[] operators = inputExpression.split("[0-9]+"); // Находим цифры
//            String[] operands = inputExpression.split("[+/*-]");  // Находим операнд

import java.beans.PropertyEditorSupport;

// Калькулятор
class Calculator {
    public int calculate (int[] values, String operator) {
        int operand_1 = values[0];
        int operand_2 = values[1];
        int result = 0;

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

        return result;

        // Вывод результата
//        System.out.println("________");
//        System.out.println("Результат: " + result);
//        System.out.println();


    }
}




