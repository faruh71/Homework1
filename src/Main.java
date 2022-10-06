public class Main {
    public static void main(String[] args) {
        task1();
        task12();
        task13();
        task14();
        task21();
        task22();
        task23();
        task31();
        task32();
    }
        public static void task1(){
for ( int i = 10;  i > 0 ;i++  ){
    System.out.println( i);
}

    }
    public static void task12(){
        for ( int i = 10;  i > 0 ;i--  ) {
            System.out.println(i);
        }
    }
    public static void task13(){
        for ( int i = 2;  i < 17 ;i +=2  )
            System.out.println(i);

    }
    public static void task14(){
        for ( int i = 10;  i >= -10 ;i--  ) {
            System.out.println(i);
        }
    }
    public static void task21(){
for (int year =1904 ; year <2096 ; year +=4 )
    System.out.println( year + " год является високосным");

        }
    public static void task22(){
for (int i = 7 ; i <= 98 ; i +=7 ){
    System.out.println( i);
}
        }
    public static void task23(){
for ( int i= 1 ; i <= 512 ; i *= 2 ) {
System.out.println( i);
}
    }
    public static void task31(){
    //Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете
        // откладывать по 29 000 рублей "в банку".
        //Выведите сумму накоплений за каждый месяц в консоль в формате
        // "Месяц … , сумма накоплений равна … рублей" .
int savings =29000;
int total = 0 ;
for (int i = 1 ; i <=12; i++ ){
    total = total + savings ;
    System.out.println( "Месяц "+ i + "сумма накоплений равна " +total + " рублей");
}
        System.out.println(total);
    }
    public static void task32(){
        //Перепишите решение задачи выше при условии, что деньги вы
        // откладывать будете не "в банку", а в банк под проценты – 12% годовых.
        // Выведите сумму накоплений за каждый месяц в консоль в формате
        // "Месяц … , сумма накоплений равна … рублей" .
        int savings =29000;
        int total = 0 ;
        for (int i = 1 ; i <=12; i++ ){
            total =  total/100 + total;
            total = total + savings ;
            System.out.println( "Месяц "+ i + "сумма накоплений равна " +total + " рублей");
        }
        System.out.println(total);
        }

}