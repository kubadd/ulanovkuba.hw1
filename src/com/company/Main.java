package com.company;

public class Main {

    public static void main(String[] args) {
        Bird bird = new Bird("Kesha",1,true);
        Pigeon  pigeon= new Pigeon("Frad",2,false);
        Pigeon pigeon1 = new Pigeon("GER",4,true);
        System.out.println(bird.toString()+ pigeon1.toString() + pigeon.toString());
        pigeon.Fly();
        pigeon1.Fly();

    }
}
