package important_midExams.midExam4;

import java.util.Scanner;

public class guineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kgFood = Double.parseDouble(scanner.nextLine());
        double kgHay = Double.parseDouble(scanner.nextLine());
        double kgCover = Double.parseDouble(scanner.nextLine());

        double weight = Double.parseDouble(scanner.nextLine());

        double grFood = kgFood * 1000;
        double grHay = kgHay * 1000;
        double grCover = kgCover * 1000;
        double grWeight = weight * 1000;

        for (int i = 1; i <=30 ; i++) {
            grFood -= 300;
            if (i % 2 == 0){
                grHay -= grFood * 5/100;
            }
            if (i % 3 == 0){
                grCover -= grWeight /3;
            }
        }
        if (grFood >= 0 && grHay >= 0 && grCover >= 0){
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", grFood / 1000, grHay / 1000, grCover / 1000);
        }else{
            System.out.println("Merry must go to the pet store!");
        }
    }
}
