package com.kwanwoo.java;

/**
 * DogSimulator
 * 두 개의 Dog 객체를 생성 한 후,
 * 랜덤으로 선택된 Dog 객체의 상태를 램덤으로 골라 출력하는 과정을 열번 반복하는
 * 간단한 DogSimulator 프로그램입니다.
 *
 * 이 버전은 DogSimulator1에 정의된 버전에 비해, Dog 클래스 멤버의 접근제어자 설정된 것을
 * 이용하도록 DogSimulator1 버전을 수정한 것입니다
 *
 */
public class DogSimulator {
    public static void main(String [] args) {
        Dog aDog = new Dog();
        Dog bDog = new Dog("삽살개","레오",2);

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

/**
 * Dog 클래스는 필드,생성자, 메소드의 정의 포함합니다
 * 이 버전은 DogSimulator1에 정의된 Dog 클래스 멤버에 접근 제어자를 추가하였습니다
 * 특히 age, name은 private 멤버이므로, getter, setter 메소드가 추가되었습니다
 */

class Dog {
    String type;
    private String name;
    private int age;

    public Dog() {
        type = "dog";
        setName("noName");
        setAge(0);
    }

    public Dog(String t, String n, int a) {
        type = t;
        setName(n);
        setAge(a);
    }

    public void bark() {
        System.out.println(getName() +"(이/가) 짖고 있습니다");
    }
    public void eat() {
        System.out.println(getName() +"(이/가) 식사 중입니다");
    }
    public void sleep() {
        System.out.println(getName() +"(이/가) 잠자는 중입니다");
    }
    public void move() {
        System.out.println(getName() +"(이/가) 이동 중입니다");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
