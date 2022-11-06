package HomeWork7.Task3;

public class Director extends Directorate {

    public Director(double workHours, double percent) {
        super(workHours, percent);
    }

    @Override
    public String getName() {
        return "Директор";
    }
}
