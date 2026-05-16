# Expense Tracker

A simple Java-based command-line Expense Tracker application. This project provides functionality to manage daily expenses and is built using Java and Maven.

## 🚀 Technologies Used
- **Java 17**: Core programming language.
- **Maven**: Dependency management and build tool.
- **JUnit 5**: For unit testing (optional).
- **Docker**: For containerizing the application.
- **GitHub Actions**: For CI/CD (linting, building, and scanning the Docker image).

## 🛠️ Prerequisites
- [Java Development Kit (JDK) 17](https://adoptium.net/) or higher.
- [Maven](https://maven.apache.org/) (for building the project locally).
- [Docker](https://www.docker.com/) (for running the containerized version).

## 📦 How to Build and Run Locally

### 1. Build the Project
Open a terminal and navigate to the project directory, then run the following Maven command:
```bash
mvn clean package
```
This will compile the project, run tests, and package the application into an executable JAR file in the `target/` directory.

### 2. Run the Application
Execute the JAR file using Java:
```bash
java -jar target/expense-tracker-1.0-SNAPSHOT.jar
```
*(If the JAR name is different, check the `target/` directory after building).*

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
