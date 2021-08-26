package homework2.task3;

import java.util.Random;

public class SuperCar {
    private String model;
    private String producer;
    private int year;
    private Engine engine;

    public SuperCar() {
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

    public SuperCar createSuperCar(int number) {
        SuperCar superCar = new SuperCar("model" + number,"producer"+ number,1990,
                new Engine("model",10,20));
        return superCar;
    }


    public SuperCar(String model, String producer, int year, Engine engine) {
        this.model = model;
        this.producer = producer;
        this.year = year;
       this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "SuperCar{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", year=" + year +
                ", Engine='" + engine + '\'' +
                '}';
    }
}
