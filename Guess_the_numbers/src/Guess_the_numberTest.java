import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Guess_the_numberTest {

    @BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void verifyTest() {
     for (int i=1; i <=20; i++){
         Guess_the_number.value = i;
         // testing with number that exist between 1 to 20;
         assertTrue(Guess_the_number.verify(i));
         // testing the number doesn't exist that will be false;
         Guess_the_number.value =0;
         assertFalse(Guess_the_number.verify(i));
     }
    }
}