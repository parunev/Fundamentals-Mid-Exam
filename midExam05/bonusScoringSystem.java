package important_midExams.midExam5;

import java.util.Scanner;

public class bonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = Integer.parseInt(scanner.nextLine());
        int numLectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = 0;
        double studentAttendance = 0;

        for (int i = 0; i <numStudents ; i++) {
            double attendance = Double.parseDouble(scanner.nextLine());
            double totalBonus = attendance / numLectures;
            double totalBonus1 = totalBonus * (5 + bonus);

            if (totalBonus1 > maxBonus){
                maxBonus = totalBonus1;
            }
            if (attendance > studentAttendance){
                studentAttendance = attendance;
            }
        }
        System.out.println("Max Bonus: " + Math.round(maxBonus) + ".");
        System.out.printf("The student has attended %.0f lectures.", studentAttendance);
    }
}
