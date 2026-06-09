//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 14;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        int temperature = 7;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        int speed = 65;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, придется заплатить штраф");
        }

        int ageOfPerson = 5;
        if (ageOfPerson >= 2 && ageOfPerson <= 6) {
            System.out.println("Если возраст человека равен " + ageOfPerson + ", то ему нужно ходить в детский сад");
        }
        if (ageOfPerson >= 7 && ageOfPerson <= 17) {
            System.out.println("Если возраст человека равен " + ageOfPerson + ", то ему нужно ходить в школу");
        }
        if (ageOfPerson >= 18 && ageOfPerson <= 24) {
            System.out.println("Если возраст человека равен " + ageOfPerson + ", то ему нужно ходить в университет");
        }
        if (ageOfPerson >= 25) {
            System.out.println("Если возраст человека равен " + ageOfPerson + ", то ему нужно ходить на работу");
        }

        int ageOfChild = 15;
        if (ageOfChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему нельзя кататься на аттракционе");
        }
        if (ageOfChild >= 5 && ageOfChild <= 14) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему можно кататься на аттракционе в сопровождении");
        }
        if (ageOfChild > 14) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int numberOfPeopleInTheCarriage = 67;
        if (numberOfPeopleInTheCarriage < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (numberOfPeopleInTheCarriage >= 60 && numberOfPeopleInTheCarriage < 102) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("В вагоне мест нет");
        }

        int one = 7;
        int two = 9;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Самое большое число " + one);
        } else if (two > one && two > three) {
            System.out.println("Самое большое число " + two);
        } else {
            System.out.println("Самое большое число " + three);
        }

    }
}



