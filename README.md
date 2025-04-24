# Rock Paper Scissors - Java CLI Game

This is a simple command-line game of Rock Paper Scissors implemented in Java, using object-oriented principles and Maven as the build system.

## ✨ Features
- Play against the computer
- Injectible move strategy for testability and AI extensions
- Supports game result breakdown: win, lose, or draw
- Clean architecture with SOLID principles
- JUnit 5 test suite included

## 🛠 Requirements
- Java 17+
- Maven 3.6+

## 🚀 How to Run

### 1. Compile the Project
```bash
mvn clean compile
```

### 2. Run the Tests
```bash
mvn test
```

### 3. Run the Game (CLI)
```bash
mvn exec:java -Dexec.mainClass=nl.hartwigmedicalfoundation.rps.cli.Main
```