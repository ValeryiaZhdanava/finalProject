package helper;
import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "loginName")
    private static Object[][] loginName() {
        return new Object[][] {
                {"Hermoine Granger"},
                {"Harry Potter"},
                {"Ron Weasly"}
        };
    }
}
