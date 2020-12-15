import io.qameta.allure.Step;

public class MainClass {

    @Step("это тестовый метод c пеменой count равной {count}")
    public void testMethod(int count){
        System.out.println(count);
    }
}
