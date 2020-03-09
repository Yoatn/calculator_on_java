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
    }
}




