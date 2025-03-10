package org.example;

// 문제 : 1개의 자동차가 3번 달리게 해주세요.

class Main2 {
    public static void main(String[] args) {

        Car a = new Car();
        a.speed = 100;
        a.status();

        System.out.println(a.speed);
        System.out.println(a.speed);
        System.out.println(a.speed);

        Car b = new Car();
        b.speed = 200;
    }
}

class Car {

    int speed;

    void status() {

    }
}