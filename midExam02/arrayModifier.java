package important_midExams.midExam2;

import java.util.Arrays;
import java.util.Scanner;

public class arrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while(!input.equals("end")){
            String[] tokens = input.split("\\s+");

            switch (tokens[0]){
                case "swap":
                    int index1 = Integer.parseInt(tokens[1]);
                    int index2 = Integer.parseInt(tokens[2]);
                    if (index1 >= 0 && index1 < numbers.length && index2 >= 0 && index2 < numbers.length){
                        int temp = numbers[index1];
                        numbers[index1] = numbers[index2];
                        numbers[index2] = temp;
                    }
                    break;
                case "multiply":
                    index1 = Integer.parseInt(tokens[1]);
                    index2 = Integer.parseInt(tokens[2]);
                    if (index1 >= 0 && index1 < numbers.length && index2 >= 0 && index2 < numbers.length){
                        int temp = numbers[index1] * numbers[index2];
                        numbers[index1] = temp;
                    }
                    break;
                case "decrease":
                    for (int i = 0; i <numbers.length ; i++) {
                        int temp = numbers[i] - 1;
                        numbers[i] = temp;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1){
                System.out.print(", ");
            }
        }
    }
}
