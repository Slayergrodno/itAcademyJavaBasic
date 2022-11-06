package HomeWork7.Task3;

public class Engineer extends Engineers {
    public Engineer(double workHours) {
        super(workHours);
    }

    @Override
    public String getName() {
        return "Инженерный работник";
    }

    @Override
    public String getNameSalary() {
        return "Почасовая оплата";
    }
}
