package com.ohgiraffers.section01.array;

public class Application4 {

    public static void main(String[] args) {

        /* [카드뽑기]
        * 1. 문자열 배열에 SPAED, CLOVER, HEART, DIAMOND 를 저장
        * 2. 문자열 배열에 2, 3, 4, 5, 6, 7, 8, 9, 10, JACK, QUEEN, KING, ACE 를 저장
        * 3. 1번과 2번 배열의 길이에 맞도록 난수를 각각 발생 시킨다.
        * 4. 위에서 발생시킨 난수를 활용하여 카드를 출력한다.
        *
        * ====== 출력예시 ======
        * 당신이 뽑은 카드는 DIAMOND 9 카드입니다.
        * */

        String[] shape = {"♠ SPAED", "♣ CLOVER", "♥ HEART", "◆ DIAMOND"};
        String[] no = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        int resultShape = (int)(Math.random() * shape.length);
        int resultNo = (int)(Math.random() * no.length);

        System.out.println("==============================");
        System.out.println("===== 행운의 카드 뽑기 =====");
        System.out.println();
        System.out.println("===== 또로로~ 로~ 또로~~ =====");
        System.out.println();
        System.out.println("===== 오늘의 행운의 카드는? =====");
        System.out.println();
        System.out.println("당신이 뽑은 카드는 ▶▶▶ " + shape[resultShape] + " " + no[resultNo] + " ◀◀◀ 카드입니다.");
        System.out.println();
        System.out.println("==============================");



    }
}
