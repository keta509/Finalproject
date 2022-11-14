package ChromeRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.open;

public class Chrome {
    @BeforeTest
    public static void setUp() {

        open("https://time.ge/");
        Duration.ofMillis(100);
    }

}





