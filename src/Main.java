public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }


    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Клиент пользуется операционной системой IOS");
        }
        if (clientOS == 1) {
            System.out.println("Клиент пользуется операционной системой Android");
        }


    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 1) {
            System.out.println("Клиент пользуется операционной системой IOS");
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 0) {
            System.out.println("Клиент пользуется операционной системой Android");
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 1023;
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");

        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;

        int deliverydays = 1;
        int deliverydays2 = 2;
        int deliverydays3 = 3;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliverydays);
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + deliverydays2);
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + deliverydays3);
        }
        if (deliveryDistance >100) {
            System.out.println("Свыше 100 км доставки нет");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
            System.out.println("Зима");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println(monthNumber + " Такого месяца нет");
        }

    }


}








