package pl.mlopatka.services;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeToTextServiceTest {

    TimeToTextService timeToTextService = new TimeToTextConverter();

    @Test
    public void convertingSeventyFiveSecsShouldReturnProperString() {
        //given
        int secs = 75;

        //when
        String result = timeToTextService.convertToText(secs);

        //than
        assertEquals("1 min(s) 15 sec(s)", result);
    }

    @Test
    public void convertingSixtySecsShouldReturnProperString() {
        //given
        int secs = 60;

        //when
        String result = timeToTextService.convertToText(secs);

        //than
        assertEquals("1 min(s)", result);
    }
}