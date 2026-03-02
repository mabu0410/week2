import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @DisplayName("Kiem Tra Tinh Tong")
    @Test
    void testAdd(){
        int result = calculator.tong(2,3);
        assertEquals(5, result);
    }

    @Test
    void testFactorialZero(){
        assertEquals(1, calculator.f(0));
    }

    @Test
    void testFactorialOne(){
        assertEquals(1, calculator.f(1));
    }

    @Test
    void testFactorialFive(){
        assertEquals(120, calculator.f(5));
    }





}
