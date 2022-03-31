package important_midExams.midExam3;

import java.util.Scanner;

public class counterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        int won = 0;

        String input = scanner.nextLine();

        while(!input.equals("End of battle")){
            int distance = Integer.parseInt(input);

            if (energy < distance){
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", won, energy);
                energy -= distance;
                break;
            }
            energy -= distance;
            won++;
            if (won % 3 == 0){
                energy += won;
            }
            input = scanner.nextLine();
        }
        if (energy >= 0){
            System.out.printf("Won battles: %d. Energy left: %d", won, energy);
        }
    }
}
