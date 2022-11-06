package HomeWork7.Task1;

public class VacuumCleaner extends SmallSizeTechnique {
    public VacuumCleaner(double power, double workingTimeDay) {
        super(power, workingTimeDay);
    }

    @Override
    public String getName() {
        return "Пылесос";
    }
}
