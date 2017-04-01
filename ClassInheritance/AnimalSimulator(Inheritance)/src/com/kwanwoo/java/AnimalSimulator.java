package com.kwanwoo.java;

/**
 * Created by kwanwoo on 2017-03-23.
 */
public class AnimalSimulator {
    public static void main(String[] args) {
        final int MAX_DOG=3;
        final int MAX_CAT=3;
        final int MAX_DUCK=3;

        Dog[] dogs = new Dog[MAX_DOG];
        Cat[] cats = new Cat[MAX_CAT];
        Duck[] ducks = new Duck[MAX_DUCK];

        dogs[0] = new Dog("진도개", "화랑", 3);
        dogs[1] = new Dog("삽살개","레오",2);
        dogs[2] = new Dog("치와와","예삐",4);

        cats[0] = new Cat("페르시안 고양이", "네로", 3);
        cats[1] = new Cat("샴 고양이", "나비", 5);
        cats[2] = new Cat("레그돌 고양이", "냥이", 2);

        ducks[0] = new Duck("집오리", "도널드",2);
        ducks[1] = new Duck("청둥오리", "하늘",2);
        ducks[2] = new Duck("원앙", "잉꼬",2);

        for (int i=0; i<9; i++) {

            int choice = (int) (Math.random() * 9);
            if (choice >=0 && choice <=2) {
                Dog dog = dogs[choice];

                System.out.printf("%s(은/는) 현재 %d세의 %s 입니다. ", dog.getName(), dog.getAge(), dog.type);

                int dogAction = (int) (Math.random() * 4) + 1;
                switch (dogAction) {
                    case 1:
                        dog.bark();
                        break;
                    case 2:
                        dog.eat();
                        break;
                    case 3:
                        dog.sleep();
                        break;
                    case 4:
                        dog.move();
                        break;
                }
            } else if (choice >= 3 && choice <=5) {
                Cat cat = cats[choice-3];

                System.out.printf("%s(은/는) 현재 %d세의 %s 입니다. ", cat.getName(), cat.getAge(), cat.type);

                int catAtion = (int) (Math.random() * 4) + 1;
                switch (catAtion) {
                    case 1:
                        cat.meow();
                        break;
                    case 2:
                        cat.eat();
                        break;
                    case 3:
                        cat.sleep();
                        break;
                    case 4:
                        cat.move();
                        break;
                }
            } else if (choice >= 6 && choice <=8) {
                Duck duck = ducks[choice-6];

                System.out.printf("%s(은/는) 현재 %d세의 %s 입니다. ", duck.getName(), duck.getAge(), duck.type);

                int duckAction = (int) (Math.random() * 5) + 1;
                switch (duckAction) {
                    case 1:
                        duck.quack();
                        break;
                    case 2:
                        duck.eat();
                        break;
                    case 3:
                        duck.sleep();
                        break;
                    case 4:
                        duck.move();
                        break;
                    case 5:
                        duck.swim();
                        break;
                }
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
