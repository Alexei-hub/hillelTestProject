import io.qameta.allure.*;
import org.testng.annotations.Test;
public class ForTest {


    @Test
    @Owner(value = "Maks")
    public void groupTestOne() {
        new MainClass().testMethod(8);
    }

}

