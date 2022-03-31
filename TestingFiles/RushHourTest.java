import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by s7331 on 3/31/2022.
 */
public class RushHourTest {
    @Test
    public void trainTicketFare() throws Exception {

    }

    RushHour c;

    @Before
    public void setup() throws Exception {
        c = new RushHour();
        System.out.print("the test is running successfully");

    }


    @Test
    public void Boundrytest1() {
        String result = c.TrainTicketFare((float) 1.50);
        assertEquals("Full Fare", result);
    }

    @Test
    public void Boundrytest2() {
        String result = c.TrainTicketFare((float) 11);
        assertEquals("Saver Fare ", result);
    }

    @Test
    public void Boundrytest3() {
        String result = c.TrainTicketFare((float) 11.30);
        assertEquals("Saver Fare ", result);
    }

    @Test
            (expected = IllegalArgumentException.class)
    public void Boundrytest4() {
        String result = c.TrainTicketFare((float) -2);
        assertEquals("Saver Fare ", result);
    }



}