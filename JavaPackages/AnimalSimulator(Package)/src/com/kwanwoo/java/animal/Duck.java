package com.kwanwoo.java.animal;

public class Duck extends Animal implements Speakable, Movable, Swimable{
    public Duck() {}
    public Duck(String type, String name, int age) {
        super(type, name, age);
    }

    public void speak() {
        System.out.println("(이/가) 꽥꽥 하고 있습니다");
    }
    public void move() { System.out.println(getName()+ "(이/가) 이동 중입니다");}
    public void swim() { System.out.println(getName() +"(이/가)  헤엄치고 있습니다"); }

}
