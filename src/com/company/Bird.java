package com.company;

public class Bird extends Animal {
    //поля
    private String color;
    private boolean canFly;



    public Bird(String name, int age, boolean isDead) {
        super(name, age, isDead);
    }
    public void Fly(){
        System.out.println("iam fly");

    }
    public final void fly(boolean canFly){
        if (!canFly){
            System.out.println("iam not can fly ");
        } else {
            System.out.println("iam fly");
        }
    }
    public void chirik(){
        System.out.println("chirik chirik");
    }


    public void chirik(boolean isGoose){
        if (isGoose){
            System.out.println("ga ga ga");
        }

    }
    //геттеры сеттеры
    public String getColor() {
        return color;
    }

    public boolean isCanFly() {
        return canFly;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "color='" + color + '\'' +
                ", canFly=" + canFly +
                '}';
    }
}
