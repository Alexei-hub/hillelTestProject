import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class CategoryPageLogic extends CategoryPageElements {

    public SearchPageLogic clickCategory(SelenideElement element){
        element.shouldBe(Condition.visible).click();
        return page(SearchPageLogic.class);
    }
}
