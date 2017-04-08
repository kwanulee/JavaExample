package com.kwanwoo.java.simulation;

import com.kwanwoo.java.animal.*;

import java.util.ArrayList;

/**
 * AnimalSimulator
 * ArrayList<Animal> 멤버 변수를 정의하고
 * initalize(), start() 메소로 기존 코드를 재 구조화하였다.
 *
 * 이전 버전에 비해서 좀더 객체지향적으로 코드가 수정된 버전입니다
 *
 */
public class AnimalSimulator {
    ArrayList<Animal> animals = new ArrayList<Animal>();

    public void initialize() {
        animals.add(new Dog("진도개", "화랑", 3));
        animals.add(new Dog("삽살개","레오",2));
        animals.add(new Dog("치와와","예삐",4));

        animals.add(new Cat("페르시안 고양이", "네로", 3));
        animals.add(new Cat("샴 고양이", "나비", 5));
        animals.add(new Cat("레그돌 고양이", "냥이", 2));

        animals.add(new Duck("집오리", "도널드",2));
        animals.add(new Duck("청둥오리", "하늘",2));
        animals.add(new Duck("원앙", "잉꼬",2));

        animals.add(new Fish("금붕어", "니모", 1));
    }

    public void start() {
        for (int i=0; i<10; i++) {

            int choice = (int) (Math.random() * animals.size());
            Animal animal = animals.get(choice);

            System.out.printf("%s(은/는) 현재 %d세의 %s 입니다. ", animal.getName(), animal.getAge(), animal.getType());

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
