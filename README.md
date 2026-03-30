# Expense Tracker Pro 💰

A simple yet powerful Command-Line Interface (CLI) application built in Java to help you track, manage, and budget your daily expenses effectively.

## 🚀 Features

- **Record Expenses**: Quickly log your spending with category, amount, and description.
- **Spending Summary**: Get an instant overview of your total expenses.
- **Budget Management**: Set monthly budgets and track your remaining balance.
- **Expense History**: View a detailed log of all your recorded transactions.
- **Currency Conversion**: Built-in support for converting amounts between INR, USD, and EUR.
- **Data Persistence**: Automatically saves and loads your expense data from a local text file (`expenses.txt`).

## 🛠️ Tech Stack

- **Language**: Java 
- **Build Tool**: Maven
- **Storage**: Local File System (Text-based storage)

## 📖 Usage

Navigate through the interactive menu by entering the corresponding numbers:
1.  **Record an expense**: Enter amount, category, and description.
2.  **View expense summary**: Shows total spending and budget status.
3.  **Set budget**: Define your maximum spending limit.
4.  **View budgets**: Check your current budget settings.
5.  **View expense history**: List all recorded transactions with dates.
6.  **Convert currency**: Quick conversion between INR, USD, and EUR.
7.  **Save expenses**: Manually save your data to `expenses.txt`.
8.  **Load expenses**: Restore data from `expenses.txt`.
9.  **Exit**: Safely close the application.

## 📂 Project Structure

```text
expense-tracker/
├── src/
│   └── main/java/com/expensetracker/
│       ├── Main.java           # Application entry point
│       ├── Expense.java        # Expense model class
│       └── ExpenseManager.java # Core logic and file handling
├── pom.xml                     # Maven configuration
└── expenses.txt                # Data storage file
```

