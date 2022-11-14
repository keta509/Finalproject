package StepObject;

import PageObject.SearchPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class SearchPageSteps extends SearchPage {
    public  SearchPageSteps searchvalue(){
        searchinput.click();
        searchinput.shouldBe(Condition.visible, Duration.ofMillis(1000));
        return this;
    }
    public  SearchPageSteps nameitem(String item){
        searchinput.setValue(item).pressEnter();
        searchinput.shouldNotBe(Condition.empty, Duration.ofMillis(1000));
        return this;}

    public  SearchPageSteps sortvalue(){
        sort.click();
        return this;}
    public  SearchPageSteps selectoplionvalue(){
        selectoption.click();
        return this;}

}
