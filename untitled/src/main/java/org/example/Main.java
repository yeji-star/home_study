package org.example;

// 문제 : 1부터 5까지 출력해주세요.

class Main {
    public static void main(String[] args) {

        int i = 1;

        while ( i <= 5 ) {

            System.out.println(i);

            i++;
        }

        System.out.println("\nfor문\n");

        for(i=1;i<=5;i++){
            System.out.println(i);
        }

        // 출력
        // 1
        // 2
        // 3
        // 4
        // 5
    }
}