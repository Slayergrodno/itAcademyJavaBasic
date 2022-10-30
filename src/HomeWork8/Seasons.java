package HomeWork8;

public enum Seasons {
    Winter("Декабрь, Январь, Февраль", 90),
    Spring("Март, Апрель, Май", 92),
    Summer("Июнь, Июль, Август", 92),
    Autumn("Сентябрь, Октябрь, Ноябрь", 91);

    private final String description;
    private final int countOfDays;

    Seasons(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }
}