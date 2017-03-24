package com.kwanwoo.java;

/**
 * com.kwanwoo.java.DogSimulator
 * 두 개의 com.kwanwoo.java.Dog 객체를 생성 한 후,
 * 랜덤으로 선택된 com.kwanwoo.java.Dog 객체의 상태를 램덤으로 골라 출력하는 과정을 열번 반복하는
 * 간단한 com.kwanwoo.java.DogSimulator 프로그램입니다.
 *
 * 이 버전은 DogSimulator3에 정의된 버전에 비해, 생성된 com.kwanwoo.java.Dog 객체의 수를 Dog.getCount()
 * 메소드를 통해 받아와 출력하는 코드가 추가되었습니다.
 *
 */
public class DogSimulator {
    public static void main(String [] args) {
        Dog[] dogs = new Dog[10];

        /*
            생성된 Dog 객체의 수를 별도의 count 변수를 이용하는 방법

        int count = 0;

        dogs[0] = new Dog("진도개", "화랑", 3);
        count++;
        dogs[1] = new Dog("삽살개","레오",2);
        count++;
        dogs[2] = new Dog("치와와","예삐",4);
        count++;

        System.out.println("지금까지 생성된 Dog 객체의 수 = " + count);
        */

        dogs[0] = new Dog("진도개", "화랑", 3);
        dogs[1] = new Dog("삽살개","레오",2);
        dogs[2] = new Dog("치와와","예삐",4);

        System.out.println("지금까지 생성된 " +
                "   Dog 객체의 수 = " + Dog.getCount());

        for (int i=0; i<10; i++) {
            Dog dog;
            int dogChoice = (int) (Math.random() * 3);
            dog = dogs[dogChoice];

            System.out.printf("%s(은/는) 현재 %d세의 %s 입니다. ", dog.getName(), dog.getAge(), dog.getType());

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

/**
 * com.kwanwoo.java.Dog 클래스는 필드,생성자, 메소드의 정의 포함합니다
 *
 * 이 버전에서는 DogSimulator2에 정의된 com.kwanwoo.java.Dog 클래스에 static 멤버인 count 변수를 추가하고,
 * count 변수 값을 반환하는 static 멤버인 getCount() 메소드를 추가하였습니다.
 * 특히, 객체가 생성될 때마다 이 count 변수를 증가시키도록 생성자가 구현되어 있습니다.
 */

class Dog {
    private String type;
    private String name;
    private int age;
    private static int count=0;

    public Dog() {
        type = "dog";
        name = "noName";
        age = 0;
        count++;
    }

    public Dog(String t, String n, int a) {
        type = t;
        name = n;
        age = a;
        count++;
    }

    public void bark() {
        System.out.println(name +"(이/가) 짖고 있습니다");
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

    public static int getCount() { return count; }
}
