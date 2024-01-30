package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {

    public static void main(String[] args) {

        /* java.util.Random 클래스를  활용하여 난수 발생
        * java,util,Random 클래스의 nextInt() 메소드를 이용한 난수 발생
        * nextInt(int bound) : 0부터 매개 변수로 전달받은*/

        /* random.nextInt(구하려는 난수 갯수) + 구하려는 난수 최소값 */

        Random random = new Random();

        int randomNum1 = random.nextInt(10);
        System.out.println("0 ~ 9 난수 : " + randomNum1);

        int randomNum2 = random.nextInt(26) + 20;
        System.out.println("20 ~ 45 난수 : " + randomNum2);

    }
}