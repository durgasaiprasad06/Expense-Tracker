# Expense Tracker 💰

A simple yet powerful Command-Line Interface (CLI) application built in Java to help you track, manage, and budget your daily expenses effectively. This project is fully containerized and includes a complete CI/CD pipeline.

## 🚀 Features

- **Record Expenses**: Quickly log your spending with category, amount, and description.
- **Spending Summary**: Get an instant overview of your total expenses.
- **Budget Management**: Set monthly budgets and track your remaining balance.
- **Expense History**: View a detailed log of all your recorded transactions.
- **Currency Conversion**: Built-in support for converting amounts between INR, USD, and EUR.
- **Data Persistence**: Automatically saves and loads your expense data from a local text file (`expenses.txt`).
- **Containerized**: Fully dockerized for easy deployment and execution.
- **CI/CD Pipeline**: Automated builds, linting, and security scanning using GitHub Actions.

## 🛠️ Tech Stack

- **Core Language**: Java 17
- **Build Tool**: Maven
- **Storage**: Local File System (Text-based storage)
- **Containerization**: Docker
- **CI/CD**: GitHub Actions
- **Testing**: JUnit 5

## 📖 Usage

Navigate through the interactive menu by entering the corresponding numbers:
1.  **Record an expense**: Enter amount, category, and description.
2.  **View expense summary**: Shows total spending and budget status.
3.  **Set budget**: Define your maximum spending limit.
4.  **View budgets**: Check your current budget settings.
5.  **View expense history**: List all recorded transactions with dates.
6.  **Currency Conversion**: Quick conversion between INR, USD, and EUR.
7.  **Save expenses**: Manually save your data to `expenses.txt`.
8.  **Load expenses**: Restore data from `expenses.txt`.
9.  **Exit**: Safely close the application.

## 📦 How to Build and Run Locally

### 1. Build the Project
Open a terminal and navigate to the project directory, then run the following Maven command:
```bash
mvn clean package
```
This will compile the project and package the application into an executable JAR file in the `target/` directory.

### 2. Run the Application
Execute the JAR file using Java:
```bash
java -jar target/expense-tracker-1.0-SNAPSHOT.jar
```

## 🐳 Running with Docker

You can also run this application inside a Docker container without needing Java or Maven installed on your host machine.

### 1. Build the Docker Image
```bash
docker build -t expense-tracker:latest .
```

### 2. Run the Docker Container
```bash
docker run -it --rm expense-tracker:latest
```

## 📂 Project Structure

```text
expense-tracker/
├── src/
│   └── main/java/com/expensetracker/
│       ├── Main.java           # Application entry point
│       ├── Expense.java        # Expense model class
│       └── ExpenseManager.java # Core logic and file handling
├── pom.xml                     # Maven configuration
├── Dockerfile                  # Docker container configuration
├── .github/workflows/          # CI/CD pipeline definition
└── expenses.txt                # Data storage file
```
## STORE - CI/CD PIPELINE 

<img width="1536" height="1024" alt="ChatGPT Image May 15, 2026, 01_45_07 AM" src="https://github.com/user-attachments/assets/c3c1218c-da44-47e0-ac8d-282ac89449b4" />


## 🔄 CI/CD Pipeline
This project includes a fully functional GitHub Actions workflow (`.github/workflows/ci-cd.yml`). On every push or pull request to the `main` branch, it will automatically:
1. Check out the repository.
2. Set up JDK 17.
3. Build and test the project using Maven.
4. Lint the `Dockerfile` using Hadolint.
5. Build the Docker image.
6. Scan the Docker image for vulnerabilities using Trivy.

## 📝 License
This project is open-source and available under the MIT License.
