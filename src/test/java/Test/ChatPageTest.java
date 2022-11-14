package Test;

import ChromeRunner.Chrome;
import StepObject.ChatPageSteps;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.time.Duration;

import static DataObject.ChatPageData.text;


public class ChatPageTest extends Chrome {

    @Test
    public ChatPageSteps chatvalue() {
        ChatPageSteps BasketPageSteps = new ChatPageSteps();
        BasketPageSteps.firstclick()
                .second()
                .write(text);
        Duration.ofMillis(1000);
        return BasketPageSteps;
    }



}

