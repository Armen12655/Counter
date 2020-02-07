import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


public class CounterTest {
    private Counter myCounter;

//    @BeforeEach
//    void init() {
//        myCounter = new Counter();
//    }

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        testReporter.publishEntry("Testing" + " " + testInfo.getDisplayName());
        myCounter = new Counter();
    }

    @DisplayName("Checking Constructor is initialised")
    @Test
    void testConstructor() {
        assertEquals(0, myCounter.getCount());
    }

    @DisplayName("Checking Increment method")
    @Test
    void testIncrement() {
        assertEquals(1, myCounter.incrementCount());
    }

    @DisplayName("Checking Decrement method")
    @Test
    void testDecrement() {
        assertEquals(-1, myCounter.decrementCount());
    }

    @DisplayName("Checking Constructor with value")
    @Test
    void testConstructorWithValue() {
        assertThrows(IllegalArgumentException.class, () -> new Counter(-1));
    }
}
