package org.example;

// 문제 : 3개의 자동차가 각각 1번씩 달리게 해주세요.

class Main4 {
    public static void main(String[] args) {
        Carr a = new Carr();
        a.name = "현대";
        a.run();

        Carr b = new Carr();
        b.name = "기아";
        b.run();

        Carr c = new Carr();
        c.name = "차주";
        c.run();
    }
}

class Carr {
    String name;
    int speed;

    void run() {
        System.out.printf("%s 자동차가 달립니다.\n",this.name);
    }
}
