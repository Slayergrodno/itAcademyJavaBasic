package HomeWork7.Task3;

public class Directorate extends Workers implements Rate {
    double workHours;
    double percent;

    public Directorate(double workHours, double percent) {
        this.workHours = workHours;
        this.percent = percent;
    }

    @Override
    public String getName() {
        return "Дирекция";
    }

    public double getSalary() {
        return HourlyMixPay.hmPay(workHours, percent);
    }

    @Override
    public String getNameSalary() {
        return "Смешанное начисление зарплаты";
    }
}
