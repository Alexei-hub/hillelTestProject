import org.testng.annotations.Test;
//    @BeforeMethod
//    public void before() {
//        Configuration.startMaximized = true;
//        Configuration.timeout = 5000;
//        open("https://rozetka.com.ua/");
//    }

public class ForTest {

    private String shopFromJenkins = System.getenv("param");


    @Test
    public void groupTestOne() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method One. Thread id is: " + id);
        System.out.println(shopFromJenkins);
    }

    @Test
    public void groupTestTwo() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method two. Thread id is: " + id);
    }

    @Test
    public void groupTestThree() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method three. Thread id is: " + id);
    }
}

