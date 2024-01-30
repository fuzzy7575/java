package com.ohgiraffers.section04.scanner;
import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /* 스캐너 next 메소드들은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어온다.
        * 그래서 크게 두 가지 사항을 주의해야 한다.
        * 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값을 입력 받을 때
        * 2. 정수, 실수, 논리값 입력 후 nextLine()로 문자열 입력받을 때
        * */

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력해주세요 : ");
        String str1 = sc.next();   //공백이나 개행문자 전까지 읽어온다.
        System.out.println("str1 : " + str1);

        sc.nextLine();  // 한줄을 읽어온다. (메모리 버퍼 비우기)
        // sc.next()에서 메모리 버퍼에 남아 있는 공백 이후의 문자열을 읽어와서 뒤에서 실행되는 에러를 막기 위함.

        System.out.print("숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();   //정수 값을 읽어온다.
        System.out.println("num1 : " + num1);


        /* 정수, 실수 논리값 입력 후 nextLine()로 문자열 입력받을 때 */
        System.out.print("다시 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();   //정수 값을 읽어온다.
        System.out.println("num2 : " + num2);

        System.out.print("공백이 있는 문자열을 하나 입력해 주세요 : ");
        String str2 = sc.nextLine();
        System.out.println("str2 : " + str2);

        /*
        * 기본형을 읽어오는 메소드 사용 후 바로 문자열을 입력받는 nextLine()을 사용하는 경우
        * 콘솔 입력을 받는 것이 아니라 버퍼에 있는 데이터를 가지고 오기 때문에
        * Enter를 누를 경우 버퍼에 있는 개행문자(\n)를 가지고 오게 된다.
        * 따라서 아무 값도 읽어오지 못한 것과 같은 결과를 출력하게 된다.
        * (개행문자만 출력하고 넘어감.)
        */

    }
}
