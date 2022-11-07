package HomeWork10;

public class Print {
    void print(String str) {
        if (str == null) {
            throw new NullPointerException("Exception: str - null!");
        }
        System.out.println("На вывод поступил: str - " + str);
    }
}
