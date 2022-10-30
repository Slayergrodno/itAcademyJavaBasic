package HomeWork7.Task1;

public class LargeSizeTechnique extends Technique implements Electric {
    double power;
    double workingTimeDay;
    boolean isTurn;

    public LargeSizeTechnique(double power, double workingTimeDay) {
        this.power = power;
        this.workingTimeDay = workingTimeDay;
    }

    public void usageDay() {
        System.out.println("Потребление в сутки, кВт*ч - " +
                (double) Math.round(power * workingTimeDay * 100) / 100);
    }

    public void usageMonth() { // Принято за месяц 30 дней (ориентировочно)
        System.out.println("Потребление в месяц, кВт*ч - " +
                (double) Math.round(power * workingTimeDay * 30 * 100) / 100);
    }

    @Override
    public String getName() {
        return "Крупногабаритная техника";
    }

    @Override
    public void turnOn() {
        this.isTurn = true;
    }

    @Override
    public void turnOff() {
        this.isTurn = false;
    }

    @Override
    public void status() {
        System.out.println(getName() + " в розетке: " + isTurn);
    }
}
