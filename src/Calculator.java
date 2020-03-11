class Calculator {
    public int calculate(int values_1, int values_2, String operator) {
        int operand_1 = values_1;
        int operand_2 = values_2;
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
    }
}




