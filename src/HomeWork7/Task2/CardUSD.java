package HomeWork7.Task2;

public class CardUSD extends Cards implements Exchange {

    @Override
    public String getName() {
        return "Валютная карточка USD";
    }

    @Override
    public void setAccount(double account) {
        super.setAccount(account);
    }

    public void transfer(double sum, String currency) {
        double balance = this.getAccount();
        if (balance >= sum) {
            switch (currency) {
                case "eur", "EUR" -> {
                    transferSum(sum);
                    System.out.println("Перечислено по курсу " +
                            (double) Math.round(sum * eurusdBuy * 100) / 100 + " евро.");
                }
                case "byn", "BYN" -> {
                    transferSum(sum);
                    System.out.println("Перечислено по курсу " +
                            (double) Math.round(sum * usdBuy * 100) / 100 + " byn.");
                }
                default -> System.out.println("Нет такой валюты!");
            }
        } else {
            System.out.println("На счету " + this.getName() + " не достаточно средств");
        }
    }
}
