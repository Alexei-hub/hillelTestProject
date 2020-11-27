import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.source;
import static com.codeborne.selenide.WebDriverRunner.url;
//    @BeforeMethod
//    public void before() {
//        Configuration.startMaximized = true;
//        Configuration.timeout = 5000;
//        open("https://rozetka.com.ua/");
//    }

public class ForTest {

    @Test
    public void groupTestOne() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method One. Thread id is: " + id);
    }

    @Test
    public void groupTestTwo() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method two. Thread id is: " + id);
    }

    @Test
    public void groupTestThree() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method three. Thread id is: " + id);
    }
}

