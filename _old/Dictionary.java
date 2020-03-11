package src_temp;

import java.util.HashMap;
import java.util.Map;

class Dictionary {
    public int[] dictionary(String inputString) {

        String[] inputArray = inputString.split(" ");

        // Создание словаря
        Map<String, Integer> romeArabicDict = new HashMap<>();

        //Добавление элементов
        romeArabicDict.put("I", 1);
        romeArabicDict.put("II", 2);
        romeArabicDict.put("III", 3);
        romeArabicDict.put("IV", 4);
        romeArabicDict.put("V", 5);
        romeArabicDict.put("VI", 6);
        romeArabicDict.put("VII", 7);
        romeArabicDict.put("VIII", 8);
        romeArabicDict.put("IX", 9);
        romeArabicDict.put("X", 10);

        //Проверяем на наличе в словаре
        Integer  operand_1 = romeArabicDict.get(inputArray[0]);
        Integer  operand_2 = romeArabicDict.get(inputArray[2]);

        if (operand_1 != null && operand_2 != null) {
            operand_1 = romeArabicDict.get(inputArray[0]);
            operand_2 = romeArabicDict.get(inputArray[2]);

        } else {
            operand_1 = Integer.parseInt(inputArray[0]);
            operand_2 = Integer.parseInt(inputArray[2]);
        }

        int[] operands = new int[2];
        operands[0] = operand_1;
        operands[1] = operand_2;

        return operands;

    }
}