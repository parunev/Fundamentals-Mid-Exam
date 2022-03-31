package important_midExams;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class theLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < lift.length ; i++) {
            if (lift[i] < 4){
                if (num >= 4 - lift[i]){
                    num -= 4 - lift[i];
                    lift[i] = 4;
                }else{
                    lift[i] += num;
                    num = 0;
                }
            }
        }
        boolean full = IntStream.range(0, lift.length).noneMatch(i -> lift[i] != 4);
        if (num == 0 && !full){
            System.out.println("The lift has empty spots!");
        }else if (num > 0 && full){
            System.out.printf("There isn't enough space! %d people in queue!%n", num);
        }
        System.out.print(Arrays.toString(lift).replaceAll("[\\[\\]]", "").replaceAll(", ", " "));
    }
}
