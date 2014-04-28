package com.springapp.mvc;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.Assert.assertEquals;

public class HelloTest {
    private WebDriver driver = new HtmlUnitDriver();

    @Test
    public void shouldSayHello() throws Exception {
        driver.get("http://localhost:8080");
        WebElement h1 = driver.findElement(By.tagName("h1"));
        assertEquals("Hi", h1.getText());
    }
}
