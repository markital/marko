package homework2.task1;

import homework2.task1.Gender;
import java.util.ArrayList;

public class Human {
        private int id;
        private String name;
        private String surname;
        private int age;
        private Gender gender;
        private ArrayList<String> skills = new ArrayList<>();




        public Human() {

        }

    public Human(int id, String name, String surname, int age, Gender gender, ArrayList<String> skills) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
    }




    public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", skills=" + skills +
                '}';
    }
}


