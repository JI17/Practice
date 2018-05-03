import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TicketLuckyTest {

    @Test
    public void testMyTicketLucky () {
        int expected = 404404;
        assert TicketLucky.isMyTicketLucky(expected);

    }


}