package HomeWork7.Task1;

public class Fridge extends LargeSizeTechnique {

    public Fridge(double power, double workingTimeDay) {
        super(power, workingTimeDay);
    }

    @Override
    public String getName() {
        return "Холодильник";
    }
}
