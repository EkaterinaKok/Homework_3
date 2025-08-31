public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Задача 1");
        int I = 33000;
        System.out.println("Значение переменной I с типом int равно " + I);
        byte B = -120;
        System.out.println("Значение переменной B с типом byte равно " + B);
        short S = 2025;
        System.out.println("Значение переменной S с типом short равно " + S);
        long L = 12345678910L;
        System.out.println("Значение переменной L с типом long равно " + L);
        float F = 2.1234567f;
        System.out.println("Значение переменной F с типом float равно " + F);
        double D = 1.123456789;
        System.out.println("Значение переменной D с типом double равно " + D);
        System.out.println();

        //Task 2
        float f2 = 27.12f;
        long l2 = 987678965549L;
        float f3 = 2.786f;
        short s1 = 569;
        short s2 = -159;
        short s3 = 27897;
        byte b1 = 67;

        //Task 3
        System.out.println("Задача 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short paper = 480;
        int count = paper / (class1 + class2 + class3);
        System.out.println("На каждого ученика рассчитано " + count + " листов бумаги");
        System.out.println();

        //Task 4
        System.out.println("Задача 4");
        byte bottle = 16;
        byte timeFixMin = 2;
        int efficiency1 = bottle * (20 / timeFixMin);
        System.out.println("За 20 минут машина произвела " + efficiency1 + " штук бутылок.");
        int efficiency2 = bottle * ((24 * 60) / timeFixMin);
        System.out.println("За сутки машина произвела " + efficiency2 + " штук бутылок.");
        int efficiency3 = bottle * ((3 * 24 * 60) / timeFixMin);
        System.out.println("За 3 суток машина произвела " + efficiency3 + " штук бутылок.");
        int efficiency4 = bottle * ((30 * 24 * 60) / timeFixMin);
        System.out.println("За месяц машина произвела " + efficiency4 + " штук бутылок.");
        System.out.println();

        //Task 5
        System.out.println("Задача 5");
        byte countCansPaints = 120;
        byte cansWhiteClass1 = 2;
        byte cansBrownClass1 = 4;
        int countClass = countCansPaints / (cansWhiteClass1 + cansBrownClass1);
        int countCansWhite = countClass * cansWhiteClass1;
        int countCansBrown = countClass * cansBrownClass1;
        System.out.println("В школе, где " + countClass + " классов, нужно " + countCansWhite + " банок белой краски и " + countCansBrown + " банок коричневой краски.");
        System.out.println();

        //Task 6
        System.out.println("Задача 6");
        byte countBananas = 5;
        short countMilk = 200;
        byte countSundae = 2;
        byte countEggs = 4;
        int weightBananasGramm = 80 * countBananas;
        int weightMilkGramm = (countMilk / 100) * 105;
        int weightSundaeGramm = 100 * countSundae;
        int weightEggsGramm = 70 * countEggs;
        int caloryGramm = weightBananasGramm + weightMilkGramm + weightSundaeGramm + weightEggsGramm;
        float grammInKg = 1000f;
        float caloryKg = caloryGramm / grammInKg;
        System.out.println("Вес спортзавтрака в граммах равен " + caloryGramm + ", а в килограммах равен " + caloryKg);
        System.out.println();

        //Task 7
        System.out.println("Задача 7");
        byte allKg = 7;
        int allGramm = allKg * 1000;
        short minGramm = 250;
        short maxGramm = 500;
        int countDays1 = allGramm / minGramm;
        int countDays2 = allGramm / maxGramm;
        int days = (countDays1 + countDays2) / 2;
        System.out.println("Если скидывать по " + minGramm + " грамм в день, то потребуется " + countDays1 + " дней.");
        System.out.println("Если скидывать по " + maxGramm + " грамм в день, то потребуется " + countDays2 + " дней.");
        System.out.println("В среднем потребуется " + days + " день.");
        System.out.println();

        //Task 8
        System.out.println("Задача 8");
        int mashaZp = 67760;
        int denisZp = 83690;
        int kristinaZp = 76230;
        float newZpMasha = mashaZp + (mashaZp * 0.1f);
        float newZpDenis = denisZp + (denisZp * 0.1f);
        float newZpKristina = kristinaZp + (kristinaZp * 0.1f);
        float differenceMasha = (newZpMasha * 12) - (mashaZp * 12);
        float differenseDenis = (newZpDenis * 12) - (denisZp * 12);
        float differenseKristina = (newZpKristina * 12) - (kristinaZp * 12);
        System.out.println("Новая зарплата Маши " + newZpMasha + " руб. Годовой доход вырос на " + differenceMasha + " руб.");
        System.out.println("Новая зарплата Дениса " + newZpDenis + " руб. Годовой доход вырос на " + differenseDenis + " руб.");
        System.out.println("Новая зарплата Кристины " + newZpKristina + " руб. Годовой доход вырос на " + differenseKristina + " руб.");


    }
}