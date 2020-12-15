import io.qameta.allure.Step;

public class MainClass {

    @Step("это тестовый метод")
    public void testMethod(){
        System.out.println("Hello");
    }
}
