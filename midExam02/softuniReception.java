package important_midExams.midExam2;

import java.util.Scanner;

public class softuniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int sec = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int studentsPerHour = first + sec + third;
        if (studentCount % studentsPerHour == 0){
            count = studentCount / studentsPerHour;
        }else if (studentCount % studentsPerHour != 0){
            count = studentCount / studentsPerHour + 1;
        }

        if (count>3 && count % 3 == 0){
            count += count/3 - 1;
        }else if (count>3){
            count += count / 3;
        }
        System.out.println("Time needed: " + count + "h.");
    }
}
