import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void whenFindMaxElementInArrayThenResultTen() {
        int[] testArr = {5, 4, 3, 10, 1, 2};
        int expected = 10;
        int result = Main.max(testArr);
        assertThat(result, is(expected));
    }

}