package org.example;

// 문제 : -100부터 25까지 출력해주세요.

class Main2 {
    public static void main(String[] args) {
        // 출력

        int i = -100;

        while (i <= 25) {
            System.out.println(i);
            i++;
        }

        System.out.println("\nfor문\n");

        for (i = -100; i <= 25; i++) {
            System.out.println(i);
        }


    }
}