package com.expensetracker;

import java.time.LocalDate;

public class Expense {

    private double amount;
    private String category;
    private String description;
    private LocalDate date;

    // Constructor
    public Expense(double amount, String category, String description, LocalDate date) {
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = date;
    }

    // Getters
    public double getAmount() { return amount; }
    public String getCategory() { return category; }
    public String getDescription() { return description; }
    public LocalDate getDate() { return date; }

    // Console print
    @Override
    public String toString() {
        return "Date: " + date + ", Amount: " + amount +
               ", Category: " + category + ", Description: " + description;
    }

    // For saving to file
    public String toFileString() {
        return date + "," + amount + "," + category + "," + description;
    }

    // For loading from file
    public static Expense fromFileString(String line) {
        String[] parts = line.split(",", 4);
        LocalDate date = LocalDate.parse(parts[0]);
        double amount = Double.parseDouble(parts[1]);
        String category = parts[2];
        String description = parts[3];
        return new Expense(amount, category, description, date);
    }
}
