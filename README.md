# SonarQube Demo Project

This is a minimal Java project designed to demonstrate SonarQube analysis. It contains intentional code quality issues and a failing test to showcase SonarQube's capabilities.

## How to Build

```
mvn clean package
```

## How to Run Tests

```
mvn test
```

## SonarQube Demo

- Run SonarQube analysis on this project to see detected code smells, bugs, and test failures.
- Example issues:
  - Unused variable in `App.java`
  - Incorrect implementation of `add` method
  - Failing test in `AppTest.java`
