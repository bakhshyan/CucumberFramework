package com.cucumber.testng.hooks;

import com.cucumber.testng.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class DriverHooks {
    @Before
    public void setupDriver() {
        DriverManager.setupDriver();

    }

    @After
    public void quitDriver() {
        DriverManager.quitDriver();

    }
}
