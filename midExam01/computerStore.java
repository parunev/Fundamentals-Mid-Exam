package important_midExams;

import java.util.Scanner;

public class computerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        String type = "";
        while (true){
            String input = scanner.nextLine();
            if (input.equals("special") || input.equals("regular")){
                type = input;
                System.out.println("Congratulations you've bought a new computer!");
                break;
            }
            double price = Double.parseDouble(input);
            if (price > 0){
            sum += price;
            }else {
                System.out.println("Invalid price!");
            }
        }
        System.out.printf("Price without taxes: %.2f$%n", sum);
        double tax = sum * 0.20;
        System.out.printf("Taxes: %.2f$%n", tax);
        double totalPrice = tax + sum;
        if (type.equals("special")){
            totalPrice = totalPrice - (totalPrice * 0.1);
        }
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$", totalPrice);
    }
}
