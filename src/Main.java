public class Main {
    public static void main(String[] args) {
        // Задача 1
        int age1 = 17;
        if (age1 >= 18) {
            System.out.println("Ты можешь водить");
        } else {
            System.out.println("Ты не можешь водить");
        }
        //задача 2
        int age2 = 14;

        if (age2 >= 7 && age2 < 18) {
            System.out.println("ребенок ходит в школу ");
        } else {
            System.out.println(" Не ходит в школу ");
        }
        if (age2 >= 18 && age2 < 24) {
            System.out.println("человек уже закончил школу и может отправляться в университет ");

        }
        if (age2 > 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
            ;
        }
        // Задача 3
        int train = 102;
        int stand = 60;
        int sitting = train - stand;
        int stand1 = 60;
        int sitting2 = 40;
        if (stand1 < stand) {
            System.out.println("сидячии места есть " + (stand - stand1) + " ШТ ");
        } else {
            System.out.println("идячих мест нет");
        }
        if (sitting2 < sitting) {
            System.out.println("Стоячие места есть " + (sitting - sitting2));
        } else {
            System.out.println("стоячих мест нет");
        }
        // Задача 4
        int a = 54;
        if (a > 2 && a < 6) {
            System.out.println("ходит в садик");
        }
        if (a > 7 && a < 18) {
            System.out.println(" Ходит в школу");
        }
        if (a >= 18 && a < 24) {

            System.out.println("Ховит в универ");
        }

        if (a >= 24) {
            System.out.println(" На работу ");
        }

        int c = 13;
        if (c < 5) {
            System.out.println("Может кататься на атракционе");

        } else if (c < 14) {
            System.out.println("может кататься в сопровождении взрослого");
        } else {
            System.out.println("Может кататься без сопровождения");
        }
        int one = 200;
        int two = 100;
        int three = 150;
        if (one > two) {
            if (one >= three) {
                System.out.println("самое больше число " + one);
            } else {
                System.out.println("самое больше число " + three);
            }

        } else if (two > one) {
            if (two >= three) {
                System.out.println("самое больше число " + two);

            } else {
                System.out.println("самое больше число " + three);
            }


        } else if (three > one) {
            if (three >= two) {
                System.out.println("самое больше число " + three);
            } else {
                System.out.println("самое больше число " + two);
            }
        }

















    }
}