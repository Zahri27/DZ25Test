import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTest {
    @Test
    public void testCalculateAverage() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] testArray = {1, 2, 3, 4, 5};
        double expectedAverage = 3.0;
        double actualAverage = arrayOperations.calculateAverage(testArray);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }
}
