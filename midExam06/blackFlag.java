package important_midExams.midExam6;

import java.util.Scanner;

public class blackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlumber = Integer.parseInt(scanner.nextLine());
        double expectedPlumber = Integer.parseInt(scanner.nextLine());

        int daysCount = 0;
        double collected = 0;

        for (int i = 0; i <days ; i++) {
            collected += dailyPlumber;
            daysCount++;

            if (daysCount % 3 == 0){
                collected += (dailyPlumber * 0.5);
            }
            if (daysCount % 5 == 0){
                collected -= (collected * 0.3);
            }
        }

        if (collected >= expectedPlumber){
            System.out.printf("Ahoy! %.2f plunder gained.", collected);
        }else{
            System.out.printf("Collected only %.2f%% of the plunder.", (collected*100) / expectedPlumber );
        }
    }
}
