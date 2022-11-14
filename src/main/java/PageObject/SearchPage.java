package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPage {
    public SelenideElement
          searchinput =$("#title-search-input"),
          sort =$(".jq-selectbox__select"),
          selectoption=$(By.xpath("/html/body/div[3]/div[2]/div/div[3]/section/div/div[2]/div[2]/div[1]/div/div[2]/ul/li[4]"));





}
