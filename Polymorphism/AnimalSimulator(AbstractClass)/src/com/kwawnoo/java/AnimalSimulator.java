package com.kwawnoo.java;

/**
 * com.kwanwoo.java.com.kwawnoo.java.AnimalSimulator
 * 3개의 com.kwanwoo.java.com.kwawnoo.java.Dog 객체, 3개의 com.kwanwoo.java.com.kwawnoo.java.Cat 객체
 * 3개의 com.kwanwoo.java.com.kwawnoo.java.Duck 객체를 생성하여 이들을 com.kwawnoo.java.Animal 객체 배열에 저장한다.
 *
 * com.kwawnoo.java.Animal 객체 배열에서 랜덤으로 선택된 com.kwanwoo.java.com.kwawnoo.java.Animal 객체의 상태를 출력하는
 * 과정을 열번 반복하는 간단한 시뮬레이터 프로그램이다
 *
 * @see <a href="https://github.com/kwanulee/JavaExample/blob/master/Polymorphism/AnimalSimulator(UpDownCasting)/src/com/kwanwoo/java/AnimalSimulator.java">
 *     https://github.com/kwanulee/JavaExample/blob/master/Polymorphism/AnimalSimulator(UpDownCasting)/src/com/kwanwoo/java/AnimalSimulator.java</a>
 *
 * 이 버전은 기존 버전에 비해 com.kwawnoo.java.Animal 클래스와 그의 서브클래스들의 speak() 메소드에 다형성 개념을 적용시킴으로써,
 * com.kwawnoo.java.AnimalSimulator(UpDownCasting) 버전의 46-51 줄의 코드를 아래 코드의 43번째 줄(animal.speak())로 간략화 시킬 수 있다
 */
public class AnimalSimulator {
    public static void main(String[] args) {
        final int MAX_ANIMALS=9;

        Animal[] animals = new Animal[MAX_ANIMALS];

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
                    animal.speak();
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

abstract class Animal {
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
    abstract public void speak();

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

    public void speak() {
        System.out.println(getName()+ "(이/가) 멍멍 하고 있습니다");
    }
}

class Cat extends Animal {
    public Cat() {}
    public Cat(String type, String name, int age) {
        super(type, name, age);
    }

    public void speak() {
        System.out.println("(이/가) 야옹 하고 있습니다");
    }

}

class Duck extends Animal {
    public Duck() {}
    public Duck(String type, String name, int age) {
        super(type, name, age);
    }

    public void speak() {
        System.out.println("(이/가) 꽥꽥 하고 있습니다");
    }

    public void swim() { System.out.println(getName() +"(이/가)  헤엄치고 있습니다"); }

}
