package demoqa.test.elements;

import demoqa.Patterns.BaseTest;
import org.junit.Test;

public class WebTableTest extends BaseTest {
    private String email = "kierra@example.com";

    @Test
    public void testWebTable() {
        var webTablePage = homePage.goToElements().clickWebTables();
        webTablePage.clickEdit(email);
        webTablePage.setAge("16");
        webTablePage.clickSubmit();
    }
}
