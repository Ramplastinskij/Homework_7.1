import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Homework homework = new Homework();
        System.out.println("Homework_7.1");
        System.out.println("Задача 1.");
        homework.task1();
        System.out.println("Задача 2.");
        homework.task2();
        System.out.println("Задача 3.");
        homework.task3();
    }

    static class Homework {
        public void task1() {
        checkLeapYear(2084);
        }

        public void checkLeapYear(int year) {
            if (isLeapYear(year)) {
                System.out.println(year + " год — високосный год");
            } else {
                System.out.println(year + " год — не високосный год");
            }
        }

        public boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }

        public void task2() {
            int osType = 0;
            int clientDeviceYear = 2015;
            suggestAppInstallation(osType, clientDeviceYear);
        }

        public void suggestAppInstallation(int osType, int clientDeviceYear) {
            int currentYear = LocalDate.now().getYear();
            if (clientDeviceYear < 2015) {
                System.out.println(osType == 0 ?
                        "Установите облегченную версию приложения для iOS по ссылке." :
                        "Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println(osType == 0 ?
                        "Установите обычную версию приложения для iOS по ссылке." :
                        "Установите обычную версию приложения для Android по ссылке.");
            }
        }

        public void task3() {
            int deliveryDistance = 95;
            int deliveryDays = calculateDeliveryDays(deliveryDistance);
            System.out.println("Потребуется дней: " + deliveryDays);
        }

        public int calculateDeliveryDays(int distance) {
            if (distance <= 20) return 1;
            else if (distance <= 60) return 2;
            else if (distance <= 100) return 3;
            else return 0;
        }
    }
}