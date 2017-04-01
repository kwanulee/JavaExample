package com.kwanwoo.java;

/**
 * Created by kwanwoo on 2017-03-23.
 */
public class AnimalSimulator {
    public static void main(String[] args) {
        final int MAX_ANIMALS=9;

        Animal[] animals = new Dog[MAX_ANIMALS];

        animals[0] = new Dog("진도개", "화랑", 3);
        animals[1] = new Dog("삽살개","레오",2);
        animals[2] = new Dog("치와와","예삐",4);

        animals[0] = new Cat("페르시안 고양이", "네로", 3);
        animals[1] = new Cat("샴 고양이", "나비", 5);
        animals[2] = new Cat("레그돌 고양이", "냥이", 2);

        animals[0] = new Duck("집오리", "도널드",2);
        animals[1] = new Duck("청둥오리", "하늘",2);
        animals[2] = new Duck("원앙", "잉꼬",2);

        for (int i=0; i<9; i++) {

            int choice = (int) (Math.random() * 9);
            Animal animal = animals[choice];

            System.out.printf("%s(은/는) 현재 %d세의 %s 입니다. ", animal.getName(), animal.getAge(), animal.type);

            int ation = (int) (Math.random() * 5) + 1;
            switch (ation) {
                case 1:
                    if (animal instanceof Dog)
                        ((Dog)animal).bark();
                    else if (animal instanceof Cat)
                        ((Cat)animal).meow();
                    else if (animal instanceof Duck)
                        ((Duck)animal).quack();
                    break;
                case 2:
                    animal.eat();
                    break;
                case 3:
                    animal.sleep();
                    break;
                case 4:
                    animal.move();
                    break;
                case 5:
                    if (animal instanceof Duck)
                        ((Duck)animal).swim();
                    else
                        animal.move();
                    break;
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
        System.out.println(name +"(이/가) 식사 중입니다");
    }
    public void sleep() {
        System.out.println(name +"(이/가) 잠자는 중입니다");
    }
    public void move() {
        System.out.println(name +"(이/가) 이동 중입니다");
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
        System.out.println(getName() +"(이/가) 말하고 있습니다: 멍멍");
    }
}

class Cat extends Animal {
    public Cat() {}
    public Cat(String type, String name, int age) {
        super(type, name, age);
    }

    public void meow() { System.out.println(getName() +"(이/가)  말하고 있습니다: 야옹");}

}

class Duck extends Animal {
    public Duck() {}
    public Duck(String type, String name, int age) {
        super(type, name, age);
    }

    public void quack() { System.out.println(getName() +"(이/가)  말하고 있습니다: 꽥꽥");}
    public void swim() { System.out.println(getName() +"(이/가)  헤엄치고 있습니다"); }

}
