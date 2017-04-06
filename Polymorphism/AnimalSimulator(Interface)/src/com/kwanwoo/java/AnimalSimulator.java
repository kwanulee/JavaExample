package com.kwanwoo.java;

/**
 * com.kwanwoo.java.AnimalSimulator
 * 3개의 com.kwanwoo.java.Dog 객체, 3개의 com.kwanwoo.java.Cat 객체
 * 3개의 com.kwanwoo.java.Duck 객체, 1개의 com.kwanwoo.java.Fish 객체를 생성하여 이들을 com.kwawnoo.java.Animal 객체 배열에 저장한다.
 *
 * com.kwawnoo.java.Animal 객체 배열에서 랜덤으로 선택된 com.kwanwoo.java.Animal 객체의 상태를 출력하는
 * 과정을 열번 반복하는 간단한 시뮬레이터 프로그램이다
 *
 * @see <a href="https://github.com/kwanulee/JavaExample/blob/master/Polymorphism/AnimalSimulator(MethodOverriding)/src/com/kwanwoo/java/AnimalSimulator.java">
 *     https://github.com/kwanulee/JavaExample/blob/master/Polymorphism/AnimalSimulator(MethodOverriding)/src/com/kwanwoo/java/AnimalSimulator.java</a>
 *
 * 이 버전은 기존 버전에 비해 com.kwawnoo.java.Animal 클래스에서 speak(), move 메소드를  추출하여 각각 Speakable, Movable 인터페이스의 메소드로 정의하고,
 * com.kwanwoo.java.Duck 클래스에서 swim() 메소드를 추출하여 Swimable 인터페이스의 메소드로 정의하였다
 * 이는 새로운 Animal의 서브 클래스인 Fish를 추가함에 있어서, Fish 클래스에 필요없는 speak()와 move()를 Animal 클래스로부터 상속받지 않고,
 * Duck 클래스에도 필요한 swim() 메소드를 Swimable 인터페이스에 정의함으로써, 코드의 간결함과 재사용성을 극대화 시켰다
 * 이에 따라 49-74 라인의 코드가 이전버전에 비해서 다소 변경되었음을 확인하기 바란다.
 * 즉 animal 객체 변수가 어떠한 인터페이스 타입인지에 따라서, 해당 인터페이스에 정의된 메소드를 호출하는 방식으로 코드를 간결화 하였다
 */
public class AnimalSimulator {
    public static void main(String[] args) {
        final int MAX_ANIMALS=10;

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

        animals[9] = new Fish("금붕어", "니모", 1);

        for (int i=0; i<10; i++) {

            int choice = (int) (Math.random() * MAX_ANIMALS);
            Animal animal = animals[choice];

            System.out.printf("%s(은/는) 현재 %d세의 %s 입니다. ", animal.getName(), animal.getAge(), animal.type);

            int ation = (int) (Math.random() * 5) + 1;
            switch (ation) {
                case 1:
                    if (animal instanceof Speakable)
                        ((Speakable)animal).speak();
                    else
                        System.out.println("말할수 없습니다");
                    break;
                case 2:
                    animal.eat();
                    break;
                case 3:
                    animal.sleep();
                    break;
                case 4:
                    if (animal instanceof Movable)
                        ((Movable)animal).move();
                    else
                        System.out.println("움직일 수 없습니다");
                    break;
                case 5:
                    if (animal instanceof Swimable)
                        ((Swimable)animal).swim();
                    else
                        System.out.println("헤엄칠수 없습니다");
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

interface Speakable {
    void speak();
}

interface Movable {
    void move();
}

interface Swimable {
    void swim();
}

class Dog extends Animal implements Speakable, Movable{
    public Dog() {}
    public Dog(String type, String name, int age) {
        super(type, name, age);
    }

    public void speak() {
        System.out.println(getName()+ "(이/가) 멍멍 하고 있습니다");
    }
    public void move() { System.out.println(getName()+ "(이/가) 이동 중입니다");}
}

class Cat extends Animal implements Speakable, Movable{
    public Cat() {}
    public Cat(String type, String name, int age) {
        super(type, name, age);
    }

    public void speak() {
        System.out.println("(이/가) 야옹 하고 있습니다");
    }
    public void move() { System.out.println(getName()+ "(이/가) 이동 중입니다");}

}

class Duck extends Animal implements Speakable, Movable, Swimable{
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

class Fish extends Animal implements Swimable {
    public Fish() {}
    public Fish(String type, String name, int age) {
        super(type, name, age);
    }
    public void swim() { System.out.println(getName() +"(이/가)  헤엄치고 있습니다"); }
}
