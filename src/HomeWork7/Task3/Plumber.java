package HomeWork7.Task3;

public class Plumber extends Worker {
    public Plumber(double workHours, double percent) {
        super(workHours, percent);
    }

    @Override
    public String getName() {
        return "Рабочая специальность";
    }

    public double getSalary() {
        return PercentPay.Pay(workHours, percent);
    }

    @Override
    public String getNameSalary() {
        return "Процентная оплата";
    }
}
