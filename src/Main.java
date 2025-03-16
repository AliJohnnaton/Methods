public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2025;
        checkYear(year);

        System.out.println("\nЗадание 2");
        int clientOS = 1;
        int clientDeviceYear = 2014;
        secondTask(clientOS, clientDeviceYear);

        System.out.println("\nЗадание 3");
        int deliveryDistance = 95;
        thirdTask(deliveryDistance);
    }

    public static void checkYear(int year) {
        System.out.print(year + " год - ");
        if (year % 100 == 0 && year % 400 != 0)
            System.out.print("не високосный");
        else if (year % 400 == 0)
            System.out.println("високосный");
        else if (year % 4 == 0)
            System.out.println("високосный");
        else System.out.println("не високосный");
    }

    public static void secondTask(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear >= 2015) {
            if (clientOS == 1)
                System.out.println("Установите версию приложения для Android по ссылке: " +
                        "https//:skachat-samoe-krutoe-prilozhenie-banka.ru/download-app/android/");
            else if (clientOS == 0)
                System.out.println("Установите версию приложения для iOS по ссылке: " +
                        "https//:skachat-samoe-krutoe-prilozhenie-banka.ru/download-app/ios/");
            else
                System.out.println("У вас там что Linux что-ли? Или Windows?");
        } else {
            if (clientOS == 1)
                System.out.println("Установите облегчённую версию приложения для Android по ссылке: " +
                        "https//:skachat-prilozhenie-banka.ru/download-app-lite/android/");
            else if (clientOS == 0)
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке: " +
                        "https//:skachat-prilozhenie-banka.ru/download-app-lite/ios/");
            else
                System.out.println("У вас там что BlackBerry что-ли? Или Nokia?");
        }
    }

    public static void thirdTask(int deliveryDistance) {
        System.out.print("Потребуеться дней: ");
        if (deliveryDistance < 20)
            System.out.print(1);
        else if (deliveryDistance < 60)
            System.out.print(2);
        else if (deliveryDistance <= 100)
            System.out.print(3);
        else
            System.out.print("Error, доставка на такую дистанцию не возможна");
    }

}