package HomeWork7.Task1;

public class SmallSizeTechnique extends LargeSizeTechnique {

    public SmallSizeTechnique(double power, double workingTimeDay) {
        super(power, workingTimeDay);
    }
    @Override
    public String getName() {
        return "Мелкогабаритная техника";
    }
}
