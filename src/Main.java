import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача1: ");
        int year = 2021;

        if (calculationYear(year)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static boolean calculationYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void task2() {
        System.out.println("Задача2: ");
        int clientDeviceYear = 2012;
        int clientOS = 0;
        selectionVersion(clientDeviceYear, clientOS);
    }

    public static void selectionVersion(int clientDeviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Введены неверные данные");
        }
    }

    public static void task3() {
        System.out.println("Задача3: ");
        int deliveryDistance = 95;
        System.out.println(calculationDeliveryDays(deliveryDistance));

    }

    public static String calculationDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance <= 100) {
            return "Потребуется дней: " + deliveryDays;
        } else {
            return "Доставки нет";
        }
    }
}
