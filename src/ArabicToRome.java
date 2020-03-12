/*
I 1
V 5
X 10
L 50
C 100
D 500
M 1000
*/
import java.util.HashMap;
import java.util.Map;

class ArabicToRome {
    public ArabicToRome(int inputArabicNumber) {
        {
            int romeNumber_C;
            int romeNumber_L;
            int romeNumber_X;

            System.out.println("________");
            System.out.print("Ваш ответ: ");

            romeNumber_C = inputArabicNumber / 100;
            inputArabicNumber = inputArabicNumber % 100;
            for (int i = 0; i < romeNumber_C; i++) {
                System.out.print("C");
            }

            romeNumber_L = inputArabicNumber / 50;
            inputArabicNumber = inputArabicNumber % 50;
            for (int i = 0; i < romeNumber_L; i++) {
                System.out.print("L");
            }

            romeNumber_X = inputArabicNumber / 10;
            inputArabicNumber = inputArabicNumber % 10;
            for (int i = 0; i < romeNumber_X; i++) {
                System.out.print("X");
            }

            // Создание словаря
            Map<Integer, String> arabicRomeDict = new HashMap<>();

            //Добавление элементов
            arabicRomeDict.put(1, "I");
            arabicRomeDict.put(2, "II");
            arabicRomeDict.put(3, "III");
            arabicRomeDict.put(4, "IV");
            arabicRomeDict.put(5, "V");
            arabicRomeDict.put(6, "VI");
            arabicRomeDict.put(7, "VII");
            arabicRomeDict.put(8, "VIII");
            arabicRomeDict.put(9, "IX");

            String remainder = arabicRomeDict.get(inputArabicNumber);
            if (remainder != null) {
                System.out.print(remainder);
            }
        }
        System.out.println();
    }
}

