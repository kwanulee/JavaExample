package com.kwanwoo.java.simulation;

import com.kwanwoo.java.animal.*;

/**
 * com.kwanwoo.AnimalSimulator
 * 3개의 Dog 객체, 3개의 Cat 객체,3개의 Duck 객체, 1개이 Fish 객체를 생성하여
 * 이들을 Animal 객체 배열에 저장한다.
 *
 * Animal 객체 배열에서 랜덤으로 선택된 Animal 객체의 상태를 출력하는
 * 과정을 열번 반복하는 간단한 시뮬레이터 프로그램이다
 *
 * @see <a href="https://github.com/kwanulee/JavaExample/blob/master/Polymorphism/AnimalSimulator(Interface)/src/com/kwanwoo/java/AnimalSimulator.java">
 *     https://github.com/kwanulee/JavaExample/blob/master/Polymorphism/AnimalSimulator(Interface)/src/com/kwanwoo/java/AnimalSimulator.java</a>
 *
 * 이 버전은 기존 버전에 비해 animal과 simulation 패키지를 생성하여 AnimalSimulator는 simulation 패키지로
 * 나머지는 animal 패키지로 배치시켰다. 이 때, 이전 버전에서는 패키지 접근지정으로 설정된 클래스와 인터페이스를 public으로
 * 선언하고 이들을 각기 다른 java 파일에서 정의하였다
 *
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
