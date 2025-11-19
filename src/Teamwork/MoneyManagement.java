package Teamwork;

import java.util.Scanner;

public class MoneyManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int currentMoney = 0;

        while(run) {
            System.out.println("------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("-------------------------");
            System.out.print("선택> ");

            String strNum = scanner.nextLine();

            if(strNum.equals("1")) {
                System.out.println("예금액>");
                String depositMoney = scanner.nextLine();
                currentMoney += Integer.parseInt(depositMoney);
                System.out.println("잔고> " + currentMoney);
            }
            else if(strNum.equals("2")) {
                System.out.println("출금액>");
                String withDrawMoney = scanner.nextLine();
                currentMoney -= Integer.parseInt(withDrawMoney);
                System.out.println("잔고> " + currentMoney);
            }
            else if(strNum.equals("3")) {
                System.out.println("잔고>" + currentMoney);
            }
            else if(strNum.equals("4")) {
                run = false;
            }
            else if(Integer.parseInt(strNum)>=5) {
                System.out.println("잘못된 숫자를 입력하셨습니다");
            }
        }
        System.out.println("프로그램 종료");

    }
}
