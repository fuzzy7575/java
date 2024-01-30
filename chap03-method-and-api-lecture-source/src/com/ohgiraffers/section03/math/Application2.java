package com.ohgiraffers.section03.math;

public class Application2 {

    public static void main(String[] args) {

        /* 난수의 활용
        * (int)(Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 최소값
        * */

        int random1 = (int)(Math.random() * 10);   //0~9 까지의 난수 발생
        System.out.println("0~9 난수 : " + random1);

        int random2 = (int)(Math.random() * 10) + 1;   //1~10 까지의 난수 발생
        System.out.println("1~10 난수 : " + random2);

        int random3 = (int)(Math.random() * 6) + 10;   //10~15 까지의 난수 발생
        System.out.println("10~15 난수 : " + random3);

        int random4 = (int)(Math.random() * 9) + 15;   //15~24 까지의 난수 발생
        System.out.println("15~24 난수 : " + random4);

        int random5 = (int)(Math.random() * 32) + 12;   //12~44 까지의 난수 발생
        System.out.println("12~44 난수 : " + random5);

        double random6 = Math.random();   //10~15 까지의 난수 발생
        int random7 = (int) (random6 * 6 + 10);
        System.out.println("0~0.99999 난수 : " + random6);
        System.out.println("10~15 난수 : " + random7);

    }
}
