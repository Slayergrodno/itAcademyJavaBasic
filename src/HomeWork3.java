public class HomeWork3 {
    public static void main(String[] args) {
//        1. �������� ����� � ����� ������������� ����������. ����� ������ ����������,
//        �������� �� ��������� ����� ����� �������� � ������� boolean ��������.
        System.out.println("������� 1 - ��������� ����� ����� 7 � ����� 15? " + last7(15));
        System.out.println("������� 1 - ��������� ����� ����� 7 � ����� 17? " + last7(17));

//        2. ������� ������������� ��������� ��������� a � b, ��� a � b � ����� �����. ����������,
//        ����� �� ��� ��������� ������� ������� ��������� �������� r (���� ����� �����).
        System.out.println("������� 2 - ����� �� ������� ������������� 5x9, " +
                "������ �������� 6? " + rectangleIsCircle(5, 9, 6));
        System.out.println("������� 2 - ����� �� ������� ������������� 5x9, " +
                "������ �������� 5? " + rectangleIsCircle(5, 9, 5));

//        3. ������ ����� ����� � ���� ����������, ��� ����� � ����� ����� � ������.
//        ������� ��� ����� �� �����, ������� � ���� ����� ������� � ���������� ������.
        int numberLesson3 = 113;
        rublesPrint(numberLesson3);

//        4. ������ ��� ����� � ����, �����, ���.
//        ������� �� ����� � ���� ���� ����� ���� ���������� ���.
        int day = 28;
        int month = 2;
        int year = 2100;
        nextDayPrint(day, month, year);

//        5. ������� ��� ���� ��������� a �� b � c �� d. ������� ������� ��������� e �� f.
//        ���������, ���������� �� ��� ���� �� ������ �������.
//        ������� ����� � ����������� �������� �������, � ��������� ���������� ����� ���� �����.
        // 1 ��� a �� b
        int a = 10;
        int b = 1;
        // 2 ��� c �� d
        int c = 1;
        int d = 10;
        // ������� e �� f
        int e = 2;
        int f = 10;
        System.out.println("������� 5 - ���� (" + a + "�" + b + " � " + c + "�" + d + ") " +
                "����� ���� ��������� �� ������� (" + e + "�" + f + ")? " + correctHouseOnLand(a, b, c, d, e, f));

//        �������� �����, ������� ������� ���������� �� ������.
//        ������ �� ���� � ����� ���������� ����� ��� ������ � ���������� �� ������ ��,
//        ��� ������������� �� ���� ����.
        weeklyJournalPrint(6);
    }

    public static boolean last7(int number) {
//        1. �������� ����� � ����� ������������� ����������. ����� ������ ����������,
//        �������� �� ��������� ����� ����� �������� � ������� boolean ��������.
        return number % 10 == 7;
    }

    public static boolean rectangleIsCircle(int sideA, int sideB, int radius) {
//        2. ������� ������������� ��������� ��������� a � b, ��� a � b � ����� �����. ����������,
//        ����� �� ��� ��������� ������� ������� ��������� �������� r (���� ����� �����).
        return Math.sqrt(Math.pow(sideA, 2.0) + Math.pow(sideB, 2.0)) < (double) (radius * 2);
    }

    public static void rublesPrint(int number) {
//        3. ������ ����� ����� � ���� ����������, ��� ����� � ����� ����� � ������.
//        ������� ��� ����� �� �����, ������� � ���� ����� ������� � ���������� ������.
        int numberRub = number % 100;
        if (numberRub >= 11 & numberRub <= 14) {
            numberRub = 0;
        }
        switch (numberRub % 10) {
            case 0, 5, 6, 7, 8, 9 -> System.out.println("������� 3 - " + number + " ������");
            case 1 -> System.out.println("������� 3 - " + number + " �����");
            case 2, 3, 4 -> System.out.println("������� 3 - " + number + " �����");
        }
    }

    public static void nextDayPrint(int day, int month, int year) {
//        4. ������ ��� ����� � ����, �����, ���.
//        ������� �� ����� � ���� ���� ����� ���� ���������� ���.
        if (day == 28 && month == 2 && (year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
            day = 1;
            ++month;
            System.out.println("������� 4 - ���� ���������� ���: " + day + "." + month + "." + year);
        } else if (day == 29 && month == 2) {
            day = 1;
            ++month;
            System.out.println("������� 4 - ���� ���������� ���: " + day + "." + month + "." + year);
        } else if (day != 31 || month != 1 && month != 3 && month != 5 && month != 7 && month != 8 && month != 10) {
            if (day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
                day = 1;
                ++month;
                System.out.println("������� 4 - ���� ���������� ���: " + day + "." + month + "." + year);
            } else if (day == 31 && month == 12) {
                day = 1;
                month = 1;
                ++year;
                System.out.println("������� 4 - ���� ���������� ���: " + day + "." + month + "." + year);
            } else {
                ++day;
                System.out.println("������� 4 - ���� ���������� ���: " + day + "." + month + "." + year);
            }
        } else {
            day = 1;
            ++month;
            System.out.println("������� 4 - ���� ���������� ���: " + day + "." + month + "." + year);
        }

    }

    public static boolean correctHouseOnLand(int house1SideA, int house1SideB, int house2SideC, int house2SideD, int landSideE, int landSideF) {
//        5. ������� ��� ���� ��������� a �� b � c �� d. ������� ������� ��������� e �� f.
//        ���������, ���������� �� ��� ���� �� ������ �������.
//        ������� ����� � ����������� �������� �������, � ��������� ���������� ����� ���� �����.
        if (landSideE >= house1SideA + house2SideC && landSideF >= house1SideB && landSideF >= house2SideD) {
            return true;
        } else if (landSideE >= house1SideA + house2SideD && landSideF >= house1SideB && landSideF >= house2SideC) {
            return true;
        } else if (landSideE >= house1SideB + house2SideC && landSideF >= house1SideA && landSideF >= house2SideD) {
            return true;
        } else if (landSideE >= house1SideB + house2SideD && landSideF >= house1SideA && landSideF >= house2SideC) {
            return true;
        } else if (landSideF >= house1SideA + house2SideC && landSideE >= house1SideB && landSideE >= house2SideD) {
            return true;
        } else if (landSideF >= house1SideA + house2SideD && landSideE >= house1SideB && landSideE >= house2SideC) {
            return true;
        } else if (landSideF >= house1SideB + house2SideC && landSideE >= house1SideA && landSideE >= house2SideD) {
            return true;
        } else {
            return landSideF >= house1SideB + house2SideD && landSideE >= house1SideA && landSideE >= house2SideC;
        }
    }

    public static void weeklyJournalPrint(int dayOfWeek) {
//        �������� �����, ������� ������� ���������� �� ������.
//        ������ �� ���� � ����� ���������� ����� ��� ������ � ���������� �� ������ ��,
//        ��� ������������� �� ���� ����.
        switch (dayOfWeek) {
            case 1 -> System.out.println("������� 6 - �����������. ������ ������� ����!");
            case 2 -> System.out.println("������� 6 - �������. ������ ������� ����!");
            case 3 -> System.out.println("������� 6 - �����. ������ ������� ����!");
            case 4 -> System.out.println("������� 6 - �������. ��������� ������� ����!");
            case 5 -> System.out.println("������� 6 - �������. ������� - ������ ��������!");
            case 6 -> System.out.println("������� 6 - �������. ��������! �������!");
            case 7 -> System.out.println("������� 6 - �����������. ������ ��������! ������ �� ������!");
            default -> System.out.println("������� 6 - ����������� ����� ���� ������.");
        }
    }
}

