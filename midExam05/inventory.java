package important_midExams.midExam5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String commands = scanner.nextLine();

        while (!commands.equals("Craft!")) {

            String[] tokens = commands.split(" - ");
            String command = tokens[0];
            String item = tokens[1];

            switch (command) {
                case "Collect":
                    if (!list.contains(item)) { // ако въведеното от нас го няма в листа
                        list.add(item); // добави
                    }
                    break;
                case "Drop":
                    list.remove(item);
                    break;
                case "Combine Items":
                    String[] splitted = item.split(":"); // четем входа наново, защото тук се разпределя с :
                    String oldItem = splitted[0];
                    String newItem = splitted[1];
                    int index = list.indexOf(oldItem) + 1;
                    if (list.contains(oldItem)) {
                        list.add(index, newItem);
                    }
                    break;
                case "Renew":
                    if (list.contains(item)) { // ако в листа го има въведеното от нас
                        index = list.indexOf(item); // намери индекса от листа по числото въведенот от нас на индекс 1
                        list.remove(item); // изтрий го числото на този индекс
                        list.add(item); // добави числото накрая
                    }
                    break;
            }
            commands = scanner.nextLine(); // прочети наново
        }
        System.out.println(String.join(", ", list));
    }
}
