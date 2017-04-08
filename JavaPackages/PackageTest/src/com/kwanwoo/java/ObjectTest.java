package com.kwanwoo.java;

/**
 * Object 클래스의 equals(), toString() 메소드를 테스트하는 코드
 */
public class ObjectTest {
    public static void main(String[] args) {
        Point a = new Point(2,3);
        System.out.println(a.toString());
        System.out.println(a); // a는 a.toString()으로 자동 변환됨

        Point b = new Point(2,3);
        Point c = a;

        if(a == b) System.out.println("a==b");
        if(a == c) System.out.println("a==c");
        if(a.equals(b)) System.out.println("a is equal to b");
        if(a.equals(c)) System.out.println("a is equal to c");

    }
}

class Point {
    int x, y;
    public Point(int x, int y) {
        this.x = x; this.y = y;
    }

    public boolean equals(Point p) {
        if(x == p.x && y == p.y) return true;
        else return false;
    }

    public String toString() {
        return "Point(" + x + "," + y + ")";
    }
}
