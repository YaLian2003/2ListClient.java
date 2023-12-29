import java.util.Scanner;

public class ListClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean continueFlag;

        do {
            System.out.print("Input a list of integers: ");
            input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            ListADT list = new ListADT();

            for (String token : tokens) {
                if (!token.isEmpty()) {
                    list.insert(Integer.parseInt(token));
                }
            }

            if (list.hasNoRepeats()) {
                System.out.println("The list does not have repeated values.");
            } else {
                System.out.println("The list has repeated values.");
            }

            System.out.print("Do you want to continue (y/n): ");
            input = scanner.nextLine();
            continueFlag = input.equalsIgnoreCase("y");
        } while (continueFlag);

        scanner.close();
    }
}
