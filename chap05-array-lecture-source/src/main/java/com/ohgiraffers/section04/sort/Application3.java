package com.ohgiraffers.section04.sort;

public class Application3 {

    public static void main(String[] args) {

        /* 버블정렬
        * 인접한 두개의 원소를 검사하여 정렬하는 방법
        * 구현이 쉽다는 장점이 있다.
        * 하지만 다른 정렬에 비해 정렬속도가 느리며,
        * 역순으로 정렬할 때 가장 느린 속도를 가진다.
        * */

//        int[] arr = {3,7,2,4,1,5};
        int[] arr = {5,7,2,8,1,5};

        int temp;

        for(int i = arr.length -1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("[ i" + i + ", j" + j + " ]  " );
                System.out.print(arr[j] + " > " + arr[j+1]);
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
//                    System.out.println("arr[j]: " + arr[j] + ", arr[j+1]: " + arr[j+1]);
                    System.out.println("   O ");
                    System.out.println(arr[j+1] + ", " + arr[j] + "를 " + arr[j] + ", " + arr[j+1] + "로 변경");
                } else {
                    System.out.println("   X ");
                }
                System.out.print(">>>>>  [");
                for(int k = 0; k < arr.length; k++ ) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println("]   <<<<<");
            }
        }
        for(int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");
        }

    }
}
