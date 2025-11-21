package com.demo.sonarqube;

public class DeadCode {
    public void doNothing() {
        // This method is never used, which should trigger a code smell
    }
}
