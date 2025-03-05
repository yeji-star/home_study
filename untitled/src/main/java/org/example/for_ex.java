package org.example;

//아래의 코드를 따라친 다음
//결과가 왜 이렇게 나오는가? 를 서술(순차적으로. 한국어로)

class for_ex {
    public static void main(String[] args) {

        int rows = 4; // 이 부분을 바꿔보세요

        //rows란 변수에 4를 입력

        for (int i = 1; i <= rows; i++) {
            // i라는 변수에 1이라는 값을 넣고 rows보다 크거나 같을 때까지 i를 1씩 증가
            for(int k = 1; k <= i; k++) {
                //k라는 변수에 1이라는 값을 넣고 i보다 크거나 같을 때까지 k를 1씩 증가
                System.out.print("* ");
                //k의 결과에 맞춰서 *이 증가
            }
            System.out.println();
            //i의 결과에 맞춰서 줄이 바뀌어짐

            //여기까지 처리 후, 다시 되돌아가기
        }

        System.out.println("while문");

        int i = 1;

        while (i <= rows) {
            int k = 1;
            while (k <= i){
                System.out.print("* " );
                k++;
            }
            System.out.println();
            i++;
        }





    }
}
