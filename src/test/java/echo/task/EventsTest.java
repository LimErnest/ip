package echo.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventsTest {

    @Test
    public void testToString() {
        Events event = new Events("work", "11-11-1111 1111", "12-12-1212 1212");
        String expected = event.toString();
        String actual = "[E][ ] work (from: 11 Nov 1111, 11:11:00 am to: 12 Dec 1212, 12:12:00 pm)";
        assertEquals(expected, actual);
    }

    @Test
    public void testToFancyString() {
        Events event = new Events("work", "11-11-1111 1111", "12-12-1212 1212");
        String expected = event.toFancyString();
        String actual = "Event | 0 | work | /from 11-11-1111 1111 /to 12-12-1212 1212";
        assertEquals(expected, actual);
    }
}
