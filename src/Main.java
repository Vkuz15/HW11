
public class Main {

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Год является високосным");
        } else {
            System.out.println(year + " Год не является високосным");
        }
    }


    public static void main(String[] args) {
        task1 ();
    }

    public static void task1(){
        System.out.println("Задание 1");
        int year = 2024;
        checkLeapYear(year);
    }
}