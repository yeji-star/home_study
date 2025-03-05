package org.example;

// 문제 : 문제 - 1부터 5까지의 합을 출력해주세요.
//문제 - -100부터 25까지의 합을 출력해주세요.

class Main4 {
    public static void main(String[] args) {

        int i = 0;
        int j = 1;

        while (j <= 5) {

            // i = i + j; j++; i = i + j+1; -> 1 = 1 + (1+1);
            i += j;
            j++;

        }

        System.out.println(i);

        System.out.println("for문");

        i = 0;

        for (j = 1; j <= 5; j++) {
            i += j;
        }

        System.out.println(i);


    }
}


