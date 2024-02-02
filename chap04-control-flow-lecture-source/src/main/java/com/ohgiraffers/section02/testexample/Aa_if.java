package com.ohgiraffers.section02.testexample;

import java.util.Scanner;

public class Aa_if {
    public void testExample5Statement() {

        /*실습문제 1. */
        /* 판다가 축제 아르바이트를 시작했습니다.
         * 맥주를 판매하려면 성인인지 확인을 해야 해요.
         *
         * '나이가 어떻게 되세요?'를 출력하고 나이(정수)를 입력받아, 성인이면 '판매 가능합니다.'를 출력하고,
         * 미성년자이면 '판매 불가능합니다. 음료 코너에서 골라주세요.' 를 출력하세요.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("나이가 어떻게 되세요? ");
        int age = sc.nextInt();

        if (age > 19) {
            System.out.println("판매 가능합니다. ");
        } else {
            System.out.println("판매 불가능합니다. 음료 코너에서 골라주세요. ");
        }
        sc.close();


        /*실습문제2. */
        /* 판다가 숫자 뽑기를 통해 선물을 나눠주는 이벤트 부스에서 일합니다.*
         * "당첨 번호가 어떻게 되세요?"를 출력하여, 1~10 사이의 정수 한개를 입력받고,
         * 홀수인지 짝수인지 확인하고, 홀수이면 "홀수네요, 인형 선물입니다!", 홀수가 아니면 "짝수네요, 모자 선물입니다!"라고 출력하세요.
           단, 1~10 사이의 정수가 아닌 경우 "당첨 번호는 1~10 사이에만 있어요."를 출력하세요.*/


        System.out.println("당첨 번호가 어떻게 되세요? ");
        int luckyNum = sc.nextInt();

        if (luckyNum >= 1 && luckyNum <= 10) {
            if (luckyNum % 2 != 0) {
                System.out.println("홀수네요, 인형 선물입니다.!");
                if (luckyNum % 2 == 0) {
                    System.out.println("짝수네요, 모자 선물입니다. ");
                }
            }

        } else {
            System.out.println("당첨 번호는 1~10 사이에만 있어요.  ");

        }

        /* 실습문제2. 두번째 풀이
        *  System.out.println("당첨 번호가 어떻게 되세요? ");
        int luckyNum = sc.nextInt();

        if (luckyNum > 0 && luckyNum <= 10) {
            if (luckyNum % 2= 0) {
                System.out.println("홀수네요, 인형 선물입니다.!");
                else}
                    System.out.println("짝수네요, 모자 선물입니다. ");
                }
            }

        } else {
            System.out.println("당첨 번호는 1~10 사이에만 있어요.  ");*/

    }

    public void testExample6Statement() {
        /*실습문제 3. */
        /* 판다는 축제 부스에서 일한 뒤, 인사평가 점수를 받았습니다.
         * 성실, 서비스, 미소 점수를 입력받아
         * 평균 점수가 60점 이상이면서 각 항목이 40점 이상인 조건이 만족하면 "합격입니다!" 를 출력하세요,
           단, 합격이 아닌 경우 불합격 사유가 무엇인지를 모두 출력해 주어야 합니다.
           * 평균점수 미달인 경우 "평균점수 미달로 불합격입니다."라고 출력하고,
         * 항목당 과락 점수가 있는 경우 "xx 항목의 점수 미달로 불합격 입니다."를 출력하세요.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("성실 점수를 입력 해 주세요. ");
        int score1 = sc.nextInt();
        System.out.println("서비스 점수를 입력 해 주세요.");
        int score2 = sc.nextInt();
        System.out.println("미소 점수를 입력 해 주세요. ");
        int score3 = sc.nextInt();

        int total = score1 + score2 + score3;

        if (score1 < 40) {
            System.out.println("성실 점수 미달로 불합격 입니다.");
            return;
        } else if (score2 < 40) {
            System.out.println("서비스 점수 미달로 불합격 입니다.");
            return;

        } else if (score3 < 40) {
            System.out.println("미소 점수 미달로 불합격 입니다.");
            return;
        } else if (total / 3 < 60) {
            System.out.println("평균 점수 미달로 불합격 입니다. ");
            return;

        }
        System.out.println("합격입니다.");

        /* 실습문제 3 다른 풀이
        * Scanner sc = new Scanner(System.in);

        System.out.print("성실 점수 : ");
        int sincerity = sc.nextInt();

        System.out.print("서비스 점수 : ");
        int service = sc.nextInt();

        System.out.print("미소 점수 : ");
        int smile = sc.nextInt();

        int avg = (sincerity + service + smile) / 3;

        if(avg >= 60 && sincerity >= 40 && service >= 40 && smile >= 40) {
            System.out.println("합격입니다!");

        } else {
            if(avg < 60) {
                System.out.println("평균 점수 미달로 불합격 입니다.");
            }

            if(sincerity < 40) {
                System.out.println("성실 점수 미달로 불합격 입니다.");
            }

            if(service < 40) {
                System.out.println("서비스 점수 미달로 불합격 입니다");
            }

            if(smile < 40) {
                System.out.println("미소 점수 미달로 불합격 입니다");
            }
        }
        * */

    }

    /*실습문제 4.
    * 열심히 일한 판다가 급여를 계산해 보려고 합니다.
     * 월 급여액과 월 매출액을 입력받아 급여를 산정합니다.
     * 축제 운영 사원은 매출액 대비 보너스율에 명시된 보너스를, 급여 외에 추가로 지급받습니다.
     *
     * 단, 보너스율은 입력 받은 월 매출액에 비례하며,
     * 계산된 보너스 금액을 월 급여액에 더하여 총 급여를 계산합니다.
     *
     * 보너스율을 적용하여 출력 예시처럼 출력되도록 프로그램을 만들어 보세요.
     *
     * -- 총 급여 계산식 --
     * 총 급여 = 월 급여  + (매출액 * 보너스율)
     *
     * -- 매출액 대비 보너스율 --
     *   매출액       보너스율
     * 5천만원 이상      5%
     * 3천만원 이상      3%
     * 1천만원 이상      1%
     * 1천만원 미만      0%
     *
     * -- 입력 예시 --
     * 월 급여 입력 : 3000000
     * 매출액 입력 : 20000000
     *
     * -- 출력 예시 --
     * ======================
     * 매출액 : 20000000
     * 보너스율 : 1%
     * 월 급여 : 3000000
     * 보너스 금액 : 200000
     * ======================
     * 총 급여 : 3200000*/

    public void testExample7Statement(){

    Scanner sc = new Scanner(System.in);

        System.out.print("월 급여 입력 : ");
    int salary = sc.nextInt() ;

        System.out.print("월 매출액 입력 : ");
    int income = sc.nextInt();

    double bonusRate = 0;
    int totalSalary = 0;

        if(income >= 50000000) {
        bonusRate = 0.05;
    } else if(income >= 30000000) {
        bonusRate = 0.03;
    } else if(income >= 10000000) {
        bonusRate = 0.01;
    } else {
        bonusRate = 0;
    }

    totalSalary = salary + (int)(income * bonusRate);
        System.out.println("======================");
        System.out.println("매출액 : " + income);
        System.out.println("보너율 : " + (bonusRate * 100) + "%");
        System.out.println("월 급여 : " + salary);
        System.out.println("보너스 금액 : " + (int)(bonusRate * income));
        System.out.println("======================");
        System.out.println("총 급여 : " + totalSalary);
    }




}