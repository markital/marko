package lesson2;

import java.util.ArrayList;
import java.util.Arrays;

public class User {
    private int id;
    private String name;
    private ArrayList<String> skills = new ArrayList<>();
    private Wallet wallet;
    private Gender gender;




    public User() {

    }

    public User(int id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public User(int id,String name,String skill,int sum,String type) {
        this.id=id;
        this.name=name;
        this.skills.add(skill);
        this.wallet= new Wallet(sum,type);
    }

    public User(int id, String name, ArrayList<String> skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    public User(int id, String name, ArrayList<String> skills, Wallet wallet) {
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.wallet = wallet;
    }

    public User(  int id, String name, int sum, String type,String...skills) {
        this.id=id;
        this.name=name;
        this.wallet=new Wallet(sum,type);
        this.skills.addAll(Arrays.asList(skills));
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

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skills=" + skills +
                ", wallet=" + wallet +
                '}';
    }


    public int getWalletSum() {
        return this.wallet.getSum();

    }

    public void setWalletSum(int newSum) {
        this.wallet.setSum(newSum);
    }

    public void addWalletSumToExistSum(int sum){
            this.wallet.setSum(this.wallet.getSum()+sum);
    }
}