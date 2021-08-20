package lesson2;


import java.util.ArrayList;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
         ArrayList<String> skills= new ArrayList<>();
         skills.add("java");
        skills.add("js");
        Wallet wallet =new Wallet(100000,  "leather");
        User user= new User(1,"vasya",skills,wallet);
       System.out.println( user.getWallet().getSum());
       //user.getWallet().setSum(20000);
       //System.out.println(user.getWallet().getSum());
       //user.getWallet().setSum(user.getWallet().getSum()+15000);
        //System.out.println( user.getWallet().getSum());

         System.out.println(user.getWalletSum());
         user.setWalletSum(100000);
         System.out.println(user.getWalletSum());
         user.addWalletSumToExistSum(15000);
         System.out.println(user.getWalletSum());

        ArrayList<String> skills2= new ArrayList<>();
        skills2.add("html");
         User user2=new User(2,"kokos",skills2, new Wallet(5000,"cotton"));
         User user3=new User(  3,"abricos", "mysql",50000,"cotton-leather");
         User user4=new User(4, "john",1000,"leather","java","js","html");
         User user5=new User(5,"nax",Gender.MALE);

}}
