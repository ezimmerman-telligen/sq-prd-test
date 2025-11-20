package com.demo.sonarqube;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, SonarQube Demo! (updated)");
        int result = add(2, 2);
        System.out.println("2 + 2 = " + result);
        // Intentional code smell: unused variable
        int unused = 43; // changed for demo
    }

    // Intentional bug: should be a + b, but returns a - b
    public static int add(int a, int b) {
        return a - b;
    }
}
