import java.util.*;

class Expense {
    String category;
    double amount;

    Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();

        while (true) {
            System.out.println("\n1.Add Expense");
            System.out.println("2.View Expenses");
            System.out.println("3.Total Spending");
            System.out.println("4.Exit");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    sc.nextLine();
                    System.out.print("Enter category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();

                    expenses.add(new Expense(category, amount));

                    System.out.println("Expense Added");
                    break;

                case 2:
                    for(Expense e : expenses) {
                        System.out.println(e.category + " : ₹" + e.amount);
                    }
                    break;

                case 3:
                    double total = 0;

                    for(Expense e : expenses) {
                        total += e.amount;
                    }

                    System.out.println("Total Spending: ₹" + total);
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}