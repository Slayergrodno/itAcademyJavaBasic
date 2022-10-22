package HomeWork5;

//Создать класс описывающие Банкомат.
// Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
// количеством купюр номиналом 20, 50, 100. Сделать методы для добавления денег в банкомат.
// Сделать метод, снимающий деньги. С клавиатуры передается сумма денег.
// На экран – булевское значение (операция удалась или нет).
// При снятии денег метод должен выводить на экран каким количеством купюр и какого номинала выдается сумма.
// Создать конструктор с тремя параметрами – количеством купюр. Прочее – на ваше усмотрение.
public class ATM {

    private int coins20;
    private int coins50;
    private int coins100;

    public ATM(int coins20, int coins50, int coins100) {
        this.coins20 = coins20;
        this.coins50 = coins50;
        this.coins100 = coins100;
    }

    public void setCoins20(int coins20) {
        this.coins20 = coins20;
    }

    public void setCoins50(int coins50) {
        this.coins50 = coins50;
    }

    public void setCoins100(int coins100) {
        this.coins100 = coins100;
    }

    //Добавление денег
    public void addCoins(int coins20, int coins50, int coins100) {
        this.coins20 += coins20;
        this.coins50 += coins50;
        this.coins100 += coins100;
        System.out.println("В банкомате: 20 - " + this.coins20 + "; 50 - " + this.coins50 + "; 100 - " + this.coins100 + ".");
    }

    //Boolean выдача денег
    public boolean issue(int sum) {
        boolean result = false;
        if (sum > (coins20 * 20 + coins50 * 50 + coins100 * 100))
            System.out.println("В банкоменте недостаточно средств");
        else {
            int bank20 = 0;
            int bank50 = 0;
            int bank100 = 0;
            int counter = 0;

            for (int i100 = coins100; i100 >= 0; i100--) {
                for (int i50 = coins50; i50 >= 0; i50--) {
                    for (int i20 = coins20; i20 >= 0; i20--) {
                        if (i100 * 100 + i50 * 50 + i20 * 20 == sum) {
                            if (counter == 0) {
                                //Выдача максимальными купюрами
                                System.out.println("Выдача максимальными купюрами:");
                                result = true;
                                bank20 = i20;
                                bank50 = i50;
                                bank100 = i100;
                                printResult(bank20, bank50, bank100);
                                counter++;
                                //Можно было бы и прервать программу но хотел посмотреть все варианты выдачи как работают
                            } else {
                                //Все остальные варианты выдачи! Для информации
                                System.out.println("Следующие варианты выдачи - " + counter + ":");
                                counter++;
                                printResult(i20, i50, i100);
                            }
                        }
                    }
                }
            }
            //Обновление остатков банкнота, учитывается только выдача максимальными деньгами
            setCoins20(coins20 - bank20);
            setCoins50(coins50 - bank50);
            setCoins100(coins100 - bank100);
            if (result)
                System.out.println("В банкомате после выдачи (максимальными купюрами):" +
                        " 20 - " + coins20 + "; 50 - " + coins50 + "; 100 - " + coins100 + ".");

        }
        return result;
    }

    //Печать выдачи
    private void printResult(int bank20, int bank50, int bank100) {
        if (bank20 > 0)
            System.out.println("Выдано купюр 20 - " + bank20);
        if (bank50 > 0)
            System.out.println("Выдано купюр 50 - " + bank50);
        if (bank100 > 0)
            System.out.println("Выдано купюр 100 - " + bank100);
    }

}
