package important_midExams.midExam6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class treasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialLoot = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        // четем лист с който получаваме плячка

        String line = scanner.nextLine();

        while (!"Yohoho!".equals(line)) {
            List<String> treasure = Arrays.stream(line.split("\\s+")).collect(Collectors.toList());
            // прочитаме команди
            String command = treasure.get(0); // командата е на индекс 0

            switch (command) {
                case "Loot":
                    for (int i = 1; i < treasure.size(); i++) { // обхождаме въведените в листа неща от ЦИКЪЛА
                        if (!initialLoot.contains(treasure.get(i))) { // ако дадено нещо го няма в първият лист
                            initialLoot.add(0, treasure.get(i)); // добавяме го
                        }
                    }
                    break;

                case "Drop":
                    int index = Integer.parseInt(treasure.get(1)); // взимаме индекс от въведените от нас данни
                    if (index >= 0 && index < initialLoot.size()) { // проверяваме дали индекса е валиден
                        String item = initialLoot.get(index); // взимаме индекса
                        initialLoot.remove(index); // премахваме предмета от индекса
                        initialLoot.add(item); // добавяме го в края на листа
                    }
                    break;

                case "Steal":
                    int count = Integer.parseInt(treasure.get(1)); // взимаме число което ни казва колко неща ще ни бъдат откраднати

                    if (count > initialLoot.size()) { // ако числото е по-голямо от всичките неща в листа
                        count = initialLoot.size(); // приравняваме каунтъра да е равен на индексите от листа
                    }
                    List<String> subList = initialLoot.subList(initialLoot.size() - count, initialLoot.size());
                    System.out.println(String.join(", ", subList));
                    initialLoot = initialLoot.subList(0, initialLoot.size() - count);
                    break;
            }

            line = scanner.nextLine();
        }

        if (!initialLoot.isEmpty()) { // ако листа не ни е празен
            int sumLengthItem = 0; // сумираме предметите по дължината им
            for (String currentItem : initialLoot) { // обхождаме листа
                sumLengthItem += currentItem.length(); // към сумата добавяме дължината на текущият предмет Gold - 4 символа, добавяме 4
            }
            double averageGain = sumLengthItem * 1.0 / initialLoot.size(); // средно колко сме добили
            System.out.printf("Average treasure gain: %.2f pirate credits.%n", averageGain); // принтираме придобитото средно
        } else {
            System.out.println("Failed treasure hunt."); // ако обаче листа е празен принтираме, че е провал мисията
        }
    }
}
