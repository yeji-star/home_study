package org.example;


/// 문제 : 객체를 사용하지 않고 2번째 플레이어를 만들어주세요.

class Main3 {
    public static void main(String[] args) {
        플레이어 a플레이어1;
        a플레이어1 = new 플레이어();
        a플레이어1.나이 = 20;
        a플레이어1.이름 = "홍길동";
        a플레이어1.직업 = "의적";

        플레이어 b플레이어2 = new 플레이어();
        b플레이어2.sc();


    }
}

class 플레이어 {
    int 나이;
    String 이름;
    String 직업;

   void sc() {
        System.out.printf("나이 : %d\n" , 30);
        System.out.printf("이름 : %s\n", "김철수");
        System.out.printf("직업 : %s", "상인");
    }
}

