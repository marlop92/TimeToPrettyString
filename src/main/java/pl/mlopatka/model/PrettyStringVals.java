package pl.mlopatka.model;

import pl.mlopatka.util.TimeUnit;

import java.util.EnumMap;
import java.util.Map;

public class PrettyStringVals {

    private Map<TimeUnit, Integer> unitValues;

    public PrettyStringVals() {
        this.unitValues = new EnumMap<TimeUnit, Integer>(TimeUnit.class);
    }

    public void addTimeUnitVal(TimeUnit unit, int seconds) {
        if(seconds <= 0) {
            return;
        }

        unitValues.put(unit, seconds);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(Map.Entry entry: unitValues.entrySet()){
            str.append(entry.getValue() + " " + entry.getKey());
        }

        return str.toString();
    }
}
