public class Main {
    public static void main(String[] args) {

            int a=2000000;
            byte b=105;
            short c=9000;
            long d=8890000L;
            float e=1112.15647f;
            double f=19346333389.515151554451;
            System.out.println("Значение переменной а с типом int равно " +  a);
        System.out.println("Значение переменной b с типом byte равно " +  b);
        System.out.println("Значение переменной c с типом short равно " +  c);
        System.out.println("Значение переменной d с типом long равно " +  d);
        System.out.println("Значение переменной e с типом float равно " +  e);
        System.out.println("Значение переменной f с типом double равно " +  f);

        float g=27.12f;
        long q=987678965549L;
        float w=2.786f;
        short r=569;
        short t=-159;
        int j=27897;
        byte k=67;
        System.out.println(g);
        System.out.println(q);
        System.out.println(w);
        System.out.println(r);
        System.out.println(t);
        System.out.println(j);
        System.out.println(k);

        byte ludmilaPavlovna=23;
        short annaSergeevna=27;
        int ekaterinaAndreevna=30;
        long paper=480L;
        double list=(paper)/(ludmilaPavlovna+annaSergeevna+ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + list+ " листов бумаги ");

        byte bottleTwominute=16;
        int bottleOneminute=(bottleTwominute)/(2);
        long bottleTwentyminute=(bottleOneminute)*(20);
        double bottleDay=(bottleOneminute)*1440;
        double bottleThreeday=(bottleDay)*3;
        double bottleMonth=(bottleThreeday)*30;
        System.out.println("За " + " 20 минут " +" машина произвела " + bottleTwentyminute+ " штук бутылок");
        System.out.println("За " + " сутки " +" машина произвела " + bottleDay+ " штук бутылок");
        System.out.println("За " + " 3 дня " +" машина произвела " + bottleThreeday+ " штук бутылок");
        System.out.println("За " + " 1 месяц " +" машина произвела " + bottleMonth+ " штук бутылок");

        byte white=2;
        int brown=4;
        int totalPaints=120;
        int totalKlass=totalPaints/(white+brown);
        int totalWhite=totalKlass*white;
        double totalBrown=totalKlass*brown;
        System.out.println("В школе, где "+ totalKlass+  " классов, нужно " + totalWhite+ " банок белой краски и " + totalBrown+ " банок коричневой краски ");

        byte banan=5;
        byte bananGramm=80;
        long totalBanan=banan*bananGramm;
        short milk=2;
        short milkGramm=105;
        long totalMilk=milk*milkGramm;
        int iceCream=2;
        int icecreamGramm=100;
        int totalIcecream=iceCream*icecreamGramm;
        int egg=4;
        int eggGramm=70;
        int totalEgg=egg*eggGramm;
        double totalGramm=totalBanan+totalMilk+totalIcecream+totalEgg;
        double totalKg=totalGramm/1000;
        System.out.println("Вес завтрака спортсмена " +totalGramm+ " грамм ");
        System.out.println("Вес завтрака спортсмена " +totalKg+ " килограмм ");

        long loseWeight=7000L;
        int gramm250=250;
        int gramm500=500;
        double result250=loseWeight/gramm250;
        double result500=loseWeight/gramm500;
        System.out.println(result250+ " дней понадобится при сбросе веса по 250 грамм в день");
        System.out.println(result500+ " дней понадобится при сбросе веса по 500 грамм в день");

        int masha=67760;
        int denis=83690;
        int kristina=76230;
        int year=12;
        float percent=0.1f;
        float promotionsMasha=masha*percent;
        float promotionsDenis=denis*percent;
        float promotionsKristina=kristina*percent;
        double promotionsmashaYear=(masha+promotionsMasha)*year;
        double promotionsdenisYear=(denis+promotionsDenis)*year;
        double promotionskristinaYear=(kristina+promotionsKristina)*year;
        int mashaYear=masha*year;
        int denisYear=denis*year;
        int kristinaYear=kristina*year;
        double mashaDifference=promotionsmashaYear-mashaYear;
        double denisDifference=promotionsdenisYear-denisYear;
        double kristinaDifference=promotionskristinaYear-kristinaYear;
        System.out.println("Маша теперь получает " + promotionsmashaYear + "рублей. " + "Годовой доход вырос на " + mashaDifference + " рублей ");
        System.out.println("Денис теперь получает " + promotionsdenisYear + "рублей. " + "Годовой доход вырос на " + denisDifference + " рублей ");
        System.out.println("Кристина теперь получает " +  promotionskristinaYear+ "рублей. " + "Годовой доход вырос на " + kristinaDifference + " рублей ");












        }

}