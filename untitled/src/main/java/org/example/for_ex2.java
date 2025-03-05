package org.example;

// 이걸 분석해봐야함...



class for_ex2 {
    public static void main(String[] args) {
        // 출력

        int n = 3;
        //n에 3을 입력

        for (int i = 1; i <= n; i++) {
            // i에 1을 입력, i가 n보다 크거나 같으면 i의 수가 1씩 증가

            for (int j = i; j < n; j++) {
                //j는 i와 수가 같음
                // i = 2; j = 2; 2 < 3; x
                // , j가 n보다 클때까지 j의 수가 1씩 증가
                System.out.print("1");
                //이건 j의 값이기에 그만큼 1이 펼쳐짐
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                //k라는 변수에 1을 입력, k가 i에 2를 곱하고 1을 뺀 수보다 작거나
                //같으면 k를 1씩 증가
                // 1 <= 3;
                // i = 2
                System.out.print("*");
                //k의 값이기에 그만큼 *이 증가
            }


            System.out.println("");
            //i의 값이기에 그만큼 줄을 바꿈
        }

        for (int i = n - 1; i >= 1; i--) {
            //  2;  i가 크거나 같으면 i가 1씩 줄어듬

            for (int k = n; k > i; k--) {
                // k랑 n이 같고, k가 i보다 크면 k가 1씩 줄어듬
                //k = 3; 3 > 2;
                System.out.print("1");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                //k2는 1로 정의,  k가 (2*i-1) 작거나 같으면 k가 1씩 증가
                System.out.print("*");
            }

            System.out.println("");
        }


    }
}
