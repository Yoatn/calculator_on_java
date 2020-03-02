import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        while (true) {
            // Ввод значения
            Scanner scanner = new Scanner(System.in);
            String inRomeDigit = scanner.next();

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

//        Проверяем на наличе в словаре
            Integer value = romeArabicDict.get(inRomeDigit);
            if (value != null) {
                System.out.println(romeArabicDict.get(inRomeDigit)); //Если ввод есть, то печатае значение по ключу
            } else {
                System.out.println(inRomeDigit); // Если нет, то печатаем вводимое значение
            }
        }
    }
}


