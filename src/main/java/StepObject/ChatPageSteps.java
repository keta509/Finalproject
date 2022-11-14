package StepObject;

import PageObject.ChatPage;
import com.codeborne.selenide.Condition;

;
import java.time.Duration;

public class ChatPageSteps extends ChatPage {

    public ChatPageSteps firstclick(){
        click.click();
        Duration.ofMillis(1000);
        return this;}
    public ChatPageSteps second(){
        secclick.click();
        Duration.ofMillis(1000);
        return this;}
    public ChatPageSteps write(String gamarjoba){
        writetext.setValue(gamarjoba);
        writetext.shouldBe(Condition.visible, Duration.ofMillis(1000));
        return this;}


}
