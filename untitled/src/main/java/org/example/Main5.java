package org.example;

// 문제 - 1부터 3까지 출력하는 작업을 10번 해주세요. 2중 while문 사용
class Main5 {
    public static void main(String[] args) {

        // 1부터 3까지 반복하는 반복문 하나, 그걸 또 10번 반복하는 반복문 하나

        int i = 1;

        while (i <= 10) {

            int j = 1;

            while (j <= 3) {
                System.out.println(j);
                j++;
            }
            i++;
        }

        System.out.println("for문");

        for (i = 1; i <= 10; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(j);
            }
        }


    }
}



