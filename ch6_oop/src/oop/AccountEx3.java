package oop;

import java.util.Scanner;

public class AccountEx3 {

    private static Account account[] = new Account[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            System.out.println("---------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("---------------------------------------------------");

            System.out.print("선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    break;

                default:
                    System.out.println("번호 확인");
                    break;
            }
        }
    }

    private static void createAccount() {
        System.out.print("계좌번호 : ");
        String ano = sc.nextLine();
        System.out.print("계좌주 : ");
        String owner = sc.nextLine();
        System.out.print("금액 : ");
        int balance = Integer.parseInt(sc.nextLine());
        // for : account[i] 첫번째 만나는 null이면

        for (int i = 0; i < account.length;) {
            if (account[i] == null) {
                account[i] = new Account(ano, owner, balance);
                System.out.println("계좌가 생성되었습니다.");
                // 루프 종료
                break;
            } else {
                i++;
            }
        }
        // 루프 종료; break;
    }

    private static void accountList() {
        System.out.println("----------------------------------------");
        System.out.println("계좌 목록");
        System.out.println("----------------------------------------");

        // System.out.printf("%s\t%s\t%d\n", account.getAno(), account.getOwner(),
        // account.getBalance());
        // 배열 출력(null이 아니면)
        // for (int i = 0; i < account.length; i++) {
        // if(account[i] == null){
        // break;
        // } else {
        // System.out.printf("%s\t%s\t%d\n", account[i].getAno(), account[i].getOwner(),
        // account[i].getBalance());
        // }
        // }
        for (Account acc : account) {
            if (acc != null) {
                System.out.printf("%s\t%s\t%d\n", acc.getAno(), acc.getOwner(), acc.getBalance());
            }
        }
    }

    private static void deposit() {
        // 예금하다
        // 계좌번호 입력받기
        System.out.println("계좌번호를 입력해주세요 : ");
        String ano = sc.nextLine();
        findAccount(ano);

        // 가지고 있는 account와 사용자가 입력한 계좌번호가 일치하는지 확인
        System.out.print("예금액 : ");
        int balance = Integer.parseInt(sc.nextLine());

        Account findAcc = findAccount(ano);
        if (findAcc != null) {
            findAcc.deposit(balance);
        }
    }

    private static void withdraw() {
        // 계좌번호 입력받기
        System.out.print("계좌번호를 입력해주세요 : ");
        String ano = sc.nextLine();
        System.out.print("출금액 입력 : ");
        int balance = Integer.parseInt(sc.nextLine());

        Account findAcc = findAccount(ano);
        if (findAcc != null) {
            findAcc.widthraw(balance);
        }
    }

    private static Account findAccount(String ano) {
        // 입력값 ano 와 account 배열 계좌 중에서 일치하는 계좌 찾기
        Account acc = null;
        for (int i = 0; i < account.length; i++) {
            if (account[i].getAno() == ano && account[i].getAno() != null) {
                return account[i];
                // break;
            }
            // if(account[i].getAno().equals(ano)){
            // acc = account[i];
            // break;
            // }

            // 널이 아니어야 하고 account[i].getAno() == ano break;
            // return account[i]
        }

        return null;
    }
}