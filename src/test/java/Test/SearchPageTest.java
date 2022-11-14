package Test;

import ChromeRunner.Chrome;
import StepObject.SearchPageSteps;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static DataObject.SearchPageData.item;
import static com.codeborne.selenide.Selenide.$;

public class SearchPageTest extends Chrome {
    @Test
    public void search() {
        SearchPageSteps SearchPageSteps = new SearchPageSteps();
        SearchPageSteps.searchvalue()
                .nameitem(item)
                .sortvalue()
                .selectoplionvalue();
        Duration.ofMillis(10000);
        Assert.assertTrue(SearchPageSteps.searchinput.is(Condition.not(Condition.empty)));



        }


    }