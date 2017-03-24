package com.kwanwoo.java;

/**
 * Created by kwanwoo on 2017-03-24.
 */
public class DogSimulator {
    public static void main(String[] args) {
        Dog aDog = new Dog();
        Dog bDog = new Dog("삽살개", "레오",2);

        aDog.type = "진도개";
        aDog.setName("화랑");
        aDog.setAge(3);

        for (int i=0; i<10; i++) {
            Dog dog;
            int dogChoice = (int) (Math.random() * 2) + 1;
            if (dogChoice == 1)
                dog = aDog;
            else
                dog = bDog;

            System.out.printf("%s(은/는) 현재 %d세의 %s 입니다. ", dog.getName(), dog.getAge(), dog.type);

            int dogAction = (int) (Math.random() * 4) + 1;
            switch (dogAction) {
                case 1:
                    dog.bark(); break;
                case 2:
                    dog.eat(); break;
                case 3:
                    dog.sleep(); break;
                case 4:
                    dog.move(); break;
            }
        }
    }
}

class Animal {
    protected String type;
    private String name;
    private int age;

    public Animal() {
        this("TBD","TBD",0);
    }

    public Animal(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(type+":"+name +"(이/가) 식사 중입니다");
    }
    public void sleep() {
        System.out.println(type+":"+name +"(이/가) 잠자는 중입니다");
    }
    public void move() {
        System.out.println(type+":"+name +"(이/가) 이동 중입니다");
    }

    public String getType() { return type; }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setType(String type) { this.type = type;}
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

class Dog extends Animal {
    public Dog() {}
    public Dog(String type, String name, int age) {
        super(type, name, age);
    }
    public void bark() {
        System.out.println(type+":"+getName() +"(이/가) 짖고 있습니다");
    }
}
