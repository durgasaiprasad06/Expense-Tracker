package com.expensetracker;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseManager {

    private ArrayList<Expense> expenses = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private double budget = 0.0;

    // --- Option 1: Record expense ---
    public void recordExpense() {
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Enter category: ");
        String category = sc.nextLine();
        System.out.print("Enter description: ");
        String description = sc.nextLine();
        Expense expense = new Expense(amount, category, description, LocalDate.now());
        expenses.add(expense);
        System.out.println("Expense recorded successfully!");
    }

    // --- Option 2: View summary ---
    public void showSummary() {
        double total = expenses.stream().mapToDouble(Expense::getAmount).sum();
        System.out.println("Total Expense: " + total);
        if (budget > 0) {
            System.out.println("Budget: " + budget);
            if (total > budget)
                System.out.println("⚠ Budget exceeded by " + (total - budget));
            else
                System.out.println("Remaining budget: " + (budget - total));
        }
    }

    // --- Option 3: Set budget ---
    public void setBudget() {
        System.out.print("Enter monthly budget: ");
        budget = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.println("Budget set to " + budget);
    }

    // --- Option 4: View budget ---
    public void viewBudget() {
        if (budget <= 0)
            System.out.println("No budget set.");
        else
            System.out.println("Current budget: " + budget);
    }

    // --- Option 5: Expense history ---
    public void showHistory() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded yet.");
            return;
        }
        System.out.println("----- Expense History -----");
        for (Expense e : expenses) {
            System.out.println(e);
        }
    }

    // --- Option 6: Currency conversion ---
    public void convertCurrency() {
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        System.out.print("Convert from (INR/USD/EUR): ");
        String from = sc.nextLine().toUpperCase();
        System.out.print("Convert to (INR/USD/EUR): ");
        String to = sc.nextLine().toUpperCase();

        double converted = convert(amount, from, to);
        System.out.println(amount + " " + from + " = " + converted + " " + to);
    }

    private double convert(double amount, String from, String to) {
        double usdRate = 82.0;
        double eurRate = 90.0;
        double amtInINR = switch (from) {
            case "INR" -> amount;
            case "USD" -> amount * usdRate;
            case "EUR" -> amount * eurRate;
            default -> {
                System.out.println("Invalid from currency. Using INR.");
                yield amount;
            }
        };
        return switch (to) {
            case "INR" -> amtInINR;
            case "USD" -> amtInINR / usdRate;
            case "EUR" -> amtInINR / eurRate;
            default -> {
                System.out.println("Invalid to currency. Returning original.");
                yield amount;
            }
        };
    }

    // --- Option 7: Save expenses ---
    public void saveExpenses() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("expenses.txt"))) {
            for (Expense e : expenses) {
                writer.write(e.toFileString());
                writer.newLine();
            }
            System.out.println("Expenses saved to expenses.txt");
        } catch (IOException e) {
            System.out.println("Error saving expenses: " + e.getMessage());
        }
    }

    // --- Option 8: Load expenses ---
    public void loadExpenses() {
        expenses.clear();
        File file = new File("expenses.txt");
        if (!file.exists()) {
            System.out.println("No saved expenses found.");
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                expenses.add(Expense.fromFileString(line));
            }
            System.out.println("Expenses loaded from expenses.txt");
        } catch (IOException e) {
            System.out.println("Error loading expenses: " + e.getMessage());
        }
    }
}
