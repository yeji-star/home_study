package org.example;

// 문제 변수 활용 버전

class peo {
    public static void main(String[] args) {
        사람인력관리소1 a사람인력관리소 = new 사람인력관리소1();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

        사람1 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람1 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람1 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.
    }
}

class 사람인력관리소1 {
    사람1 a사람0;
    사람1 a사람1;
    사람1 a사람2;


    int 숫자추가 = 0;

    void add사람(String 이름, int 나이) {

        int 번호 = 숫자추가 + 1;

        사람1 a사람 = new 사람1();
        a사람.이름 = 이름;
        a사람.나이 = 나이;
        a사람.번호 = 번호;

        if (번호 == 1) {
            a사람0 = a사람;
        }
        if (번호 == 2) {
            a사람1 = a사람;
        }
        if (번호 == 3) {
            a사람2 = a사람;
        }

        System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n", a사람.나이, a사람.번호, a사람.이름);

        숫자추가++;

    }

    사람1 get사람(int 번호) {

        if (번호 == 1) {
            return a사람0;
        }
        if (번호 == 2) {
            return a사람1;
        }
        if (번호 == 3) {
            return a사람2;
        }

        return null;
    }
}

class 사람1 {
    String 이름;
    int 나이;
    int 번호;

    void 자기소개() {
        System.out.printf("저는 %d번, %s, %d살 입니다.\n", 번호, 이름, 나이);
    }
}