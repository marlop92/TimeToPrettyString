package pl.mlopatka.services;

import pl.mlopatka.model.PrettyStringVals;
import pl.mlopatka.util.TimeUnit;

public class TimeToTextConverter implements TimeToTextService {

    public String convertToText(int seconds) {
        PrettyStringVals prettyStringVals = new PrettyStringVals();

        for(TimeUnit unit: TimeUnit.values()) {
            seconds = decrementSeconds(prettyStringVals, unit, seconds);
        }

        return prettyStringVals.toString();
    }

    private int decrementSeconds(PrettyStringVals prettyStrVals, TimeUnit unit, int secs) {
        int unitVal = secs / unit.getSeconds();
        prettyStrVals.addTimeUnitVal(unit, unitVal);

        return unitVal * unit.getSeconds();
    }
}
