package com.expensetracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        while (true) {
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
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> manager.recordExpense();
                case 2 -> manager.showSummary();
                case 3 -> manager.setBudget();
                case 4 -> manager.viewBudget();
                case 5 -> manager.showHistory();
                case 6 -> manager.convertCurrency();
                case 7 -> manager.saveExpenses();
                case 8 -> manager.loadExpenses();
                case 9 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
