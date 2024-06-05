public class Main {
    public static void main(String[] args) {
        System.out.println("Hello JavaDeveloper!");

        //task1
        double dog=8.0f;
        double cat=3.6d;
        long paper=763_789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("*******");


        //task2
        //т.к.переменные объявлены и инициализированы ранее, и непонятно из условия требуется ли
        //сохранить первоначальные значения при выводе,то=>ввожу дополнительные перем.-е для того
        //чтобы были в консоли видны первоначальные значения и новые
        double dog2=(dog+4);
        double cat2=(cat+4);
        long paper2=(paper+4);
        System.out.println(dog2);
        System.out.println(cat2);
        System.out.println(paper2);
        System.out.println("*******");

        //task3
        double dog3=(dog2-3.5);
        double cat3=(cat2-1.6);
        long paper3=(paper2-7639);
        System.out.println(dog3);
        System.out.println(cat3);
        System.out.println(paper3);
        System.out.println("*******");

        //task4
        int friend=19;
        System.out.println(friend);
        friend=(friend+2);
        System.out.println(friend);
        friend=(friend/7);
        System.out.println(friend);
        System.out.println("*******");

        //task5
        double frog=3.5d;
        System.out.println(frog);
        frog=(frog*10);
        System.out.println(frog);
        frog=(frog/3.5);
        System.out.println(frog);
        frog=(frog+4);
        System.out.println(frog);
        System.out.println("*******");

        //task6
        double m1=78.2d;
        double m2=82.7d;
        System.out.println("Общий вес двух бойцов будет "+(m1+m2)+" кг");
        System.out.println("Разница в весе составляет "+(m2-m1)+" кг");
        System.out.println("*******");

        //task7
        System.out.println("Остаток от деления будет "+(m2%m1));
        System.out.println("*******");

        //task8
        int t1=640;
        int t2=8;
        System.out.println("Всего работников в компании "+(t1/t2)+" человек.");
        System.out.println("*******");
        int peaple=80;
        peaple=80+94;
        System.out.println("Если в компании работает "+(peaple)+" человек,то\n" +
                "всего "+(t1/peaple)+" часов работы м.б.поделено м/д сотрудниками.");


    }
}