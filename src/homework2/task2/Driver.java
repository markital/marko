package homework2.task2;

import java.util.Arrays;

public class Driver {
    private String[] name;


    private String[] surname;
    private int age;
    private String expiriens;

    public Driver(String[] name, String[] surname, int age, String expiriens) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.expiriens = expiriens;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getExpiriens() {
        return expiriens;
    }

    public void setExpiriens(String expiriens) {
        this.expiriens = expiriens;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name=" + Arrays.toString(name) +
                ", surname=" + Arrays.toString(surname) +
                ", age=" + age +
                ", expiriens='" + expiriens + '\'' +
                '}';
    }
}
