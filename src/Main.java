public class Main {

    public static void main(String[] args) {
        //задание 1
        System.out.println("Задание 1");
        int age = 8;
        if (age >= 18) {
            System.out.println("Поздравляем! Ты можешь водить");
        } else {
            System.out.println("Придется подождать до совершеннолетия");
        }
        //задание 2
        System.out.println("Задание 2");
        int ageHuman = 8;
        if (ageHuman >= 7 && ageHuman < 18) {
            System.out.println("Завтра в школу");
        }
        if (ageHuman >= 18 && ageHuman < 24) {
            System.out.println("Завтра на пары");
        }
        if (ageHuman >= 24) {
            System.out.println("Завтра на работу");
        }
        //задание 3
        System.out.println("Задание 3");
        int seatsOccupied = 102;
        int allSpace = 120;
        int allseats = 60;
        if (seatsOccupied < allseats) {
            System.out.println("Есть сидячие места");
        }
        if (seatsOccupied >= allseats && seatsOccupied < allSpace) {
            System.out.println("Только стоячие места");
        }
        if (seatsOccupied >= allSpace) {
            System.out.println("Мест нет");
        }
        //задание 3
        System.out.println("Задание 3");
        int age2 = 8;
        if (age2> 2 && age2 < 6) {
            System.out.println("Если возраст" + age2 + ", то нужно ходить в детский сад");
        }
        if (age2> 7 && age2 < 18) {
        System.out.println("Если возраст" + age2 + ", то нужно ходить в школу");
        }
        if (age2> 18 && age2 < 24){
            System.out.println("Если возраст " + age2 + " , то твое место в университете");
        }
        if (age2 > 24) {
            System.out.println("Если возраст " + age2 + " , то Твое место на работе");
        }
        //задание 4
        System.out.println("Задание 4");
        int age3 = 8;
        if (age3< 5) {
            System.out.println("Тебе запрещено кататься на аттракционе");
        }
        if (age3 >= 5 && age3 < 14) {
            System.out.println("Тебе можно кататься на аттракционе только в сопровождении взрослого");
        }
        if (age3 > 14) {
            System.out.println("Тебе можно кататься на аттракционе без сопровождения");
        }
        //задание 5
        System.out.println("Задание 5");
        int one = 1;
        int two = 2;
        int free = 3;
        if (one > two && one > free) {
            System.out.println("Число one - наибольшее");
        }
        if (two > one && two > free) {
            System.out.println("Число two - наибольшее");
        }
        if (free > one && free > two) {
            System.out.println("Число free - наибольшее");
        }
    }
}