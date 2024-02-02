import java.time.LocalDate;

public class Main {

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Год является високосным");
        } else {
            System.out.println(year + " Год не является високосным");
        }
    }

    public static void installingTheApplication(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            System.out.println("Установите версию для iOS по ссылке");
            if (clientDeviceYear <= 2014) {
                System.out.println("Установите облегченную версию для iOS по ссылке");
            }
        } else {
            System.out.println("Установите версию для Android по ссылке");
            if (clientDeviceYear <= 2014) {
                System.out.println("Установите облегченную версию для Android по ссылке");
            }
        }
    }

    public static void main(String[] args) {
        task1 ();
        task2 ();
    }

    public static void task1(){
        System.out.println("Задание 1");
        int year = 2024;
        checkLeapYear(year);
    }

    public static void task2() {
        System.out.println("Задание 2");
        int clientOS = 1;
        int currentYear = LocalDate.now().getYear();
        installingTheApplication(clientOS,currentYear);
    }
}