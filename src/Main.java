public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println("задача 1");
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
        System.out.println("общий вес бойцов тип2 : " +  (boxer2Weight % boxerWeight) );


        //задача 8
        System.out.println("задача 8");
        var totalWorkingHours = 640.0;
        var hoursPerDay = 8.0;
        var totalEmployees = totalWorkingHours / hoursPerDay;
        System.out.println( "всего работников компании - " + totalEmployees + "человек");
        System.out.println();
        totalEmployees +=  94;
        System.out.println("если работников " + totalEmployees );
        totalWorkingHours =  totalEmployees * hoursPerDay;
        System.out.println("если в компании рабоает " + totalEmployees + "человек , то всего " + totalWorkingHours + "часов работы может быть поделено между сотрудниками !");

    }
}