package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {
    public SelenideElement
            logininput =$(".user-cabinet",0),
            mailinput =$("#js-field-login",0),
            passwordinput =$(By.xpath("/html/body/div[3]/div[2]/div[1]/div/div/div/form/div[1]/div[2]/label/input")),

            enterinput =$(By.xpath("/html/body/div[3]/div[2]/div[1]/div/div/div/form/div[5]/button"));









}
