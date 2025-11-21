package com.demo.sonarqube;

public class CriticalBug {
    public void alwaysFails() {
        throw new RuntimeException("This method always fails and should trigger a new bug issue in SonarQube.");
    }
}
