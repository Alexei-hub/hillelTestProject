import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
public class ForTest {


    @Epic(value = "Математика")
    @Feature(value = "Простые математические операции")
    @Story(value = "Сложение")
    @Test
    @Description(value = "Тест в классе ForTest")
    public void groupTestOne() {
        new MainClass().testMethod(8);
    }

    @Epic(value = "Математика")
    @Feature(value = "Простые математические операции")
    @Story(value = "Вычитание")
    @Test
    public void groupSubTestOne() {
        new MainClass().testMethod(6);
    }
}

