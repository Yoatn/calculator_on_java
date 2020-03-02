import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public Dictionary (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inRomeDigit = scanner.next();

        Map<String, Integer> romeArabicDict = new HashMap<>();

        //добавление элементов
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

//        System.out.println(romeArabicDict.get(inRomeDigit));
    }
}

