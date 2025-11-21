package com.demo.sonarqube;

public class BadCode {
    public int divide(int a, int b) {
        // This will break the quality gate: no check for division by zero
        return a / b;
    }
}
