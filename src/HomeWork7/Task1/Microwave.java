package HomeWork7.Task1;

public class Microwave extends LargeSizeTechnique {
    public Microwave(double power, double workingTimeDay) {
        super(power, workingTimeDay);
    }

    @Override
    public String getName() {
        return "Микроволновая печь";
    }
}
