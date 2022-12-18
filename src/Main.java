import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int year = 2022;
        printLeapYear(year);
    }

    public static void printLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год высокосный!");
        } else {
            System.out.println("Год не высокосный!");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        int currentYear = LocalDate.now().getYear();
        checkDivece(1,currentYear);
    }

    public static void checkDivece(int clientOs, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке: ");
        } else if (clientOs == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию прилодения для Android по ссылке: ");
        } else if (clientOs == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке: ");
        } else if (clientOs == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOs по ссылке: ");
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        checkDeliveryDistance(95);
    }
    public static int checkDeliveryDistance(int deliveryDistance){
        int delivery = 0;
        if (deliveryDistance > 1 && deliveryDistance <20) {
            delivery = 1;
        } else
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            delivery = 2;
        } else
        if (deliveryDistance >=60 && deliveryDistance < 100) {
            delivery = 3;
        }
        System.out.println("Потребуется дней: " + delivery);
        return deliveryDistance;
    }
}