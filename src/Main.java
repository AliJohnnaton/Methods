import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2025;
        checkYear(year);

        System.out.println("\nЗадание 2");
        int clientOS = 1;
        int clientDeviceYear = 2014;
        checkOS(clientOS, clientDeviceYear);

        System.out.println("\nЗадание 3");
        int deliveryDistance = 95;
        int days = calculateDays(deliveryDistance);
        if (days > 0) {
            System.out.print("Потребуеться дней на доставку: " + days);
        } else {
            System.out.println("Доставка на дакую дистанцию не возможна");
        }
    }

    public static void checkYear(int year) {
        System.out.print(year + " год - ");
        if (year % 100 == 0 && year % 400 != 0) {
            System.out.print("не високосный");
        } else if (year % 400 == 0) {
            System.out.println("високосный");
        } else if (year % 4 == 0) {
            System.out.println("високосный");
        } else {
            System.out.println("не високосный");
        }
    }

    public static void checkOS(int clientOS, int clientDeviceYear) {

        if (clientOS == 1 && clientDeviceYear >= LocalDate.now().getYear()) {
            System.out.println("Установите версию приложения для Android по ссылке: " +
                    "https//:skachat-samoe-krutoe-prilozhenie-banka.ru/download-app/android/");
        } else if (clientOS == 0 && clientDeviceYear >= LocalDate.now().getYear()) {
            System.out.println("Установите версию приложения для iOS по ссылке: " +
                    "https//:skachat-samoe-krutoe-prilozhenie-banka.ru/download-app/ios/");
        } else if (clientOS == 1) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке: " +
                    "https//:skachat-prilozhenie-banka.ru/download-app-lite/android/");
        } else if (clientOS == 0) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке: " +
                    "https//:skachat-prilozhenie-banka.ru/download-app-lite/ios/");
        }
    }

    public static int calculateDays(int deliveryDistance) {
        System.out.print("Потребуеться дней: ");
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }

}