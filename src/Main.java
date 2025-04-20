public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
//Задание №1
        System.out.println("Задание №1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while ( total <= 2459000) {
            month++;
            total += salary;
        }
        System.out.println( "Месяц " + month + ", сумма накоплений равна " + total + " рублей" );
//Задание №2
        System.out.println("Задание №2");
        int number = 0;
        while ( number < 10 ) {
            number++;
            System.out.print( number + " ");
        }
        System.out.println();
        for ( number = 10; number >= 1; number--) {
            System.out.print( number + " ");
        }
        System.out.println();
//Задание №3
        System.out.println("Задание №3");
        int yPopulation = 12000000;
        int birthRate = 17;
        int mortality = 8;
        int totalPopulation = yPopulation;
        for ( int year = 1; year <= 10; year++) {
            totalPopulation += (yPopulation / 1000 * 17) - (yPopulation / 1000 * 8);
            System.out.println("Год " + year + ", численность населения составляет " + totalPopulation);
        }
//Задание №4
        System.out.println("Задание №4");
        int originalАmount = 15000;
        int monthsOfWaiting = 0;
        int totalAmount = originalАmount;
        while (totalAmount <= 12000000) {
            monthsOfWaiting++;
            totalAmount += totalAmount/100*7;
            System.out.println("В конце месяца " + monthsOfWaiting + " Вася накопил " + totalAmount + " рублей");
        }

//Задание №5
        System.out.println("Задание №5");
        originalАmount = 15000;
        monthsOfWaiting = 0;
        totalAmount = originalАmount;
        while (totalAmount <= 12000000) {
            monthsOfWaiting++;
            totalAmount += totalAmount/100*7;
            if ( monthsOfWaiting % 6 == 0 ) {
                System.out.println("В конце месяца " + monthsOfWaiting + " Вася накопил " + totalAmount + " рублей");
            }
        }
//Задание №6
        System.out.println("Задание №6");
        originalАmount = 15000;
        monthsOfWaiting = 0;
        totalAmount = originalАmount;
        for (;;) {
            if (monthsOfWaiting >= 9*12) {
                break;
            }
            monthsOfWaiting++;
            totalAmount += totalAmount/100*7;
            if ( monthsOfWaiting % 6 == 0 ) {
                System.out.println("В конце месяца " + monthsOfWaiting + " Вася накопил " + totalAmount + " рублей");
            }
        }
//Задание №7
        System.out.println("Задание №7");
        int friday = 1;
        for (int i =1 ; i <= 31 ; i++) {
            if ( (i - friday) % 7 == 0 ) {
                System.out.println("«Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет»");
            }
        }
//Задание №8
        System.out.println("Задание №8");
        int periodKometa = 79;
        int currentYear = 2025;
        int oldYear = currentYear - 200;
        int newYear = currentYear + 100;
        for ( int year = 0 ; year <= newYear ; year += periodKometa) {
            if ( year >= oldYear) {
                System.out.println( year);
            }
        }
    }
}