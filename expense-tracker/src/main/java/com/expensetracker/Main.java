package com.expensetracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        boolean running = true;
        while (running) {
            System.out.println("\n===== Expense Tracker Menu =====");
            System.out.println("1. Record an expense");
            System.out.println("2. View expense summary");
            System.out.println("3. Set budget");
            System.out.println("4. View budgets");
            System.out.println("5. View expense history");
            System.out.println("6. Convert currency");
            System.out.println("7. Save expenses");
            System.out.println("8. Load expenses");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    manager.recordExpense();
                    break;
                case 2:
                    manager.showSummary();
                    break;
                case 3:
                    manager.setBudget();
                    break;
                case 4:
                    manager.viewBudget();
                    break;
                case 5:
                    manager.showHistory();
                    break;
                case 6:
                    manager.convertCurrency();
                    break;
                case 7:
                    manager.saveExpenses();
                    break;
                case 8:
                    manager.loadExpenses();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }

}
