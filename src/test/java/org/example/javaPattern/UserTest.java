package org.example.javaPattern;

import org.example.javaPattern.User;
import org.example.javaPattern.UserBuilder;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertTrue;

public class UserTest {
   static WebDriver driver;
   @BeforeClass
    public static void createBrowser()
    {
   driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();
    }
    @Test
    public void setUser() throws InterruptedException {

        User user= new UserBuilder().setFirstname("nikee").setLastname("mehta").setJobTitle("Software Testing").createUser();
        //System.out.println(user);
      boolean res=  registaraionUser(user);
      assertTrue(res);
    }

    public boolean registaraionUser(User user) throws InterruptedException {

        driver.findElement(By.id("first-name")).sendKeys(user.getFirstname());
        driver.findElement(By.id("last-name")).sendKeys(user.getLastname());
        driver.findElement(By.id("job-title")).sendKeys(user.getJobTitle());

        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.id("checkbox-2")).click();

        WebElement selectElement=driver.findElement(By.id("select-menu"));
        new Select(selectElement).selectByVisibleText("0-1");

        driver.findElement(By.id("datepicker")).sendKeys("15/10/2024");
        Thread.sleep(3000L);
        driver.findElement(By.linkText("Submit")).click();


        return driver.getCurrentUrl().equals("https://formy-project.herokuapp.com/thanks");
    }

    @AfterClass
    public static void getCloseBrowser()
    {
        driver.close();
    }
}
