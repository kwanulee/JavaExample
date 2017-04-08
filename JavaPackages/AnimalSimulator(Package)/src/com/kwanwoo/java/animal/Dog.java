package com.kwanwoo.java.animal;

public class Dog extends Animal implements Speakable, Movable{
    public Dog() {}
    public Dog(String type, String name, int age) {
        super(type, name, age);
    }

    public void speak() {
        System.out.println(getName()+ "(이/가) 멍멍 하고 있습니다");
    }
    public void move() { System.out.println(getName()+ "(이/가) 이동 중입니다");}
}
