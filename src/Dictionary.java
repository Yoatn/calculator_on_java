import java.util.HashMap;
import java.util.Map;

class Dictionary {
    private int operand_1;
    private int operand_2;
    String inputString;

    public Dictionary(String inputString) {
        this.inputString = inputString;

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
        Integer  value_1 = romeArabicDict.get(inputArray[0]);
        Integer  value_2 = romeArabicDict.get(inputArray[2]);

        if (value_1 != null && value_2 != null) {
            operand_1 = romeArabicDict.get(inputArray[0]);
            operand_2 = romeArabicDict.get(inputArray[2]);

        } else {
            operand_1 = Integer.parseInt(inputArray[0]);
            operand_2 = Integer.parseInt(inputArray[2]);
        }
    }

    public int getOperand_1() {
        return operand_1;

    }
    public int getOperand_2() {
        return operand_2;
    }
}
