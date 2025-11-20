package com.demo.sonarqube;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testAdd() {
        // This test will fail due to the intentional bug in App.add (updated)
        assertEquals(4, App.add(2, 2));
    }
}
