package HomeWork5;
//        1. Создать класс описывающие промежуток времени.
//        Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//        Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов
//        (метод должен работать аналогично compareTo в строках).
//        Создать два конструктора:
//        получающий общее количество секунд получающий часы, минуты и секунды по отдельности.
//        Сделать метод для вывода данных. Прочее на ваше усмотрение.
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
