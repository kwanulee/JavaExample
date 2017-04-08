package com.kwanwoo.java.animal;

public class Fish extends Animal implements Swimable {
    public Fish() {}
    public Fish(String type, String name, int age) {
        super(type, name, age);
    }
    public void swim() { System.out.println(getName() +"(이/가)  헤엄치고 있습니다"); }
}
