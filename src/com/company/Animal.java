package com.company;

public class Animal {
    //поля
    private  String name;
    private  int age;
    private  boolean isDead;

    //геттеры сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }
    //канструктор
    public Animal(String name, int age, boolean isDead) {
        this.name = name;
        this.age = age;
        this.isDead = isDead;
    }
}
