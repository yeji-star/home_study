package org.example;

// 문제 변수 활용 버전

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class peo2 {
    public static void main(String[] args) {
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.
    }
}

class 사람인력관리소 {
    //사람[] 사람들 = new 사람[10]; - 배열활용
    // List<사람> 사람들 = new ArrayList<>(); - ArrayList 활용
    Map 사람들 = new HashMap<>();

    int 숫자추가 = 0;

    void add사람(String 이름, int 나이) {

        int 번호 = 숫자추가 + 1;

        사람 a사람 = new 사람();
        a사람.이름 = 이름;
        a사람.나이 = 나이;
        a사람.번호 = 번호;

        //사람들[번호 - 1] = a사람; - 배열활용
        //  사람들.add(a사람); - ArrayList 활용
        사람들.put(번호, a사람);

        System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n", a사람.나이, a사람.번호, a사람.이름);
        숫자추가++;

    }

    사람 get사람(int 번호) {

        //return 사람들[번호 - 1]; - 배열활용
        // return 사람들.get(번호 - 1); - ArrayList 활용
        return (사람) 사람들.get(번호);
    }
}

class 사람 extends 사람인력관리소 {
    String 이름;
    int 나이;
    int 번호;

    void 자기소개() {
        System.out.printf("저는 %d번, %s, %d살 입니다.\n", 번호, 이름, 나이);
    }
}
