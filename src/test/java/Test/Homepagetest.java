package Test;

import ChromeRunner.Chrome;
import StepObject.HomePageSteps;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.commands.Click;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static DataObject.HomePageData.mail;
import static DataObject.HomePageData.password;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class Homepagetest extends Chrome {
    @Test
    public void home() {

        HomePageSteps homePageSteps  = new HomePageSteps();
        homePageSteps.Loginvalue()
                .MAIL()
                .mailvalue(mail)
                .pass()
                .Passwordvalue(password)
                .entervalue();
        Duration.ofMillis(10000);
        System.out.println(homePageSteps);

        Assert.assertTrue(homePageSteps.logininput.is(Condition.visible));



    }
}
