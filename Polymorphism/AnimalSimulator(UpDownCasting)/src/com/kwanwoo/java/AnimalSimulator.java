package com.kwanwoo.java;

/**
 * com.kwanwoo.java.AnimalSimulator
 * 3개의 com.kwanwoo.java.Dog 객체, 3개의 com.kwanwoo.java.Cat 객체
 * 3개의 com.kwanwoo.java.Duck 객체를 생성하여 이들을 모두 Animal 객체 배열에 저장한다.
 *
 * Animal 객체 배열에서 랜덤으로 선택된 com.kwanwoo.java.Animal 객체의 상태를 출력하는
 * 과정을 열번 반복하는 간단한 시뮬레이터 프로그램이다.
 *
 * 이 버전은 기존 버전 (https://github.com/kwanulee/JavaExample/blob/master/ClassInheritance/AnimalSimulator(Inheritance)/src/com/kwanwoo/java/AnimalSimulator.java)
 * 에 비해, Dog, Cat, Duck 객체들을 위한 배열을 따로 관리하는 대신에 Dog, Cat, Duck의 수퍼클래스인 Animal 타입의
 * 객체 배열에 Dog, Cat, Duck 객체들을 저장하고 사용한다.
 *
 * Animal 객체배열에 저장된 객체가 어떠한 타입의 객체인지를 알기 위해서 instanceof 연산자를 사용했고
 * 해당 객체의 고유한 메소드를 이용하기 위해서 각 타입별로 다운캐스팅하여 사용하였다
 */
public class AnimalSimulator {
    public static void main(String[] args) {
        final int MAX_ANIMALS=9;

        Animal[] animals = new Animal[MAX_ANIMALS];     // Animal 타입의 객체 배열 생성

        animals[0] = new Dog("진도개", "화랑", 3);
        animals[1] = new Dog("삽살개","레오",2);
        animals[2] = new Dog("치와와","예삐",4);

        animals[3] = new Cat("페르시안 고양이", "네로", 3);
        animals[4] = new Cat("샴 고양이", "나비", 5);
        animals[5] = new Cat("레그돌 고양이", "냥이", 2);

        animals[6] = new Duck("집오리", "도널드",2);
        animals[7] = new Duck("청둥오리", "하늘",2);
        animals[8] = new Duck("원앙", "잉꼬",2);

        for (int i=0; i<10; i++) {

            int choice = (int) (Math.random() * 9);
            Animal animal = animals[choice];

            System.out.printf("%s(은/는) 현재 %d세의 %s 입니다. ", animal.getName(), animal.getAge(), animal.type);

            int ation = (int) (Math.random() * 5) + 1;
            switch (ation) {
                case 1:
                    if (animal instanceof Dog)          // animal이 Dog 객체인지 판별
                        ((Dog)animal).bark();           // animal을 Dog 타입으로 다운캐스팅
                    else if (animal instanceof Cat)     // animal이 Cat 객체인지 판별
                        ((Cat)animal).meow();           // animal을 Cat 타입으로 다운캐스팅
                    else if (animal instanceof Duck)    // animal이 Duck 객체인지 판별
                        ((Duck)animal).quack();         // animal을 Duck 타입으로 다운캐스팅
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
                    if (animal instanceof Duck)         // animal이 Duck 객체인지 판별
                        ((Duck)animal).swim();          // animal을 Duck 타입으로 다운캐스팅
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
