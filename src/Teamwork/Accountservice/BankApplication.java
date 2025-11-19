package Teamwork.Accountservice;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountarray = new Account[100];
    private static int accountCount = 0; // accountcount = 현재 계좌 개수

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("---------------------");
            System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("---------------------");
            System.out.print("선택> ");

            String choice = sc.nextLine();

            switch (choice) { // 5(종료) 선택전까지 무한루프
                case "1": // 계좌생성
                    System.out.println("--------");
                    System.out.println(" 계좌생성 ");
                    System.out.println("--------");
                    createAccount();
                    break;
                case "2": // 계좌목록
                    System.out.println("--------");
                    System.out.println(" 계좌목록 ");
                    System.out.println("--------");
                    showaAccountList();
                    break;
                case "3": // 예금
                    System.out.println("--------");
                    System.out.println("예금     ");
                    System.out.println("--------");
                    accdeposit();
                    break;
                case "4": // 출금
                    System.out.println("--------");
                    System.out.println("출금     ");
                    System.out.println("--------");
                    accwithdraw();
                    break;
                case "5": // 종료
                    System.out.println("프로그램 종료");
                    return;
                default: // 1,2,3,4,5 외의 선택지
                    System.out.println("위의 선택지 중에 선택해주세요.");
            }
        }
    }

    private static void createAccount() {
        if (accountCount >= 100) {
            System.out.println("더 이상 계좌를 생성할 수 없습니다.");
        }
        else {
            System.out.print("계좌번호: ");
            String accountNumber = sc.nextLine();

            System.out.print("계좌주: ");
            String owner = sc.nextLine();

            System.out.print("초기입금액: ");
            String deposit = sc.nextLine();
            int balance = Integer.parseInt(deposit); // 입력된 문자열 int로 변환

            accountarray[accountCount] = new Account(accountNumber, owner, balance);
            accountCount++;

            System.out.println("결과: 계좌가 생성되었습니다.");

        }



    }

    private static void showaAccountList() {
        System.out.println("-------");
        System.out.println("계좌 목록");
        System.out.println("-------");

        for (int i = 0; i < accountCount; i++) {
            Account acc = accountarray[i];
            System.out.println(
                    acc.getAccountNumber() + " | " + acc.getOwner() + " | " + acc.getBalance()
            );
        }
    }

    // 계좌번호로 해당 계좌 객체 선택. 예금, 출금 메소드에서 사용
    public static Account selectAccount(String accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            Account acc = accountarray[i];
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null; // 맞는 계좌번호가 없으면 null
    }

    //예금 메소드
    private static void accdeposit() {
        System.out.print("계좌번호 : ");
        String AccountNumber = sc.nextLine();

        Account acc = selectAccount(AccountNumber);
        if (acc == null) {
            System.out.println("해당 계좌번호를 가진 계좌가 없습니다.");
            return;
        } else {
            System.out.print("입금액 : ");
            String amount = sc.nextLine();
            int money = Integer.parseInt(amount);

            acc.deposit(money);

        }
    }

    //예금 메소드
    private static void accwithdraw() {
        System.out.print("계좌번호 : ");
        String AccountNumber = sc.nextLine();

        Account acc = selectAccount(AccountNumber);
        if (acc == null) {
            System.out.println("해당 계좌번호를 가진 계좌가 없습니다.");
            return;
        } else {
            System.out.print("출금액 : ");
            String amount = sc.nextLine();
            int money = Integer.parseInt(amount);

            if(acc.getBalance() < money) {
                System.out.println("잔액보다 많이 출금할 수 없습니다.");
            }

            acc.withdraw(money);

        }
    }

}