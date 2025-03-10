package org.example;

//1. arr1 변수에 [true, false, true] 연결
//2. arr2 변수에 [3.14, 7.77, 11.11] 연결
//3. arr3 변수에 [1~10] 연결
//- 객체 안에 데이터 넣기
//- 해당 객체가 가지고 있는 데이터 전부 출력
//- 3번은 반복문 사용
//- 자바 기본타입
//- 구글링, AI x

class Main {
    public static void main(String[] args) {

        boolean arr1[] = new boolean[3];
        //arr1[] = {true, false, true};

        arr1[0] = true;
        arr1[1] = false;
        arr1[2] = true;

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]+ "\n");

        System.out.printf("%s, %s, %s\n", arr1[0], arr1[1], arr1[2]);

        System.out.println("=====");

        double[] arr2 = new double[3];

        arr2[0] = 3.14;
        arr2[1] = 7.77;
        arr2[2] = 11.11;

        System.out.printf("%.2f, %.2f, %.2f\n", arr2[0], arr2[1], arr2[2]);

        System.out.println("=====");

        // arr3 변수에 [1~10] 연결

        int i;

        int arr3[] = new int[10];

        for (i = 0; i < arr3.length; i++) {
            arr3[i] = i + 1;

            int j;

            j = arr3[i];

            System.out.printf("%d ", j);

        }




    }
}