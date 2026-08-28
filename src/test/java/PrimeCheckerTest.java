import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrimeCheckerTest {

    @Test
    void testNumberLessThanTwo() {
        assertFalse(PrimeChecker.isPrime(1));
    }

    @Test
    void testCompositeNumber() {
        assertFalse(PrimeChecker.isPrime(4));
    }

    @Test
    void testPrimeNumber() {
        assertTrue(PrimeChecker.isPrime(5));
    }
    @Test
    void testNumberZero() {
        assertFalse(PrimeChecker.isPrime(0));
    }
}