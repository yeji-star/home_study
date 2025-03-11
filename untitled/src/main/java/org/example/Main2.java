package org.example;

// 1부터 n까지 소수의 갯수를 출력하는 함수 만들기

import static org.example.Math.one_to_n_prime_numbers_count;

class Main2 {
    public static void main(String[] args) {
        boolean result = Math.isPrimeNumber(1);
        System.out.println("1은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(2);
        System.out.println("2은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(3);
        System.out.println("3은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(4);
        System.out.println("4은(는) 소수인가? : " + result);

         int rs = one_to_n_prime_numbers_count(10);
        System.out.println("rs : " + rs);
        // rs : 4
        rs = one_to_n_prime_numbers_count(13);
        System.out.println("rs : " + rs);
        // rs :  6

    }
}

class Math {
static boolean isPrimeNumber (int a) {
   return a % 2 == 1 || a % 2 == a || a == 2;
}

static int one_to_n_prime_numbers_count(int a) {
    boolean i;
    int j = 1;
    while (a % 2 == 1 || a % 2 == a || a == 2) {
       i = true;
        j++;
    } return j;
}
}