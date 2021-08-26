package homework2;

import homework2.task1.Gender;
import homework2.task1.Human;
import homework2.task2.Car;
import homework2.task2.Driver;
import homework2.task3.SuperCar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> skills = new ArrayList<>();
        Human human = new Human(1, "vasya", "kok", 21, Gender.MALE, skills);

        ArrayList<String> skills2 = new ArrayList<>();
        skills2.add("html");
        List<Human> humans = Arrays.asList(
                new Human(2, "Ira", "kyk", 33, Gender.FEMALE, skills2),
                new Human(3, "vanya", "ryk", 18, Gender.MALE, skills2),
                new Human(4, "olya", "rok", 37, Gender.FEMALE, skills2),
                new Human(5, "Ivan", "gyk", 30, Gender.MALE, skills2),
                new Human(6, "yula", "gir", 31, Gender.FEMALE, skills2),
                new Human(7, "kolya", "syk", 33, Gender.MALE, skills2),
                new Human(8, "Oksana", "syk", 23, Gender.FEMALE, skills2),
                new Human(9, "Igor", "gak", 25, Gender.MALE, skills2),
                new Human(10, "mars", "iks", 28, Gender.MALE, skills2));

        for (Human humanOne : humans) {
//            System.out.println(humanOne);
        }
        Car car = new Car();
        for (int i = 1; i <= 10; i++) {
            System.out.println(car.createCar(i));
        }
        SuperCar supercar = new SuperCar();
        for (int i = 1; i <= 10; i++) {
            System.out.println(supercar.createSuperCar(i));
        }
    }

}