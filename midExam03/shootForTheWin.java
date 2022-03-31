package important_midExams.midExam3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class shootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());

        String index = scanner.nextLine();
        int count = 0;

        while (!index.equals("End")) {
            int newIndex = Integer.parseInt(index);

            if (newIndex < 0 || newIndex >= numbers.size()|| numbers.get(newIndex) == -1)
            {
                index = scanner.nextLine();
                continue;
            }
            int oldValue = numbers.get(newIndex);

            numbers.set(newIndex, -1);
            count++;
            for (int i = 0; i <= numbers.size() - 1; i++)
            {
                if (numbers.get(i) == -1) {
                    continue;
                }
                if (oldValue < numbers.get(i)) {
                    int newValue = numbers.get(i) - oldValue;
                    numbers.set(i, newValue);
                } else if (oldValue >= numbers.get(i) && numbers.get(i) != -1) {
                    int newValue = oldValue + numbers.get(i);
                    numbers.set(i, newValue);
                }
            }
            index = scanner.nextLine();
        }
        System.out.println("Shot targets: " + count + " ->" + " " + numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
