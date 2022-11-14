package StepObject;

import PageObject.HomePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SetValueOptions;
import com.codeborne.selenide.commands.PressEnter;

import java.time.Duration;




public class HomePageSteps extends HomePage {
    public HomePageSteps Loginvalue() {
        logininput.click();
        logininput.shouldBe(Condition.visible, Duration.ofMillis(100));
      return this;}
    public HomePageSteps MAIL() {
        mailinput.click();
        mailinput.shouldBe(Condition.visible, Duration.ofMillis(100));
        return this;}
    public HomePageSteps mailvalue(String mailname){
        mailinput.setValue(mailname);
        mailinput.shouldBe(Condition.visible, Duration.ofMillis(100)) ;
        return this;}
    public HomePageSteps pass() {
        passwordinput.click();
        passwordinput.shouldBe(Condition.visible, Duration.ofMillis(1000));
        return this;}
        public HomePageSteps Passwordvalue(String passwordname) {
        passwordinput.setValue(passwordname);
        passwordinput.shouldBe(Condition.visible, Duration.ofMillis(1000));
                   return this;}

    public HomePageSteps entervalue () {
        enterinput.click();
        enterinput.shouldBe(Condition.visible, Duration.ofMillis(1000));
        return this;}



}


//HOMEPAGESTEPS VUKAVSHIREBT HOME PAGES
