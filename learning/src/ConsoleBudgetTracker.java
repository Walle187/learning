import java.util.Scanner;

public class ConsoleBudgetTracker {
    public static void main(String[] args) {

        String[] expenseSplit;
        String input, expenses;
        int expenseAcc = 0, result = 0;


        Scanner tastatur = new Scanner(System.in);
        System.out.print("Enter Income: ");
        input = tastatur.nextLine();

        System.out.print("Enter Expenses divided with Commas: ");
        expenses = tastatur.nextLine();
        expenses = expenses.replaceAll("[\\s]", "");
        expenseSplit = expenses.split(",");

        for (int i=0; i< expenseSplit.length; i++) {
            expenseAcc = expenseAcc + Integer.parseInt(expenseSplit[i]);
        }

        System.out.println("");
        result = Integer.parseInt(input) - expenseAcc;
        System.out.println("Dein Einkommen beträgt: " + input + "€");
        System.out.println("Deine Ausgaben betragen: " + expenseAcc + "€");
        System.out.println("Nach allen ausgaben bleiben dir noch " + result + "€");
        tastatur.close();
    }
}
