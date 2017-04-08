package com.kwanwoo.java.simulation;

/**
 * com.kwanwoo.AnimalSimulator
 * 3개의 Dog 객체, 3개의 Cat 객체, 3개의 Duck 객체, 1개이 Fish 객체를 생성하여
 * 이들을 ArrayList<Animal> 객체에 저장한다.
 *
 * ArrayList<Animal> 객체에 저장된 Animal 객체를 랜덤으로 선택하여 그 객체의 상태를 출력하는
 * 과정을 열번 반복하는 간단한 시뮬레이터 프로그램이다.
 *
 * @see <a href="https://github.com/kwanulee/JavaExample/blob/master/Polymorphism/AnimalSimulator(Interface)/src/com/kwanwoo/java/AnimalSimulator.java">
 *     https://github.com/kwanulee/JavaExample/blob/master/Polymorphism/AnimalSimulator(Interface)/src/com/kwanwoo/java/AnimalSimulator.java</a>
 *
 * 이 버전은 기존 버전에 비해 객체지향적으로 재 구조화된 AnimalSimulator를 사용하였습니다.
 *
 */
public class AnimalSimulatorMain {
    public static void main(String[] args) {
        AnimalSimulator animalSimulator = new AnimalSimulator();
        animalSimulator.initialize();
        animalSimulator.start();
    }
}
