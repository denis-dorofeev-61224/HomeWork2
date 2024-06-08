public class Main {
    public static void main(String[] args) {

        System.out.println("Hello JavaDeveloper!");


            //task1
            double dog = 8.0d;
            double cat = 3.6d;
            long paper = 763_789;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);
            System.out.println("*******");


            //task2
            //прочитав ещё раз условия, И ЕСЛИ я правильно понял рекомендации,нужно:
            //1-вернуться к первоначальным нэймам переменных
            // 2 для того чтобы юзер видел значения(+нам их не запоминать) сохраним разделение"******"
            // Обращаю внимание, что ПРЕДЛОЖЕННЫЙ ВАРИАНТ СОКРАЩАЕТ ЛИСТИНГ ПРОГРАММЫ
            System.out.println(dog+4);
            System.out.println(cat+4);
            System.out.println(paper+4);
            System.out.println("*******");

            //task3
            //обращаю внимание вот на что:условие задачи не совсем корректно,ЕСЛИ ПО УСЛОВИЮ, ТО БУДУТ
            //проводится мат.операции с теми значениями переменных,что были инициализированны в task1
            System.out.println(dog-3.5);
            System.out.println(cat-1.5);
            System.out.println(paper-7639);
            System.out.println("*******");

            //task4
            //здесь сделал согласно рекомендациям,даже не знал,что такая форма записи мат.оп-й существует
            int friend = 19;
            System.out.println(friend);
            friend +=2;
            System.out.println(friend);
            friend /=7;
            System.out.println(friend);
            System.out.println("*******");

            //task5
            //закоммитил старый варик немного не привычно не могу сразу запомнить
            double frog = 3.5d;
            System.out.println(frog);
            //frog = (frog * 10);
            frog *=10;
            System.out.println(frog);
            //frog = (frog / 3.5);
            frog /=3.5;
            System.out.println(frog);
            //frog = (frog + 4);
            frog +=4;
            System.out.println(frog);
            System.out.println("*******");

            //task6
            double m1 = 78.2d;
            double m2 = 82.7d;
            double sum=(m1+m2);
            double diff=(m2-m1);
             System.out.println("Общий вес двух бойцов будет " + (sum) + " кг");
             System.out.println("Разница в весе составляет " + (diff) + " кг");
            //System.out.println("Общий вес двух бойцов будет " + (m1+m2) + " кг");
            //System.out.println("Разница в весе составляет " + (m2 - m1) + " кг");

            //task7
            System.out.println("Остаток от деления будет " + (m2 % m1));
            System.out.println("*******");

            //task8
            int t1 = 640;
            int t2 = 8;
            int peapleInCompany =(t1/t2);
            System.out.println("Всего работников в компании " + (peapleInCompany) + " человек.");
            //System.out.println("Всего работников в компании " + (t1 / t2) + " человек.");
            System.out.println("*******");
            int peaple = 80;
            peaple = 80 + 94;
            System.out.println("Если в компании работает " + (peaple) + " человек,то\n" +
                    "всего " + (t1 / peaple) + " часов работы м.б.поделено м/д сотрудниками.");

        }
    }
