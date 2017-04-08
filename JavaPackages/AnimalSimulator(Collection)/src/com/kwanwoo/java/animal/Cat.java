package com.kwanwoo.java.animal;

public class Cat extends Animal implements Speakable, Movable{
    public Cat() {}
    public Cat(String type, String name, int age) {
        super(type, name, age);
    }

    public void speak() {
        System.out.println("(이/가) 야옹 하고 있습니다");
    }
    public void move() { System.out.println(getName()+ "(이/가) 이동 중입니다");}

}
