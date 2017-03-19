/**
 * DogSimulator
 * 이 버전은 두 개의 Dog 객체를 생성 한 후,
 * 랜덤으로 선택된 Dog 객체의 상태를 램덤으로 골라 출력하는 과정을 열번 반복하는
 * 간단한 DogSimulator 프로그램입니다
 */
public class DogSimulator {
    public static void main(String [] args) {
        Dog aDog = new Dog();
        Dog bDog = new Dog("삽살개","레오",2);

        aDog.type = "진도개";
        aDog.name = "화랑";
        aDog.age = 3;

        for (int i=0; i<10; i++) {
            Dog dog;
            int dogChoice = (int) (Math.random() * 2) + 1;
            if (dogChoice == 1)
                dog = aDog;
            else
                dog = bDog;

            System.out.printf("%s(은/는) 현재 %d세의 %s 입니다. ", dog.name, dog.age, dog.type);

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
 */

class Dog {
    String type;    // 개의 종류
    String name;    // 개의 이름
    int age;        // 개의 나이

    Dog() {
        type = "dog";
        name = "noName";
        age = 0;
    }

    Dog(String t, String n, int a) {
        type = t;
        name = n;
        age = a;
    }

    void bark() {
        System.out.println(name+"(이/가) 짖고 있습니다");
    }
    void eat() {
        System.out.println(name+"(이/가) 식사 중입니다");
    }
    void sleep() {
        System.out.println(name+"(이/가) 잠자는 중입니다");
    }
    void move() {
        System.out.println(name+"(이/가) 이동 중입니다");
    }
}

