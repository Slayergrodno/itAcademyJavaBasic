package HomeWork7.Task1;

public class Iron extends SmallSizeTechnique {

    public Iron(double power, double workingTimeDay) {
        super(power, workingTimeDay);
    }

    @Override
    public String getName() {
        return "Утюг";
    }
}
