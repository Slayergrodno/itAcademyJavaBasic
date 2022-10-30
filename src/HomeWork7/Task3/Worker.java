package HomeWork7.Task3;

public class Worker extends Workers{
    double workHours;
    double percent;

    public Worker(double workHours, double percent) {
        this.workHours = workHours;
        this.percent = percent;
    }

    @Override
    public String getName() {
        return "Рабочие";
    }

    @Override
    public String getNameSalary() {
        return "Процентная оплата";
    }
}
