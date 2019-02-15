package pl.mlopatka.util;

import javax.net.ssl.HostnameVerifier;

public enum TimeUnit {
    SECOND(1, "sec(s)"),
    MIN(60, "min(s)"),
    HOUR(3600, "hour(s)"),
    DAY(24 * HOUR.seconds, "day(s)"),
    WEEK(7 * DAY.seconds, "week(s)"),
    MONTH(30 * DAY.seconds, "month(s)"),
    YEAR(365 * DAY.seconds, "year(s)");

    private int seconds;
    private String name;

    TimeUnit(int seconds, String name) {
        this.seconds = seconds;
        this.name = name;
    }

    public int getSeconds() {
        return seconds;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}
