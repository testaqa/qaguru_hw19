package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

//    @BeforeEach
//    void beforeEach(){
//        Selenide.open();
//    }

    @AfterEach
    void afterEach(){
        Selenide.closeWebDriver();
    }
}
