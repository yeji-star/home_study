package org.example;

/* 요구사항
- D4 요구 : 게임의 재미를 위하여 고무오리를 추가하고 날게 하시오.
*/

class Main3 {
    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();

        고무2오리 a고무2오리 = new 고무2오리();
        a고무2오리.날다();
    }
}

class 오리 {
    void 날다() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class 청둥오리 extends 오리 {

}

class 흰오리 extends 오리 {

}

class 고무오리 extends 오리 {
    void 날다() {
        System.out.println("저는 날 수 없음...");
    }
}

class 고무2오리 extends 오리 {

}