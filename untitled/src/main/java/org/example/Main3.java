package org.example;

// 짝수 판별기
//소수 검색 가능
//(약수가 1과 나 자신만 있는 수)
//2,3,5,7,11,13,17,19
//소수 구하기 검색 x
//자바 소수 검색 x
//%

class Main3 {
    public static void main(String[] args) {

        boolean a;
        a = num.OddNum(1);
        System.out.println("소수니 아니니...? : " + a);

    }
}

class num {
    static boolean OddNum(int a) {
        return a % 2 == 0 ;
    }
}
