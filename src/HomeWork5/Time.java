package HomeWork5;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = Math.abs(hours) % 24;
        this.minutes = Math.abs(minutes) % 60;
        this.seconds = Math.abs(seconds) % 60;
    }

    public Time(int seconds) {
        convertSecondsToTime(seconds);
    }

    private void convertSecondsToTime(int seconds) {
        seconds = Math.abs(seconds);
        this.hours = seconds / 3600 % 24;
        seconds %= 3600;
        this.minutes = seconds / 60;
        this.seconds = seconds % 60;
    }

    public int getSecondFromTime() {
        return this.hours * 3600 + this.minutes * 60 + this.seconds;
    }

    public int compareTo(Time t) {
        int thisTime = getSecondFromTime();
        int otherTime = t.getSecondFromTime();
//      Слишком умная IDEA, первоначально написал if(), она исправила на
//      return Integer.compare(thisTime, otherTime);
//      поэтому оставил только return,
        return (thisTime < otherTime) ? -1 : ((thisTime == otherTime) ? 0 : 1);
    }
}
