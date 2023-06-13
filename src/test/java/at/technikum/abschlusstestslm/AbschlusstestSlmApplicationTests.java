package at.technikum.abschlusstestslm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AbschlusstestSlmApplicationTests {

    @Test
    void contextLoads() {

        class CalculatorMessageControllerTest {

            @Test
            void getSumTest() {
                int number = 9999;
                assertEquals(10, DigitSumApplication.getDigitSum(number));
            }
        }
    }
}