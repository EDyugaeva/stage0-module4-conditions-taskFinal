package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (month <= 0 || month > 12) {
            System.out.println("invalid date");

        }
        boolean leap;
        if (year % 100 == 0 && year % 400 != 0) {
            leap = false;
        } else if (year % 4 == 0) {
            leap = true;
        }
        else {
            leap = false;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            case 2:
                if (leap) {
                    System.out.println("29");
                    break;
                }
                else {
                    System.out.println("28");
                }
        }

    }
}
