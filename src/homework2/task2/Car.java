package homework2.task2;


import java.util.Random;

public class Car {
    public Car() {
    }



    public static String[] generateRandomWords() {
         Integer numberOfWords = 1;
        String[] randomStrings = new String[numberOfWords];
        Random random = new Random();
        for (int i = 0; i < numberOfWords; i++) {
            char[] word = new char[random.nextInt(8) + 3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
            for (int j = 0; j < word.length; j++) {
                word[j] = (char) ('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }
        return randomStrings;
    }

    public Car createCar(Integer numner) {
        Car car = new Car(numner, "model" + numner,
                new Driver(generateRandomWords(), generateRandomWords(), numner, "exp" + numner));
        return car;
    }

    private int id;
    private String model;
    private Driver driver;


    public Car(int id, String model, Driver driver) {
        this.id = id;
        this.model = model;
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", driver=" + driver +
                '}';
    }
}
