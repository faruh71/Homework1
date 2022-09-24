public class Main {
    public static void main(String[] args) {

    }
    public static void task1  () {
        // переменные задача 1
        System.out.println("переменные задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        //задача 2
        System.out.println("задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4 ;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        //задача 3
        System.out.println("задача 3");
        dog = dog -3.5;
        System.out.println(dog);
        cat = cat -1.6;
        System.out.println(cat);
        paper = paper -7639;
        System.out.println(paper);
        //задача 4
        System.out.println("задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //задача 5
        System.out.println("задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog *10;
        System.out.println(frog);
        frog = frog /3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);
        //задача 6
        System.out.println("задача 6");
        var boxerWeight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("общий вес бойцов : " + (boxerWeight + boxer2Weight) );
        System.out.println("разница в весе  : " + (boxer2Weight - boxerWeight) );
        //задача 7
        System.out.println("задача 7");
        System.out.println("разница в весе тип 1 : " + (boxer2Weight - boxerWeight) );
        System.out.println("разница в весе тип2 : " +  (boxer2Weight % boxerWeight) );
        //задача 8
        System.out.println("задача 8");
        var totalWorkingHours = 640.0;
        var hoursPerDay = 8.0;
        var totalEmployees = totalWorkingHours / hoursPerDay;
        System.out.println( "всего рабботников компании - " + totalEmployees + "человек");
        System.out.println();
        totalEmployees +=  94;
        System.out.println("если работников " + totalEmployees );
        totalWorkingHours =  totalEmployees * hoursPerDay;
        System.out.println("если в компании рабоает " + totalEmployees + "человек , то всего " + totalWorkingHours + "часов работы может быть поделено между сотрудникамии !" );


    }

    public static void task2  () {

      //  переменные задача 2
        System.out.println("переменные задача 2" );
 byte by = 12;
 System.out.println("Значение переменной by с типом byte равно  " + by );
 short sho = 32767;
 System.out.println( "Значение переменной sho с типом short равно   " + sho );
int  in = 2147483647;
System.out.println( "Значение переменной in с типом int равно " + in );
long lo = 922337203685475807l;
System.out.println( "Значение переменной lo с типом long равно "+ lo );
float flo = 1.2222222f;
System.out.println( "Значение переменной flo с типом fload равно "  + flo);
double  d = 5.00000000009;
System.out.println( "Значение переменной d с типом  double равно " + d );
        char ch = 33;
System.out.println( "Значение переменной ch- 33 с типом char равно " + ch );
boolean s = by > 5 ;
System.out.println(" Значение переменной s  с типом boolean равно  " + s );

// задание 2
        System.out.println("задание 2");
        byte q = 67 ;
        short w = -159;
        int e = 27897;
        long r = 987678965549l;
        float t = 27.12f;
        double y = 2.786;
        char u = 67;
        boolean i = q > 65;
        System.out.println("byte -  " +q);
        System.out.println("short - " +w);
        System.out.println("int -" +e);
        System.out.println("long - " +r);
        System.out.println("float"+ t);
        System.out.println("double - " + y);
        System.out.println( "char - " + u);
        System.out.println( "boolean - " + i);

        //задача 3
        System.out.println( "задача 3");
        byte classL = 23 ;
        byte classA =  27 ;
        byte classE =  30 ;
        short paper =  480 ;
        System.out.println("На каждого ученика рассчитано " + paper / (classL +classA + classE) + " листов бумаги");

        //задача 4
        System.out.println("задача 4");
        byte bottles = 16 / 2;
        byte time = 20;
       short day = 1440;
        short day3 = 4320;
        int month = 43200 ;
System.out.println( "За 20 мин машины произвела бутылок - "  + bottles * time  + "  штук " );
System.out.println( "За 1 день машины произвела бутылок - "+bottles * day +" штук ");
System.out.println( "За 3 дня машины произвела бутылок   - "+ bottles * day3+ " штук ");
System.out.println( "За 1 месяц машины произвела бутылок - "+bottles * month + " штук ");

//задача 5
        System.out.println("задача 5");
byte paints = 120;
byte paintBrown = 4;
byte paintWhite = 2;
int clas =  paints / paintBrown + paintWhite ;
System.out.println( "В школе, где "+ clas +" классов, нужно "+clas * paintWhite +" банок белой краски и "+ clas  * paintBrown +" банок коричневой краски");

        //задача 6
        System.out.println("задача 6");
       short banana = 80;
               short milk = 105;
                      short maybe = 100;
                               short egg = 70;
banana *= 5;
milk *=2;
maybe *=2;
egg *=4;
        int gramm = banana + milk + maybe + egg;
       int kg = 1000;
      int weight = gramm / kg;
      System.out.println(" вес такого спорт-завтрака - "+ weight + "kg" );


        //задача 7
        System.out.println("задача 7");
        short kg1  = 7 ;
        short gramm1= 250 ;
        short gramm2 = 500;
        kg1 *=1000;
        System.out.println( "если каждый день спортсмен  будет худеть на 250 грамм ,для этого потребуется - " +kg1/gramm1 + " дней");
        System.out.println( "если каждый день  спортсмен будет худеть на 500 грамм ,для этого потребуется - " +kg1/gramm2 + " дней");


        //задача 8
        System.out.println("задача 8");
int maneyM  =67760;
int maneyD  =83690;
int maneyK  =76230;
byte year = 12;
double upManey = 0.10;
 double total = maneyM * upManey;
double total2 = maneyD * upManey;
double total3 = maneyK * upManey;

        System.out.println("Маша теперь получает " +( total + maneyM )+ "рублей в месяц. Годовой доход вырос на " + total * year + " рублей");
        System.out.println("Денис теперь получает " +( total2 + maneyD )+ "рублей в месяц. Годовой доход вырос на " + total2 * year + " рублей");
        System.out.println("Кристина теперь получает " +( total3 + maneyK )+ "рублей в месяц. Годовой доход вырос на " + total3 * year + " рублей");


    }
}