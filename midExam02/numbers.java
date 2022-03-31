package important_midExams.midExam2;

import java.math.BigDecimal;
import java.util.*;

public class numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        double total = 0;

        for (int currentNumber : numbersArr) { // взимаме числата от масива и ги сумираме
            total += currentNumber;
        }

        double average = total / numbersArr.length; // смятаме средно
        List<BigDecimal> topNumbers = new ArrayList<>();//създаваме лист който ще държи топ числата

        for (int currentNum : numbersArr) { // обхождаме масива
            if (currentNum > average) { // ако сегашното число е по-голямо от средното
                topNumbers.add(BigDecimal.valueOf(currentNum)); // добави към листа по-голямото число
            }
        }

        Collections.sort(topNumbers); // сортирай числата
        Collections.reverse(topNumbers); // обърни числата

        if (topNumbers.size() > 5) { // ако топ числата са повече от 5
            for (int i = 0; i < 5; i++) {
                System.out.print(topNumbers.get(i) + " ");
            }
        } else if (topNumbers.isEmpty()) { // ако топ числата са празни
            System.out.println("No");
        } else {
            System.out.println(topNumbers.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
