package com.ohgiraffers.section03.increment;

public class Application1 {

    public static void main(String[] args) {

        /* 필기.
        * 증감연산자
        * 피연산자의 앞 or 뒤에 사용이 가능하다.
        * '++' : 1 증가의 의미
        * '--' : 1 감소의 의미
        */

        int num = 20;
        System.out.println("num : " + num);

        num++;   //1 증가
        System.out.println("num : " + num);

        ++num;   //1 증가
        System.out.println("num : " + num);

        num--;   //1 감소
        System.out.println("num : " + num);

        --num;   //1 감소
        System.out.println("num : " + num);

        /* 주의사항.
        * 증감연산자는 다른 연산자와 함께 사용할때 의미가 달라진다는 것이다.
        * 다른 연산자와 함께 사용할 때 증감 연산자의 의미
        * 'var++' : 다른 연산을 먼저 진행하고 난뒤 마지막에 피연산자의 값을 1 증가시킴
        * '++var' : 피연산자의 값을 먼저 1을 증가시킨 후 다른 연산을 진행함
        * 'var--' : 다른 연산을 먼저 진행하고 난뒤 마지막에 피연산자의 값을 1 감소시킴
        * '--var' : 피연산자의 값을 먼저 1을 감소시킨 후 다른 연산을 진행함
        */

        int firstNum = 20;

        int result1 = firstNum++ *3;   //다른 연산을 먼저 처리하고 마지막에 증가 처리가 됨

        System.out.println("result1 : " + result1);
        System.out.println("firsrNum : " + firstNum);

        int secondNum = 20;
        int result2 = ++secondNum * 3;   //증가를 먼저 처리하고 난뒤 다른 연산을 함

        System.out.println("result2 : " + result2);
        System.out.println("seconfNum : " + secondNum);

        int num1 = 10;
        int addNum = num1++;
        System.out.println("addNum : " + addNum);
        System.out.println("num1 : " + num1);


        /*
        증감연산자 활용

        제품 제고에 일련번호를 찍을때

        case1.
        반복문을 배열의 인덱스 값을 가져와서 처리 할경우(배열 인덱스는 0부터 시작)

        총10개의 제품까지 한다고 하면

        for(i=0; i < 10; i++;) {
            for 반복문은 i가 0~9 까지 실행되며
            일련번호는 i++로 나중에 증가 되어서 나온 1~10 까지 찍히게 처리
        }

        case2.
        반복문을 DB에 입력된 데이터의 일련번호를 가져와서 처리 할경우

        사용자가 입력한 일련번호 시작값에서 부터 종료값까지
        총10개의 제품까지 한다고 하면

        일련번호 시작 입력값 s = 1001
        일련번호 종료 입력값 e = 1010

        for(i=0; i <= 10; ++i;) {
            for 반복문은 i가 1~10 까지 실행되며
            일련번호는 ++i로 먼저 증가 되어서 나온 1~10 까지 찍히게 처리
        }


        -------------------------------------------------------

        쇼핑몰 주문 시 n개당 배송비와 개인당 구매수 제한이 있을 경우
        전위증감연산자를 사용하여 코드를 간결하게 할 수 있다.

        삼항 연산자 사용
        (고객이 입력한 구매수 > 개인당 구매수 제한)? "개인당 구매 가능한 개수를 초과 하였습니다." : 배송비 계산
        고객이 구매 수량 2개에서 + 버튼을 눌러 3개로 변경 했다고 가정 시
        구매 수량 int n1 = 2;
        (++n1 > 3)? "개인당 구매 가능한 개수를 초과 하였습니다." : 3000 * (Math.round(3 / 2)

         */

    }
}
