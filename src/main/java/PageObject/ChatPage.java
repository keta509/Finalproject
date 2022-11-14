package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ChatPage {
    public SelenideElement
          click=$(".b24-widget-button-inner-item b24-widget-button-icon-animation"),

          secclick=$(By.xpath("/html/body/div[2]/div/div[3]/div[2]/a[1]")),
          writetext =$(".bx-im-textarea-box");



}
