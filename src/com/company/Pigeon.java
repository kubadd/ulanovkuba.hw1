package com.company;

public class Pigeon extends Bird{
    private colorEnum colorEnum;

    public Pigeon(String name, int age, boolean isDead) {
        super(name, age, isDead);
    }

    @Override
    public void Fly() {
        super.Fly();
        System.out.println("iam fly but iam pigeon");
    }
    public void poo(){
        System.out.println("iam poo on the car");
    }
    public com.company.colorEnum getColorEnum(){
        return colorEnum;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "colorEnum=" + colorEnum +
                '}';
    }
}
