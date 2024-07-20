//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        //task 1
        System.out.println("task 1");
        byte byteVar = 10;
        short shortVar = 1000;
        int intVar = 10_000;
        long longVar = 100_000;
        float floatVar = 2.5f;
        double doubleVar = 200;


        System.out.println("Значения переменной byteVar с типом byte равно" + byteVar );
        System.out.println("Значения переменной shortVar с типом short равно" + shortVar );
        System.out.println("Значения переменной intVar с типом int равно" + intVar );
        System.out.println("Значения переменной longVar с типом long равно" + longVar );
        System.out.println("Значения переменной floatVar с типом float равно" + floatVar );
        System.out.println("Значения переменной doubleVar с типом double равно" + doubleVar );

        //task 2
        double Var1 = 27.12;
        long Var2 = 987_678_965_549L;
        float Var3 = 2.786f;
        short Var4 = 569;
        short Var5 = -159;
        short Var6 = 27897;
        byte Var7 = 67;

        //task 3
        System.out.println("Task 3");
        int students1 = 23;
        int students2 = 27;
        int students3 = 30;

        int countOfPaper = 480;
        System.out.println("На каждого ученика рассчитано " + (countOfPaper / (students1 + students2 + students3)) +
                " листов бумаги");

        //task 4
        System.out.println("Task 4");
        int performancePerMinute = 8;
        int countOfBottles1 = 20 * performancePerMinute;
        int countOfBottles2 = 1 * 24 * 60 * performancePerMinute;
        int countOfBottles3 = 3 * 24 * 60 * performancePerMinute;
        int countOfBottles4 = 1 * 30 * 24 * 60 * performancePerMinute;

        System.out.println("За 20 минут машина произвела " + countOfBottles1 + " штук бутылок");
        System.out.println("За 1 сутки машина произвела " + countOfBottles2 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + countOfBottles3 + " штук бутылок");
        System.out.println("За 3 месяца машина произвела " + countOfBottles4 + " штук бутылок");

        //Task 5
        System.out.println("Task 5");
        int countOfBottles = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;

        int totalBottlesPerClass = whitePerClass + brownPerClass;
        int countOfClasses = countOfBottles / totalBottlesPerClass;

        int totalCountOfWhiteBottles = countOfClasses * whitePerClass;
        int totalCountOfBrownBottles = countOfClasses * brownPerClass;

        System.out.println("В школе, где " + countOfClasses + " классов, " +
                " нужно " + totalCountOfWhiteBottles + " банок белой краски " +
                " и " + totalCountOfBrownBottles + " банок коричневой краски");

        //Task 6

        System.out.println("Task 6");

        int bananasGr = 5 * 80;
        int milkGr = ( 200 / 100 ) * 105;
        int iceCreamGr = 2 * 100;
        int eggsGr = 4 * 70;

        int sumGr = bananasGr + milkGr + iceCreamGr + eggsGr;
        float sumKg = (float) sumGr / 1000;

        System.out.println("Сумма в граммах = " + sumGr +", в кг " + sumKg);

        //Task 7

        System.out.println("Task 7");

        int weightToLose = 7 * 1000;
        int losePerDay1 = 250;
        int losePerDay2 = 500;

        int countOfDay1 = weightToLose / losePerDay1;
        int countOfDay2 = weightToLose / losePerDay2;


        System.out.println("Колличество дней для похудения если терять по 250грамм: " + countOfDay1);
        System.out.println("Колличество дней для похудения если терять по 500грамм: " + countOfDay2);

        System.out.println("В среднем потребуется" + (countOfDay1 + countOfDay2) / 2 + " дней ");

        //Task 8

        System.out.println("Task 8");
        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;

        int increasedMashaSalary = (int) (mashaSalary * 1.1);
        int increasedDenisSalary = (int) (denisSalary * 1.1);
        int increasedKristinaSalary = (int) (kristinaSalary * 1.1);

        int additionalMoneyPerYearMasha = (increasedMashaSalary - mashaSalary) * 12;
        int additionalMoneyPerYearDenis = (increasedDenisSalary - denisSalary) * 12;
        int additionalMoneyPerYearKristina = (increasedKristinaSalary - kristinaSalary) * 12;

        System.out.println("Маша теперь получает "+ increasedMashaSalary +" рублей. Годовой доход" +
                " вырос на "+ additionalMoneyPerYearMasha +" рублей");
        System.out.println("Денис теперь получает "+ increasedDenisSalary +" рублей. Годовой доход" +
                " вырос на "+ additionalMoneyPerYearDenis +" рублей");
        System.out.println("Кристина теперь получает "+ increasedKristinaSalary +" рублей. Годовой доход" +
                " вырос на "+ additionalMoneyPerYearKristina +" рублей");

        }
    }
