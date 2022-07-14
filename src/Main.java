public class Main {
    public static void main(String[] args) {
        // Задание 1
        int clientOS = 0;
        if (clientOS ==0 ) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else
                System.out.println("Установите версию приложения для Android по ссылке");


        // Задание 2
        int clientDeviceYear = 2018;
        int clientOS2 = 1;
        if (clientOS2 == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else
            if (clientOS2 == 0 && clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        if (clientOS2 == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else
            if (clientOS2 == 1 && clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }

        // Задание 3
        int year = 2021;
        if (year % 4 ==0 && year % 100 != 0 || year % 400 ==0) {
            System.out.print(year + " год является високосным");
        } else
            System.out.println(year + " год не является високосным");


        // Задание 4

        int deliveryDistance = 168;
        int days = deliveryDistance / 40;

        if (days == 1 || days % 10 == 1) {
            System.out.println("Доставка займет " + days + " день");
        }
        if (days % 10 < 5) {
            System.out.println("Доставка займет " + days + " дня");
        } else
            System.out.println("Доставка займет " + days + " дней");

        // Задание 5

        int monthNumber = 10;
        switch(monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(" Зима! ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Веснв! 2");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Лето! 3");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Осень! 4");
            default:  System.out.println(" ошибка");
        }








    }
}