package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

public class TestAssertion {
    @Test
    @Feature("Some feature")
    @Severity(SeverityLevel.CRITICAL)
    @Step
    void assertion() {

        assertAll("demo assertions",
                () -> {
                    assertEquals(1, 2);
                },
                () -> assertEquals(1, 1),
                () -> assertEquals(1, 3)
        );

        System.out.println("xxx");

        assertAll("demo assertions",
                () -> assertEquals(4, 2),
                () -> assertEquals(1, 1),
                () -> assertEquals(4, 3)
        );
    }
}
